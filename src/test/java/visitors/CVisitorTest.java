package visitors;

import exceptions.UndeclaredVariableException;
import launcher.sym;
import nodes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.SymbolRecord;
import table.SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CVisitorTest {

    CVisitor cVisitor;
    TypeVisitor typeVisitor;
    ScopingVisitor scopingVisitor;
    SymbolTable symbolTable;

    CVisitorTest(){
        cVisitor = new CVisitor();
        typeVisitor = new TypeVisitor();
        scopingVisitor = new ScopingVisitor();
        symbolTable = new SymbolTable("testScope");
        symbolTable.put("id1",new SymbolRecord("id1","var",sym.CHAR));
        symbolTable.put("id2",new SymbolRecord("id2","var",sym.CHAR));
        symbolTable.put("idStr",new SymbolRecord("idStr","var",sym.STRING));
        symbolTable.put("idInt",new SymbolRecord("idInt","var",sym.INTEGER));
        symbolTable.put("idBool",new SymbolRecord("idBool","var",sym.BOOL));
        symbolTable.put("idReal",new SymbolRecord("idReal","var",sym.REAL));
        Stack<SymbolTable> activeStackScope = new Stack<>();
        activeStackScope.push(symbolTable);
        cVisitor.setActiveStackScope(activeStackScope);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void visitProgranOp(){
        String output = "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                "#include <string.h>\n" +
                "#include <math.h>\n" +
                "#include <malloc.h>\n" +
                "#define true 1\n" +
                "#define false 0\n" +
                "void test(int,char **,float,int,char);\n" +
                "char* intToString(int var){\n" +
                "char *int_str = malloc(256) ;\n" +
                "sprintf(int_str, \"%d\", var);\n" +
                "return int_str;\n" +
                "}\n" +
                "char* doubleToString(double var){\n" +
                "char *double_str= malloc(256);\n" +
                "sprintf(double_str, \"%f\", var);\n" +
                "return double_str;\n" +
                "}\n" +
                "char* boolToString(int var){\n" +
                "if(var == 1){\n" +
                "return \"true\";\n" +
                "}\n" +
                "if(var == 0){\n" +
                "return \"false\";\n" +
                "}\n" +
                "return \"\";\n" +
                "}\n" +
                "char* concat(char *s1, char* i) {\n" +
                "char* s = malloc(256);\n" +
                "sprintf(s, \"%s%s\", s1, i);\n" +
                "return s;\n" +
                "}\n" +
                "int v3;\n" +
                "char v2;\n" +
                "char *string2 = \"Hello World\";\n" +
                "char *string;\n" +
                "#define v1 (float) 5.3\n" +
                "int v0 = 100;\n" +
                "// MAIN FUNCTION\n" +
                "int main(int argc, char** argv){\n" +
                "test(0,argv,0.0,false,'');\n" +
                "return (EXIT_SUCCESS);\n" +
                "}\n" +
                "void test(int par1,char **outPar,float par2,int par3,char par4){\n" +
                "}\n";
        // valid programOp build
        ArrayList<AbstractSyntaxNode> varDeclList1 = new ArrayList<>();
        ArrayList<AbstractSyntaxNode> varDeclList2 = new ArrayList<>();
        // checking the correct generation of global variables
        VarDeclOp var1 = new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","v0"),null,new ConstExprNode("INTEGER_CONST","100")));
        varDeclList1.add(var1);
        VarDeclOp var2 = new VarDeclOp("REAL",new IdInit(new IdExprNode("ID","v1"),new ConstExprNode("REAL_CONST","5.3"),null));
        varDeclList1.add(var2);
        VarDeclOp var3 = new VarDeclOp("CHAR",new IdInit(new IdExprNode("ID","v2"),null,null));
        varDeclList2.add(var3);
        VarDeclOp var4 = new VarDeclOp("BOOL",new IdInit(new IdExprNode("ID","v3"),null,null));
        varDeclList2.add(var4);
        VarDeclOp var5 = new VarDeclOp("STRING",new IdInit(new IdExprNode("ID","string"),null,null));
        varDeclList1.add(var5);
        VarDeclOp var6 = new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","string2"),null,new ConstExprNode("STRING_CONST","Hello World")));
        varDeclList1.add(var6);
        // checking the correct generation of the function
        ArrayList<ParDeclOp> parDeclList = new ArrayList<>();
        parDeclList.add(new ParDeclOp("IN","INTEGER",new IdInit(new IdExprNode("ID","par1"),null,null)));
        parDeclList.add(new ParDeclOp("OUT","STRING",new IdInit(new IdExprNode("ID","outPar"),null,null)));
        parDeclList.add(new ParDeclOp("IN","REAL",new IdInit(new IdExprNode("ID","par2"),null,null)));
        parDeclList.add(new ParDeclOp("IN","BOOL",new IdInit(new IdExprNode("ID","par3"),null,null)));
        parDeclList.add(new ParDeclOp("IN","CHAR",new IdInit(new IdExprNode("ID","par4"),null,null)));
        BodyOp body = new BodyOp(new ArrayList<>(),new ArrayList<>());
        IsMainFunOp mainFun = new IsMainFunOp(true,new FunOp(new IdExprNode("ID","test"),parDeclList,"VOID",body));

        ProgramOp programOp = new ProgramOp(varDeclList1,mainFun,varDeclList2);
        scopingVisitor.visit(programOp);
        typeVisitor.visit(programOp);
        assertEquals(output,cVisitor.visit(programOp));

        varDeclList1.clear();
        VarDeclOp var7 = new VarDeclOp("STRING",new IdInit(new IdExprNode("ID","string1"),new BiExprNode("STR_CONCAT",new ConstExprNode("STRING_CONST","Hello"),new ConstExprNode("STRING_CONST"," World")),null));
        varDeclList1.add(var7);
        ProgramOp programOp2 = new ProgramOp(varDeclList1,mainFun,new ArrayList<>());
        scopingVisitor.visit(programOp2);
        typeVisitor.visit(programOp2);
        cVisitor = new CVisitor();
        assertThrows(Error.class,() -> cVisitor.visit(programOp2));
    }

    @Test
    void visitVarDeclOp(){
        cVisitor.setGlobalVarDecl(false);
        ArrayList<IdInit> idList = new ArrayList<>();
        IdExprNode id1 = new IdExprNode("ID","var1");
        IdExprNode id2 = new IdExprNode("ID","var2");
        id1.setType(sym.STRING);
        id2.setType(sym.STRING);
        idList.add(new IdInit(id1,null,new ConstExprNode("STRING_CONST","Hello")));
        idList.add(new IdInit(id2,null,new ConstExprNode("STRING_CONST"," World")));
        VarDeclOp varDecl1 = new VarDeclOp("VAR",idList);
        assertEquals("char *var1 = \"Hello\";\nchar *var2 = \" World\";\n",cVisitor.visit(varDecl1));

        IdExprNode id3 = new IdExprNode("ID","var3");
        id3.setType(sym.STRING);
        VarDeclOp varDecl2 = new VarDeclOp("STRING",new IdInit(id3,null,null));
        assertEquals("char *var3 = \"\";\n",cVisitor.visit(varDecl2));

        IdExprNode id4 = new IdExprNode("ID","var4");
        id4.setType(sym.BOOL);
        VarDeclOp varDecl3 = new VarDeclOp("BOOL",new IdInit(id4,new ConstExprNode("BOOL","true"),null));
        assertEquals("int var4 = true;\n",cVisitor.visit(varDecl3));

        IdExprNode id5 = new IdExprNode("ID","var5");
        id5.setType(sym.REAL);
        VarDeclOp varDecl4 = new VarDeclOp("VAR",new IdInit(id5,null,new ConstExprNode("REAL_CONST","9.99")));
        assertEquals("float var5 = 9.99;\n",cVisitor.visit(varDecl4));
    }

    @Test
    void visitIsMainFunOp(){
        ArrayList<ParDeclOp> parDeclList = new ArrayList<>();
        ParDeclOp par1 = new ParDeclOp("IN","CHAR",new IdInit(new IdExprNode("ID","par1"),null,null));
        ParDeclOp par2 = new ParDeclOp("IN","REAL",new IdInit(new IdExprNode("ID","par2"),null,null));
        ParDeclOp par3 = new ParDeclOp("IN","BOOL",new IdInit(new IdExprNode("ID","par3"),null,null));
        parDeclList.add(par1);
        parDeclList.add(par2);
        parDeclList.add(par3);
        ReturnStatOp rtrn = new ReturnStatOp("RETURN",new ConstExprNode("STRING_CONST","ciao"));
        ArrayList<StatOp> stat = new ArrayList<>();
        stat.add(rtrn);
        BodyOp body = new BodyOp(new ArrayList<>(),stat);
        IsMainFunOp mainFun = new IsMainFunOp(false,new FunOp(new IdExprNode("ID","test"),parDeclList,"VOID",body));
        par1.setType(sym.CHAR);
        par2.setType(sym.REAL);
        par3.setType(sym.BOOL);
        assertEquals("void test(char par1,float par2,int par3){\n" +
                "return \"ciao\";\n" +
                "}\n",cVisitor.visit(mainFun));
    }

    @Test
    void visitBodyOp(){
        String output = "float v1;\n" +
                "float v2 = 2.2;\n" +
                "while(true){\n" +
                "}\n" +
                "int i;\n" +
                "for(i = 0;i <= 5;i++){\n" +
                "}\n" +
                "if(true){\n" +
                "}\nelse{\n" +
                "}\n";
        cVisitor.setGlobalVarDecl(false);
        // creating var daclaration list of the body
        ArrayList<VarDeclOp> varDeclList = new ArrayList<>();
        IdExprNode var1 = new IdExprNode("ID","v1");
        var1.setType(sym.REAL);
        IdExprNode var2 = new IdExprNode("ID","v2");
        var2.setType(sym.REAL);
        varDeclList.add(new VarDeclOp("REAL",new IdInit(var2,new ConstExprNode("REAL_CONST","2.2"),null)));
        varDeclList.add(new VarDeclOp("REAL",new IdInit(var1,null,null)));
        // creating statment list of the body
        ArrayList<StatOp> statList = new ArrayList<>();
        statList.add(new IfStatOp("IF",new ConstExprNode("BOOL","true"),new BodyOp(new ArrayList<>(),new ArrayList<>()),new BodyOp(new ArrayList<>(),new ArrayList<>())));
        ForStatOp forOp = new ForStatOp("FOR",new IdExprNode("ID","i"),new ConstExprNode("INTEGER_CONST","0"),new ConstExprNode("INTEGER_CONST","5"),new BodyOp(new ArrayList<>(),new ArrayList<>()));
        statList.add(forOp);
        SymbolTable forTable = new SymbolTable("FOR");
        forTable.put("i",new SymbolRecord("i","var",sym.INTEGER));
        forOp.setSymbolTable(forTable);
        statList.add(new WhileOp("WHILE",new ConstExprNode("BOOL","true"),new BodyOp(new ArrayList<>(),new ArrayList<>())));
        BodyOp body = new BodyOp(varDeclList,statList);

        assertEquals(output,cVisitor.visit(body));
    }

    @Test
    void visitAssignOp(){
        // assign with 1 expr
        ArrayList<IdInit> idList = new ArrayList<>();
        ArrayList<ExprNode> exprList = new ArrayList<>();
        IdExprNode id1 = new IdExprNode("ID","id1");
        IdExprNode id2 = new IdExprNode("ID","id2");
        id1.setType(sym.CHAR);
        id2.setType(sym.CHAR);
        idList.add(new IdInit(id1,null,null));
        idList.add(new IdInit(id2,null,null));
        exprList.add(new ConstExprNode("CHAR_CONST","a"));
        AssignOp assign = new AssignOp("ASSIGN",idList,exprList);
        assertEquals("id1 = \"a\";\nid2 = \"a\";\n",cVisitor.visit(assign));

        // assign with more than 1 expr
        exprList.add(new ConstExprNode("CHAR_CONST","b"));
        assertEquals("id1 = \"a\";\nid2 = \"b\";\n",cVisitor.visit(assign));

        symbolTable.put("pointer",new SymbolRecord("pointer","var",sym.STRING,true));
        IdExprNode pointer = new IdExprNode("ID","pointer");
        pointer.setType(sym.STRING);
        idList.clear();
        idList.add(new IdInit(pointer,null,null));
        exprList.clear();
        exprList.add(new ConstExprNode("STRING_CONST","Hello World"));
        assign = new AssignOp("ASSIGN",idList,exprList);
        assertEquals("*pointer = \"Hello World\";\n",cVisitor.visit(assign));
    }

    @Test
    void visitWriteOp(){
        ArrayList<ExprNode> exprList = new ArrayList<>();
        IdExprNode id1 = new IdExprNode("ID","id1");
        IdExprNode id2 = new IdExprNode("ID","id2");
        id1.setType(sym.CHAR);
        id2.setType(sym.CHAR);
        exprList.add(id1);
        exprList.add(id2);
        WriteOp write = new WriteOp("WRITE","WRITE",exprList);
        WriteOp writeln = new WriteOp("WRITELN","WRITELN",exprList);

        assertEquals("printf(\"%c\",id2);\n" +
                "printf(\"%c\",id1);\n",cVisitor.visit(write));
        assertEquals("printf(\"%c\",id1);\n" +
                "printf(\"%c\",id2);\n" +
                "printf(\"\\n\");\n",cVisitor.visit(writeln));

        // testing the athers scanf formats
        IdExprNode idStr = new IdExprNode("ID","idStr");
        IdExprNode idInt = new IdExprNode("ID","idInt");
        IdExprNode idBool = new IdExprNode("ID","idBool");
        IdExprNode idReal = new IdExprNode("ID","idReal");
        idStr.setType(sym.STRING);
        idInt.setType(sym.INTEGER);
        idBool.setType(sym.BOOL);
        idReal.setType(sym.REAL);
        exprList.clear();
        exprList.add(idStr);
        exprList.add(idInt);
        exprList.add(idBool);
        exprList.add(idReal);
        write = new WriteOp("WRITE","WRITE",exprList);
        assertEquals("printf(\"%f\",idReal);\n" +
                "printf(\"%d\",idBool);\n" +
                "printf(\"%d\",idInt);\n" +
                "printf(\"%s\",idStr);\n",cVisitor.visit(write));

        idReal.setType(sym.VOID);
        WriteOp finalWrite = new WriteOp("WRITE","WRITE",exprList);
        assertThrows(Error.class,() -> cVisitor.visit(finalWrite));

        // testing undeclared variable
        IdExprNode idNotDecl = new IdExprNode("ID","idNotDecl");
        idNotDecl.setType(sym.STRING);
        exprList.clear();
        exprList.add(idNotDecl);
        WriteOp write2 = new WriteOp("WRITE","WRITE",exprList);
        assertThrows(UndeclaredVariableException.class,() -> cVisitor.visit(write2));
    }

    @Test
    void visitReadOp(){
        ArrayList<IdInit> idList = new ArrayList<>();
        IdExprNode id1 = new IdExprNode("ID","id1");
        IdExprNode id2 = new IdExprNode("ID","id2");
        IdExprNode id3 = new IdExprNode("ID","idStr");
        id1.setType(sym.CHAR);
        id2.setType(sym.CHAR);
        id3.setType(sym.STRING);
        IdInit idInit1 = new IdInit(id1,null,null);
        IdInit idInit2 = new IdInit(id2,null,null);
        IdInit idInit3 = new IdInit(id3,null,null);
        idList.add(idInit1);
        idList.add(idInit2);
        idList.add(idInit3);
        ConstExprNode str = new ConstExprNode("STRING_CONST","inserisci 2 caratteri");
        str.setType(sym.STRING);
        ReadOp read = new ReadOp("READ",idList,str);
        assertEquals("printf(\"inserisci 2 caratteri\");\n" +
                "scanf(\"%c\",&id1);\n" +
                "scanf(\"%c\",&id2);\n" +
                "idStr = malloc(256);\n" +
                "scanf(\"%s\",idStr);\n",cVisitor.visit(read));
    }

    @Test
    void visitBiExprNode(){
        IdExprNode id1 = new IdExprNode("ID","id1");
        IdExprNode id2 = new IdExprNode("ID","id2");
        id1.setType(sym.CHAR);
        id2.setType(sym.CHAR);
        BiExprNode biExpr;

        biExpr = new BiExprNode("EQ",id1,id2);
        assertEquals("!strcmp(id1,id2)",cVisitor.visit(biExpr));

        biExpr = new BiExprNode("NE",id1,id2);
        assertEquals("strcmp(id1,id2)",cVisitor.visit(biExpr));

        biExpr = new BiExprNode("STR_CONCAT",id1,id2);
        assertEquals("concat(id1,id2)",cVisitor.visit(biExpr));

        ConstExprNode intConst1 = new ConstExprNode("INTEGER_CONST","10");
        ConstExprNode intConst2 =new ConstExprNode("REAL_CONST","20");
        intConst1.setType(sym.INTEGER);
        intConst2.setType(sym.INTEGER);

        biExpr = new BiExprNode("POW", intConst1, intConst2);
        assertEquals("pow((float)(10), (float)(20))",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("PLUS", intConst1, intConst2);
        assertEquals("(10 + 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("TIMES", intConst1, intConst2);
        assertEquals("(10 * 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("MINUS", intConst1, intConst2);
        assertEquals("(10 - 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("DIV", intConst1, intConst2);
        assertEquals("(10 / 20)",cVisitor.visit(biExpr));

        biExpr = new BiExprNode("GT", intConst1, intConst2);
        assertEquals("(10 > 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("GE", intConst1, intConst2);
        assertEquals("(10 >= 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("LT", intConst1, intConst2);
        assertEquals("(10 < 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("LE", intConst1, intConst2);
        assertEquals("(10 <= 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("EQ", intConst1, intConst2);
        assertEquals("(10 == 20)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("NE", intConst1, intConst2);
        assertEquals("(10 != 20)",cVisitor.visit(biExpr));

        ConstExprNode boolConst1 = new ConstExprNode("BOOL","true");
        ConstExprNode boolConst2 =new ConstExprNode("BOOL","false");
        boolConst1.setType(sym.BOOL);
        boolConst2.setType(sym.BOOL);

        biExpr = new BiExprNode("AND", boolConst1, boolConst2);
        assertEquals("(true && false)",cVisitor.visit(biExpr));
        biExpr = new BiExprNode("OR", boolConst1, boolConst2);
        assertEquals("(true || false)",cVisitor.visit(biExpr));
    }

    @Test
    void visitUnExprNode(){
        ConstExprNode boolConst = new ConstExprNode("BOOL","true");
        boolConst.setType(sym.BOOL);
        ConstExprNode intConst = new ConstExprNode("INTEGER_CONST","10");
        intConst.setType(sym.INTEGER);
        UnExprNode unExpr;

        unExpr = new UnExprNode("MINUS",intConst);
        assertEquals("10 * (-1)",cVisitor.visit(unExpr));
        unExpr = new UnExprNode("NOT",boolConst);
        assertEquals("!(true)",cVisitor.visit(unExpr));
    }

    @Test
    void visitCallFunOp(){
        // testing function call with parameters
        CallParamOp callPar1 = new CallParamOp(new ConstExprNode("INTEGER_CONST","32"),false);
        CallParamOp callPar2 = new CallParamOp(new IdExprNode("ID","id1"),true);
        ArrayList<CallParamOp> parList = new ArrayList<>();
        parList.add(callPar1);
        parList.add(callPar2);
        CallFunOp callFun = new CallFunOp("CALLFUN",new IdExprNode("ID","callTest"),parList);
        assertEquals("callTest(&id1,32);\n",cVisitor.visit(callFun));

        // testing function call as an expression
        Collections.reverse(parList);
        callFun.setExpr(true);
        assertEquals("callTest(&id1,32)",cVisitor.visit(callFun));

        // testing function call without parameters
        CallFunOp callFunNoPar = new CallFunOp("CALLFUN",new IdExprNode("ID","callTestNoPar"),null);
        assertEquals("callTestNoPar();\n",cVisitor.visit(callFunNoPar));

    }

    @Test
    void testExprStringConverter(){
        ConstExprNode strConst1 = new ConstExprNode("STRING_CONST","Hello ");
        ConstExprNode strConst2 =new ConstExprNode("STRING_CONST","World");
        strConst1.setType(sym.STRING);
        strConst2.setType(sym.STRING);
        ConstExprNode intConst1 = new ConstExprNode("INTEGER_CONST","10");
        ConstExprNode intConst2 =new ConstExprNode("REAL_CONST","20.5");
        intConst1.setType(sym.INTEGER);
        intConst2.setType(sym.INTEGER);
        ConstExprNode charConst =new ConstExprNode("CHAR_CONST","c");
        charConst.setType(sym.CHAR);

        BiExprNode biExpr = new BiExprNode("STR_CONCAT",strConst1,strConst2);
        assertEquals("concat(\"Hello \",\"World\")",cVisitor.exprStringConverter(biExpr));

        biExpr = new BiExprNode("POW",intConst1,intConst2);
        assertEquals("pow((float)(10), (float)(20.5))",cVisitor.exprStringConverter(biExpr));

        biExpr = new BiExprNode("PLUS",intConst1,intConst2);
        assertEquals("\"(10 + 20.5)\"",cVisitor.exprStringConverter(biExpr));

        assertEquals("\"Hello \"",cVisitor.exprStringConverter(strConst1));
        assertEquals("\"c\"",cVisitor.exprStringConverter(charConst));

        UnExprNode unExpr = new UnExprNode("MINUS",intConst1);
        assertEquals("\"10 * (-1)\"",cVisitor.exprStringConverter(unExpr));

        IdExprNode idStr = new IdExprNode("ID","idStr");
        IdExprNode idInt = new IdExprNode("ID","idInt");
        IdExprNode idBool = new IdExprNode("ID","idBool");
        IdExprNode idReal = new IdExprNode("ID","idReal");
        idStr.setType(sym.STRING);
        idInt.setType(sym.INTEGER);
        idBool.setType(sym.BOOL);
        idReal.setType(sym.REAL);
        assertEquals("idStr",cVisitor.exprStringConverter(idStr));
        assertEquals("intToString(idInt)",cVisitor.exprStringConverter(idInt));
        assertEquals("boolToString(idBool)",cVisitor.exprStringConverter(idBool));
        assertEquals("doubleToString(idReal)",cVisitor.exprStringConverter(idReal));
    }

}