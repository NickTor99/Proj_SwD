package visitors;

import launcher.sym;
import nodes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    void visit() {
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
        VarDeclOp var6 = new VarDeclOp("STRING",new IdInit(new IdExprNode("ID","string1"),new BiExprNode("STR_CONCAT",new ConstExprNode("STRING_CONST","Hello"),new ConstExprNode("STRING_CONST"," World")),null));
        varDeclList1.add(var6);
        ProgramOp programOp2 = new ProgramOp(varDeclList1,mainFun,new ArrayList<>());
        scopingVisitor.visit(programOp2);
        typeVisitor.visit(programOp2);
        cVisitor = new CVisitor();
        assertThrows(Error.class,() -> cVisitor.visit(programOp2));
    }

    @Test
    void typeConverter() {
    }
}