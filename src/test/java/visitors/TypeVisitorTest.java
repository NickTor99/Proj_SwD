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

class TypeVisitorTest {

    TypeVisitor typeVisitor;
    SymbolTable symbolTable;

    public TypeVisitorTest(){

    }

    @BeforeEach
    void setUp() {
        typeVisitor = new TypeVisitor();
        symbolTable = new SymbolTable("testScope");
        symbolTable.put("v1",new SymbolRecord("v1","var",sym.REAL));
        symbolTable.put("v2",new SymbolRecord("v2","var",sym.REAL));
        ArrayList<Integer> parType = new ArrayList<>();
        ArrayList<Boolean> paramsOut = new ArrayList<>();
        parType.add(sym.INTEGER);parType.add(sym.STRING);
        paramsOut.add(false);paramsOut.add(true);
        symbolTable.put("notVoidFun",new SymbolRecord("notVoidFun","fun",parType,paramsOut,sym.INTEGER));
        symbolTable.put("voidFun",new SymbolRecord("voidFun","fun",null,null,sym.VOID));

        Stack<SymbolTable> scope = new Stack<>();
        scope.push(symbolTable);
        typeVisitor.setActiveStackScope(scope);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void visitBiExprNode() {
        BiExprNode plus = new BiExprNode("PLUS",new ConstExprNode("INTEGER_CONST","10"),new ConstExprNode("INTEGER_CONST","10"));
        BiExprNode pow = new BiExprNode("POW",new ConstExprNode("INTEGER_CONST","10"),new ConstExprNode("INTEGER_CONST","10"));
        BiExprNode and = new BiExprNode("AND",new ConstExprNode("BOOL","true"),new ConstExprNode("BOOL","false"));
        BiExprNode eq = new BiExprNode("EQ",new ConstExprNode("INTEGER_CONST","10"),new ConstExprNode("INTEGER_CONST","10"));
        BiExprNode concat = new BiExprNode("STR_CONCAT",new ConstExprNode("STRING_CONST","ciao"),new ConstExprNode(" a tutti","10"));
        BiExprNode div = new BiExprNode("DIV",new ConstExprNode("INTEGER_CONST","10"),new ConstExprNode("INTEGER_CONST","10"));

        typeVisitor.visit(plus);
        typeVisitor.visit(pow);
        typeVisitor.visit(and);
        typeVisitor.visit(eq);
        typeVisitor.visit(concat);
        typeVisitor.visit(div);

        assertEquals(sym.INTEGER,plus.getType());
        assertEquals(sym.REAL,pow.getType());
        assertEquals(sym.BOOL,and.getType());
        assertEquals(sym.BOOL,eq.getType());
        assertEquals(sym.STRING,concat.getType());
        assertEquals(sym.REAL,div.getType());
    }

    @Test
    void visitUnExprNode() {
        UnExprNode minus = new UnExprNode("MINUS",new ConstExprNode("REAL_CONST","5.4"));
        UnExprNode not = new UnExprNode("NOT",new ConstExprNode("BOOL","true"));

        typeVisitor.visit(minus);
        typeVisitor.visit(not);

        assertEquals(sym.REAL,minus.getType());
        assertEquals(sym.BOOL,not.getType());
    }

    @Test
    void visitIdExprNode() {
        IdExprNode id = new IdExprNode("ID","v1");
        typeVisitor.visit(id);
        assertEquals(sym.REAL,id.getType());
    }

    @Test
    void visitAssignOp() {
        ArrayList<IdInit> idList = new ArrayList<>();
        ArrayList<ExprNode> exprList = new ArrayList<>();
        idList.add(new IdInit(new IdExprNode("ID","v1"),null,null));
        idList.add(new IdInit(new IdExprNode("ID","v2"),null,null));
        exprList.add(new ConstExprNode("INTEGER_CONST","10"));
        AssignOp assign = new AssignOp("ASSIGN",idList,exprList);
        typeVisitor.visit(assign);

        assertEquals(sym.VOID,assign.getType());
    }

    @Test
    void visitProgramOp() {
        ArrayList<AbstractSyntaxNode> emptyList = new ArrayList<>();
        ProgramOp programOp = new ProgramOp(
                emptyList,
                new IsMainFunOp(true,new FunOp(new IdExprNode("ID","test"),new ArrayList<>(),"VOID",new BodyOp(new ArrayList<>(),null))),
                emptyList
        );
        typeVisitor.visit(programOp);

        assertEquals(sym.VOID,programOp.getType());
    }

    @Test
    void visitVarDeclOp() {
        ArrayList<IdInit> idList = new ArrayList<>();
        ArrayList<IdInit> idList2 = new ArrayList<>();
        IdInit v1 = new IdInit(new IdExprNode("ID","v1"),null,new ConstExprNode("INTEGER_CONST","100"));
        IdInit v2 = new IdInit(new IdExprNode("ID","v2"),new ConstExprNode("INTEGER_CONST","100"),null);
        idList.add(v1);
        idList2.add(v2);
        VarDeclOp varDecl1 = new VarDeclOp("VAR",idList);
        VarDeclOp varDecl2 = new VarDeclOp("INTEGER",idList2);
        typeVisitor.visit(varDecl1);
        typeVisitor.visit(varDecl2);

        assertEquals(sym.VOID,v1.getType());
        assertEquals(sym.VOID,v2.getType());
    }

    @Test
    void visitFunOp() {
        //testing not void function without return statment
        SymbolTable funTable = new SymbolTable("FUN","notVoidFun");
        funTable.put("param",new SymbolRecord("param","param",sym.INTEGER));
        funTable.put("outPar",new SymbolRecord("outPar","param",sym.STRING,true));
        ArrayList<ParDeclOp>parList = new ArrayList<>();
        parList.add(new ParDeclOp("IN","INTEGER",new IdInit(new IdExprNode("ID","param"),null,null)));
        parList.add(new ParDeclOp("OUT","STRING",new IdInit(new IdExprNode("ID","outPar"),null,null)));
        ArrayList<StatOp> statList = new ArrayList<>();
        FunOp notVoidFun = new FunOp(
                new IdExprNode("ID","notVoidFun"),
                parList,
                "INTEGER",
                new BodyOp(new ArrayList<>(),statList));
        notVoidFun.setSymbolTable(funTable);
        assertThrows(Error.class,() -> typeVisitor.visit(new IsMainFunOp(true,notVoidFun)));

        // with the return statment works
        statList.add(new ReturnStatOp("RETURN",new IdExprNode("ID","param")));
        typeVisitor.visit(new IsMainFunOp(true,notVoidFun));

        //testing void function with return statment
        statList.clear();
        statList.add(new ReturnStatOp("RETURN",new IdExprNode("ID","return")));
        SymbolTable funTable2 = new SymbolTable("FUN","voidFun");
        funTable2.put("return",new SymbolRecord("return","var",sym.VOID));
        FunOp voidFun = new FunOp(new IdExprNode("ID","voidFun"), null, "VOID", new BodyOp(new ArrayList<>(),statList));
        voidFun.setSymbolTable(funTable2);
        assertThrows(Error.class,() -> typeVisitor.visit(new IsMainFunOp(false,voidFun)));

        //without the return statment works
        typeVisitor.setHasReturn(false);
        statList.clear();
        typeVisitor.visit(new IsMainFunOp(false,voidFun));

    }

    @Test
    void visitCallFunOp() {
    }

    @Test
    void visitReturnStatOp() {
    }

    @Test
    void visitIfStatOp() {
    }

    @Test
    void visitWhileOp() {
    }

    @Test
    void visitForStatOp() {
    }

    @Test
    void visitReadOp() {
    }

    @Test
    void visitWriteOp() {
    }
}