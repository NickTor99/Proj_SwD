package launcher;

import nodes.*;
import visitors.*;
import java.io.*;
import jflexcup.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] array = args[0].split("/");
        String nomeFile = array[array.length-1];
        String inPathFile = args[0];
        String cGenerated = "test_files/c_out/"+nomeFile.substring(0,nomeFile.length()-4)+".c";

        parser p = new parser(new Lexer(new FileReader(new File(inPathFile))));

        ProgramOp programOp = (ProgramOp) p.parse().value;

        ScopingVisitor scopeVisitor = new ScopingVisitor();
        scopeVisitor.visit(programOp);
        //printScopes(programOp); // stampo le symbol table di ogni scope per testare il corretto funzionamento della visita
        TypeVisitor typeCheckerVisitor = new TypeVisitor();
        typeCheckerVisitor.visit(programOp);
        XMLVisitor xmlVisitor = new XMLVisitor();
        fileGenerator(xmlVisitor.visit(programOp),"ast.xml"); // genero il file ast.xml per visualizzare l'albero sintattico
        CVisitor cGenerator = new CVisitor();
        String cCode = cGenerator.visit(programOp);
        //System.out.println(cCode);
        fileGenerator(cCode,cGenerated);
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
