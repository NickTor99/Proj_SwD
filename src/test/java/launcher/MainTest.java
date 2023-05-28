package launcher;

import nodes.ProgramOp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitors.CVisitor;
import visitors.ScopingVisitor;
import visitors.TypeVisitor;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    BufferedReader input;
    ProgramOp programOp;
    ScopingVisitor scopingVisitor;
    TypeVisitor typeVisitor;
    CVisitor cVisitor;
    String cFile = "src/test/java/cFileTest.c";
    String cOut;

    MainTest() throws FileNotFoundException {
        File initialFile = new File("src/test/java/systemTest.txt");
        InputStream in = new FileInputStream(initialFile);
        if(in == null){
            throw new Error("FILE DI TEST NON TROVATO!");
        }
        input = new BufferedReader(new InputStreamReader(in));
        scopingVisitor = new ScopingVisitor();
        typeVisitor = new TypeVisitor();
        cVisitor = new CVisitor();
        cOut = "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                "#include <string.h>\n" +
                "#include <math.h>\n" +
                "#include <malloc.h>\n" +
                "#define true 1\n" +
                "#define false 0\n" +
                "void inizio(int,char **);\n" +
                "void forTest();\n" +
                "int divIntera(float,float,char **);\n" +
                "int fibonacci(int);\n" +
                "float operazione(int,float,float);\n" +
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
                "#define setSize (int) (10 + costante)\n" +
                "int costante = 5;\n" +
                "#define var1 (int) (!((true && false)) || true)\n" +
                "char var2;\n" +
                "char var3;\n" +
                "#define var4 (char) \"c\"\n" +
                "char *menu = \"(1) somma di due numeri\\n(2) moltiplicazione di due numeri\\n(3) divisione intera tra due numeri\\n(4) elevamento a potenza\\n(5) succesione di fibonacci\\n\";\n" +
                "// MAIN FUNCTION\n" +
                "int main(int argc, char** argv){\n" +
                "inizio(0,argv);\n" +
                "return (EXIT_SUCCESS);\n" +
                "}\n" +
                "void inizio(int boh,char **ciao){\n" +
                "float num1 = 0.0;\n" +
                "float num2 = 0.0;\n" +
                "int num = 0;\n" +
                "int op;\n" +
                "char *ans = \"si\";\n" +
                "char *size = \"piccolo\";\n" +
                "while(!strcmp(ans,\"si\")){\n" +
                "printf(\"%s\",\"Scegli che operazione fare inserendo il numero corrispondente:\\n\");\n" +
                "printf(\"%s\",menu);\n" +
                "printf(\"\\n\");\n" +
                "scanf(\"%d\",&op);\n" +
                "if(((((op == 1) || (op == 2)) || (op == 3)) || (op == 4))){\n" +
                "printf(\"inserisci in primo numero \");\n" +
                "scanf(\"%f\",&num1);\n" +
                "printf(\"inserisci il secondo numero \");\n" +
                "scanf(\"%f\",&num2);\n" +
                "if((op == 3)){\n" +
                "printf(\"%s\",\"il risultato e': \");\n" +
                "printf(\"%d\",divIntera(num1,num2,&size));\n" +
                "printf(\"%s\",concat(concat(\", un numero \",size),\"!\"));\n" +
                "printf(\"\\n\");\n" +
                "}\n" +
                "else{\n" +
                "printf(\"%s\",\"il risultato e': \");\n" +
                "printf(\"%f\",operazione(op,num1,num2));\n" +
                "printf(\"\\n\");\n" +
                "}\n" +
                "}\n" +
                "else{\n" +
                "if((op == 5)){\n" +
                "printf(\"inserisci un numero intero positivo \");\n" +
                "scanf(\"%d\",&num);\n" +
                "while((num < 0)){\n" +
                "printf(\"il numero deve essere positivo! Prova ad inserirlo di nuovo \");\n" +
                "scanf(\"%d\",&num);\n" +
                "}\n" +
                "printf(\"%s\",\"il risultato e': \");\n" +
                "printf(\"%d\",fibonacci(num));\n" +
                "printf(\"\\n\");\n" +
                "}\n" +
                "else{\n" +
                "printf(\"%s\",\"hai inserito un numero sbagliato!\");\n" +
                "printf(\"\\n\");\n" +
                "}\n" +
                "}\n" +
                "printf(\"vuoi continuare? (si/no)\");\n" +
                "ans = malloc(256);\n" +
                "scanf(\"%s\",ans);\n" +
                "}\n" +
                "printf(\"%s\",\"Arrivederci :)\");\n" +
                "}\n" +
                "void forTest(){\n" +
                "int i;\n" +
                "for(i = 0;i <= 5;i++){\n" +
                "if((i <= 2)){\n" +
                "if((setSize != 5)){\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "int divIntera(float a,float b,char **size){\n" +
                "int result = (a / b);\n" +
                "if((result >= setSize)){\n" +
                "*size = \"grande\";\n" +
                "}\n" +
                "return result;\n" +
                "}\n" +
                "int fibonacci(int a){\n" +
                "int risultato = 0;\n" +
                "if((a == 0)){\n" +
                "return 0;\n" +
                "}\n" +
                "if((a == 1)){\n" +
                "return 1;\n" +
                "}\n" +
                "return (fibonacci((a - 1)) + fibonacci((a - 2)));\n" +
                "}\n" +
                "float operazione(int op,float a,float b){\n" +
                "if((op == 1)){\n" +
                "return (a + b);\n" +
                "}\n" +
                "if((op == 2)){\n" +
                "float result = 0.0;\n" +
                "while((a >= 1)){\n" +
                "a = (a - 1);\n" +
                "result = (result + b);\n" +
                "}\n" +
                "return (result + (a * b));\n" +
                "}\n" +
                "if((op == 4)){\n" +
                "return pow((float)(a), (float)(b));\n" +
                "}\n" +
                "}\n";
    }

    // integration test, testing every component in cascade
    @Test
    void main() {

        // generation of tokens by the Lexer that reads the input file
        Lexer tokens = new Lexer(input);

        // generation of the syntax tree by the Parser that reads the tokens
        parser p = new parser(tokens);
        try{
            programOp = (ProgramOp) p.parse().value;

        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        // generation of scopes
        scopingVisitor.visit(programOp);

        // checking the typing of every node
        typeVisitor.visit(programOp);

        // generation of the c code
        String code = cVisitor.visit(programOp);
        fileGenerator(code,cFile);

        assertEquals(cOut,code);

        int exitCode = 99;
        // compiling the .c file into an executable
        Runtime rt = Runtime.getRuntime();
        String cCompilerCmd = "gcc "+cFile;
        try {
            Process compileProcess = rt.exec(cCompilerCmd);
            exitCode = compileProcess.waitFor();
        } catch (IOException e) {
            System.out.println("Errore durante l'esecuzione del comando di compilazione.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Interrupted durante l'attesa del completamento della compilazione.");
            e.printStackTrace();
        }
        assertEquals(0,exitCode);

    }

    private static void fileGenerator(String txt,String filePath){
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            fw.write(txt);
            fw.flush();
            fw.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}



