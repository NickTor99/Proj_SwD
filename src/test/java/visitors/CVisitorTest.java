package visitors;

import launcher.sym;
import nodes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.SymbolRecord;
import table.SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CVisitorTest {

    CVisitor cVisitor;
    TypeVisitor typeVisitor;
    ScopingVisitor scopingVisitor;

    CVisitorTest(){
        cVisitor = new CVisitor();
        typeVisitor = new TypeVisitor();
        scopingVisitor = new ScopingVisitor();
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
                "void test(int,char **);\n" +
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
                "char *string2 = \"Hello \";\n" +
                "char *string = \"Hello World\";\n" +
                "#define v1 (float) 5.3\n" +
                "int v0 = 100;\n" +
                "// MAIN FUNCTION\n" +
                "int main(int argc, char** argv){\n" +
                "test(0,\"\");\n" +
                "return (EXIT_SUCCESS);\n" +
                "}\n" +
                "void test(int param,char **outPar){\n" +
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
        VarDeclOp var5 = new VarDeclOp("STRING",new IdInit(new IdExprNode("ID","string"),new ConstExprNode("STRING_CONST","Hello World"),null));
        varDeclList1.add(var5);
        VarDeclOp var6 = new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","string2"),null,new ConstExprNode("STRING_CONST","Hello ")));
        varDeclList1.add(var6);
        // checking the correct generation of the function
        ArrayList<ParDeclOp> parDeclList = new ArrayList<>();
        parDeclList.add(new ParDeclOp("IN","INTEGER",new IdInit(new IdExprNode("ID","param"),null,null)));
        parDeclList.add(new ParDeclOp("OUT","STRING",new IdInit(new IdExprNode("ID","outPar"),null,null)));
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
        idList.add(new IdInit(id2,null,new ConstExprNode("STRING_CONST","World")));
        VarDeclOp varDecl1 = new VarDeclOp("VAR",idList);
        assertEquals("char *var1 = \"Hello\";\nchar *var2 = \"World\";\n",cVisitor.visit(varDecl1));

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
        BodyOp body = new BodyOp(new ArrayList<>(),new ArrayList<>());
        IsMainFunOp mainFun = new IsMainFunOp(false,new FunOp(new IdExprNode("ID","test"),parDeclList,"VOID",body));
        par1.setType(sym.CHAR);
        par2.setType(sym.REAL);
        par3.setType(sym.BOOL);
        assertEquals("void test(char par1,float par2,int par3){\n}\n",cVisitor.visit(mainFun));
    }

    @Test
    void visitBodyOp(){
        String output = "float v1;\n" +
                "float v2;\n" +
                "while(true){\n" +
                "}\n" +
                "int i;\n" +
                "for(i = 0;i <= 5;i++){\n" +
                "}\n" +
                "if(true){\n" +
                "}\n";
        // creating symboltable for the body
        cVisitor.setGlobalVarDecl(false);
        SymbolTable symbolTable = new SymbolTable("testScope");
        symbolTable.put("v1",new SymbolRecord("v1","var",sym.REAL));
        symbolTable.put("v2",new SymbolRecord("v2","var",sym.REAL));
        Stack<SymbolTable> activeStackScope = new Stack<>();
        activeStackScope.push(symbolTable);
        typeVisitor.setActiveStackScope(activeStackScope);
        // creating var daclaration list of the body
        ArrayList<VarDeclOp> varDeclList = new ArrayList<>();
        IdExprNode var1 = new IdExprNode("ID","v1");
        var1.setType(sym.REAL);
        IdExprNode var2 = new IdExprNode("ID","v2");
        var2.setType(sym.REAL);
        varDeclList.add(new VarDeclOp("REAL",new IdInit(var2,null,new ConstExprNode("REAL_CONST","2.2"))));
        varDeclList.add(new VarDeclOp("REAL",new IdInit(var1,null,null)));
        // creating statment list of the body
        ArrayList<StatOp> statList = new ArrayList<>();
        statList.add(new IfStatOp("IF",new ConstExprNode("BOOL","true"),new BodyOp(new ArrayList<>(),new ArrayList<>()),null));
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
    void typeConverter() {
    }
}