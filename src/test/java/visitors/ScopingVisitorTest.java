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
    private ArrayList<SymbolRecord> elseStatOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> whileOpAssertions = new ArrayList<>();
    private ArrayList<SymbolRecord> forStatOpAssertions = new ArrayList<>();

    ScopingVisitorTest() throws Exception {
        ArrayList<VarDeclOp> varDeclList = new ArrayList<>();
        varDeclList.add(new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","cond"),null,new ConstExprNode("INTEGER_CONST","100"))));
        varDeclList.add(new VarDeclOp("REAL",new IdInit(new IdExprNode("ID","v1"),null,null)));
        varDeclList.add(new VarDeclOp("CHAR",new IdInit(new IdExprNode("ID","v2"),null,null)));
        varDeclList.add(new VarDeclOp("BOOL",new IdInit(new IdExprNode("ID","v3"),null,null)));
        ArrayList<StatOp> statList = new ArrayList<>();
        ifStat = new IfStatOp("IF",
                new BiExprNode("EQ",new IdExprNode("ID","cond"),new ConstExprNode("INTEGER_CONST","99")),
                new BodyOp(new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","v1"),null,new ConstExprNode("STRING_CONST","test"))),null),
                new BodyOp(new VarDeclOp("INTEGER",new IdInit(new IdExprNode("ID","outPar"),null,null)),null)
        );
        statList.add(ifStat);
        whileStat = new WhileOp("WHILE",
                new BiExprNode("EQ",new IdExprNode("ID","cond"),new ConstExprNode("INTEGER_CONST","100")),
                new BodyOp(new VarDeclOp("REAL",new IdInit(new IdExprNode("ID","cond"),new ConstExprNode("REAL_CONST","3.5"),null)),null)
        );
        statList.add(whileStat);
        forStat = new ForStatOp("FOR",
                new IdExprNode("ID","v2"),
                new ConstExprNode("INTEGER_CONST","0"),
                new ConstExprNode("INTEGER_CONST","3"),
                new BodyOp(new VarDeclOp("STRING",new IdInit(new IdExprNode("ID","v3"),null,null)),null)
        );
        statList.add(forStat);
        BodyOp body = new BodyOp(varDeclList,statList);
        ArrayList<ParDeclOp> parDeclList = new ArrayList<>();
        parDeclList.add(new ParDeclOp("IN","INTEGER",new IdInit(new IdExprNode("ID","param"),null,null)));
        parDeclList.add(new ParDeclOp("OUT","STRING",new IdInit(new IdExprNode("ID","outPar"),null,null)));
        mainFun = new IsMainFunOp(true,new FunOp(new IdExprNode("ID","test"),parDeclList,"VOID",body));
        ArrayList<AbstractSyntaxNode> declList = new ArrayList<>();
        declList.add(new VarDeclOp("VAR",new IdInit(new IdExprNode("ID","global"),null,new ConstExprNode("INTEGER_CONST","0"))));
        programOp = new ProgramOp(declList,mainFun,new ArrayList<AbstractSyntaxNode>());
        scopeVisitor.visitProgramOp(programOp);
        readRecordFromFile("src/test/java/outScopingTest");
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
        SymbolTable elseTable = ifStat.getElseSymbolTable();
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
        i = 0;
        for(SymbolRecord record : elseTable.values()){
            assertEquals(record.getSymbolName(),elseStatOpAssertions.get(i).getSymbolName());
            assertEquals(record.getKind(),elseStatOpAssertions.get(i).getKind());
            assertEquals(record.getType(),elseStatOpAssertions.get(i).getType());
            assertEquals(record.getParamsType(),elseStatOpAssertions.get(i).getParamsType());
            assertEquals(record.getParamsOut(),elseStatOpAssertions.get(i).getParamsOut());
            assertEquals(record.getReturnType(),elseStatOpAssertions.get(i).getReturnType());
            assertEquals(record.isPointer(),elseStatOpAssertions.get(i).isPointer());
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
                if(line.equals("testProgramOp") || line.equals("testFunOp") || line.equals("testIfStatOp")|| line.equals("testWhileOp")|| line.equals("testForStatOp")|| line.equals("testElseStatOp")){
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
                        if(name.equals("testElseStatOp")){
                            elseStatOpAssertions.add(record);
                        }
                    }
                }
            }
        }catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}