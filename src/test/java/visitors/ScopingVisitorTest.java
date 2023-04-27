package visitors;

import launcher.Lexer;
import launcher.parser;
import nodes.*;
import table.SymbolRecord;
import table.SymbolTable;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ScopingVisitorTest {
    private ProgramOp programOp;
    private IsMainFunOp mainFun;
    private IfStatOp ifStat;
    private WhileOp whileStat;
    private ForStatOp forStat;
    private ScopingVisitor scopeVisitor = new ScopingVisitor();
    private ArrayList<SymbolRecord> programOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> funOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> ifStatOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> whileOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> forStatOpAssertions = new ArrayList<>();

    ScopingVisitorTest() throws Exception {
        File initialFile = new File("fileScopingTest.txt");
        InputStream in = new FileInputStream(initialFile);
        if(in == null){
            throw new Error("SCOPING TEST FILE NOT FOUND");
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        parser p = new parser(new Lexer(input));
        programOp = (ProgramOp) p.parse().value;
        mainFun = programOp.getFunList().get(0);
        ArrayList<StatOp> statList = mainFun.getFunOp().getBody().getStatList();
        for(int i=0;i<statList.size();i++){
            if(statList.get(i) instanceof IfStatOp){
                ifStat = (IfStatOp) statList.get(i);
            }
            if(statList.get(i) instanceof WhileOp){
                whileStat = (WhileOp) statList.get(i);
            }
            if(statList.get(i) instanceof ForStatOp){
                forStat = (ForStatOp) statList.get(i);
            }
        }
        readRecordFromFile("outScopingTest.txt");
        scopeVisitor.visitProgramOp(programOp);
    }


    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void visitProgramOp() {
        SymbolTable globals = programOp.getSymbolTable();
        assertEquals("Global",globals.getNomeScope());

        int i = 0;
        for(SymbolRecord record : globals.values()){
            assertEquals(record.getSymbolName(),programOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),programOpAssertions.get(i).getKind());
            assertEquals(record.getType(),programOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),programOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),programOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),programOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),programOpAssertions.get(i).isPointer());
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void visitFunOp(){
        SymbolTable mainTable = mainFun.getFunOp().getSymbolTable();
        int i = 0;
        for(SymbolRecord record : mainTable.values()){
            assertEquals(record.getSymbolName(),funOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),funOpAssertions.get(i).getKind());
            assertEquals(record.getType(),funOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),funOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),funOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),funOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),funOpAssertions.get(i).isPointer());
            i++;
        }
    }


    @org.junit.jupiter.api.Test
    void visitIfStatOp() {
        SymbolTable ifTable = ifStat.getSymbolTable();
        int i = 0;
        for(SymbolRecord record : ifTable.values()){
            assertEquals(record.getSymbolName(),ifStatOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),ifStatOpAssertions.get(i).getKind());
            assertEquals(record.getType(),ifStatOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),ifStatOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),ifStatOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),ifStatOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),ifStatOpAssertions.get(i).isPointer());
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void visitWhileOp() {
        SymbolTable whileTable = whileStat.getSymbolTable();
        int i = 0;
        for(SymbolRecord record : whileTable.values()){
            assertEquals(record.getSymbolName(),whileOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),whileOpAssertions.get(i).getKind());
            assertEquals(record.getType(),whileOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),whileOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),whileOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),whileOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),whileOpAssertions.get(i).isPointer());
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void visitForStatOp() {
        SymbolTable forTable = forStat.getSymbolTable();
        int i = 0;
        for(SymbolRecord record : forTable.values()){
            assertEquals(record.getSymbolName(),forStatOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),forStatOpAssertions.get(i).getKind());
            assertEquals(record.getType(),forStatOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),forStatOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),forStatOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),forStatOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),forStatOpAssertions.get(i).isPointer());
            i++;
        }
    }

    public void readRecordFromFile(String filename) throws IOException {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            while ((line = br.readLine()) != null) {
                if(line.equals("testProgramOp") || line.equals("testFunOp")|| line.equals("testIfStatOp")|| line.equals("testWhileOp")|| line.equals("testForStatOp")){
                    String name = line;
                    while(!(line = br.readLine()).equals("end")){
                        String[] fields = line.split(",");
                        SymbolRecord record = new SymbolRecord();
                        if(fields[1].equals("var")){
                            record = new SymbolRecord(fields[0],fields[1],Integer.parseInt(fields[2]));
                        }
                        if(fields[1].equals("param")){
                            record = new SymbolRecord(fields[0],fields[1],Integer.parseInt(fields[2]),Boolean.parseBoolean(fields[6]));
                        }
                        if(fields[1].equals("fun")){
                            ArrayList<Integer> paramsTypeList = new ArrayList<>();
                            String[] paramsTypeFields = fields[3].split(" ");
                            for (String paramType : paramsTypeFields) {
                                paramsTypeList.add(Integer.parseInt(paramType));
                            }
                            ArrayList<Boolean> paramsOutList = new ArrayList<>();
                            String[] paramsOutFields = fields[4].split(" ");
                            for (String paramOut : paramsOutFields) {
                                paramsOutList.add(Boolean.parseBoolean(paramOut));
                            }
                            record = new SymbolRecord(fields[0],fields[1],paramsTypeList,paramsOutList,Integer.parseInt(fields[5]));
                        }
                        if(name.equals("testProgramOp")){
                            programOpAssertions.add(record);
                        }
                        if(name.equals("testFunOp")){
                            funOpAssertions.add(record);
                        }
                        if(name.equals("testIfStatOp")){
                            ifStatOpAssertions.add(record);
                        }
                        if(name.equals("testWhileOp")){
                            whileOpAssertions.add(record);
                        }
                        if(name.equals("testForStatOp")){
                            forStatOpAssertions.add(record);
                        }
                    }
                }
            }
        }catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}