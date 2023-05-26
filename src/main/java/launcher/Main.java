package launcher;

import nodes.*;
import visitors.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        File initialFile = new File("test_files/test.txt");
        InputStream in = new FileInputStream(initialFile);
        if(in == null){
            throw new Error("FILE NON TROVATO!");
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        String nomeFile = "test.txt";
        String cGenerated = "test_files/c_out/"+nomeFile.substring(0,nomeFile.length()-4)+".c";

        parser p = new parser(new Lexer(input));
        System.out.println("Parsing process done!");
        ProgramOp programOp = (ProgramOp) p.parse().value;

        ScopingVisitor scopeVisitor = new ScopingVisitor();
        scopeVisitor.visit(programOp);
        //printScopes(programOp); // stampo le symbol table di ogni scope per testare il corretto funzionamento della visita
        TypeVisitor typeCheckerVisitor = new TypeVisitor();
        System.out.println("Semantic analysis done!");
        typeCheckerVisitor.visit(programOp);

        CVisitor cGenerator = new CVisitor();
        String cCode = cGenerator.visit(programOp);
        System.out.println("C code generation done!");
        fileGenerator(cCode,cGenerated);

        Runtime rt = Runtime.getRuntime();
        String cCompilerCmd = "gcc "+cGenerated;
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

    private static void printScopes(ProgramOp programOp){
        System.out.println(programOp.getSymbolTable().getNomeScope()+" scope="+programOp.getSymbolTable()+"\n");
        ArrayList<IsMainFunOp> funList = programOp.getFunList();
        for(IsMainFunOp fun : funList){
            System.out.println(fun.getFunOp().getSymbolTable().getNomeScope()+" scope="+fun.getFunOp().getSymbolTable()+"\n");
            ArrayList<StatOp> statList = fun.getFunOp().getBody().getStatList();
            System.out.println(scorriStat(statList));
        }
    }

    private static String scorriStat(ArrayList<StatOp> statList){
        String str = "";
        for(StatOp stat : statList){
            if(stat instanceof ForStatOp){
                if(((ForStatOp) stat).getBody().getStatList() != null){
                    str += scorriStat(((ForStatOp) stat).getBody().getStatList());
                }
                return str+((ForStatOp) stat).getSymbolTable().getNomeScope()+" scope="+((ForStatOp) stat).getSymbolTable()+"\n";
            }
            if(stat instanceof WhileOp){
                if(((WhileOp) stat).getBody().getStatList() != null){
                    str += scorriStat(((WhileOp) stat).getBody().getStatList());
                }
                return str+((WhileOp) stat).getSymbolTable().getNomeScope()+" scope="+((WhileOp) stat).getSymbolTable()+"\n";            }
            if(stat instanceof IfStatOp){
                if(((IfStatOp) stat).getBodyOp().getStatList() != null){
                    str += scorriStat(((IfStatOp) stat).getBodyOp().getStatList());
                }
                return str+((IfStatOp) stat).getSymbolTable().getNomeScope()+" scope="+((IfStatOp) stat).getSymbolTable()+"\n";            }
        }
        return str;
    }
}
