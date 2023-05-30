package launcher;

import nodes.*;
import visitors.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) throws Exception {
        // reading the file that has to be compiled from the args
        String txt = args[0].split("/")[args[0].split("/").length-1];
        String fileName = txt.substring(0,txt.length()-4);
        File initialFile = new File(args[0]);
        InputStream in = new FileInputStream(initialFile);
        if(in == null){
            throw new Error("FILE NOT FOUND!");
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        String cOutPath = "C_out/"+ fileName +".c";


        System.out.println(GREEN+"Starting compiling "+fileName+"..."+GREEN+RESET);
        parser p = new parser(new Lexer(input));
        System.out.println("Parsing process done!");
        ProgramOp programOp = (ProgramOp) p.parse().value;

        ScopingVisitor scopeVisitor = new ScopingVisitor();
        scopeVisitor.visit(programOp);
        TypeVisitor typeCheckerVisitor = new TypeVisitor();
        System.out.println("Semantic analysis done!");
        typeCheckerVisitor.visit(programOp);

        CVisitorNew cGenerator = new CVisitorNew();
        String cCode = cGenerator.visit(programOp);
        System.out.println("C code generation done!");
        fileGenerator(cCode,cOutPath);

        System.out.println("Starting C compiler...");
        Runtime rt = Runtime.getRuntime();
        String cCompilerCmd = "gcc -o executables/" + fileName + " " + cOutPath + " -lm";
        try {
            Process compileProcess = rt.exec(cCompilerCmd);
            int exitCode = compileProcess.waitFor();
            if (exitCode == 0) {
                System.out.println("GCC compilation completed successfully");
                System.out.println(fileName+".exe successfully created" );
            } else {
                System.err.println("Something went wrong while compiling with GCC");
            }
        } catch (IOException e) {
            System.err.println("Error executing GCC build command");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for the build to finish.");
            e.printStackTrace();
        }
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
