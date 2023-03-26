package nodes;

import table.SymbolTable;

public class ForStatOp extends StatOp{
    private IdExprNode index;
    private ConstExprNode const1;
    private ConstExprNode const2;
    private BodyOp body;

    private SymbolTable symbolTable;


    public ForStatOp(String nome, IdExprNode index, ConstExprNode const1, ConstExprNode const2, BodyOp body) {
        super(nome);
        this.index = index;
        this.const1 = const1;
        this.const2 = const2;
        this.body = body;
    }

    public IdExprNode getIndex() {
        return index;
    }

    public void setIndex(IdExprNode index) {
        this.index = index;
    }

    public ConstExprNode getConst1() {
        return const1;
    }

    public void setConst1(ConstExprNode const1) {
        this.const1 = const1;
    }

    public ConstExprNode getConst2() {
        return const2;
    }

    public void setConst2(ConstExprNode const2) {
        this.const2 = const2;
    }

    public BodyOp getBody() {
        return body;
    }

    public void setBody(BodyOp body) {
        this.body = body;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
