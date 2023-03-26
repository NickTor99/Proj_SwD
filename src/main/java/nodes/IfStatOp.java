package nodes;

import table.SymbolTable;

public class IfStatOp extends StatOp{
    private ExprNode expr;

    private BodyOp bodyOp;

    private BodyOp elseBodyOp;

    private SymbolTable symbolTable;

    private SymbolTable elseSymbolTable;

    public IfStatOp(String nome, ExprNode exprNode, BodyOp bodyOp, BodyOp elseBodyOp) {
        super(nome);
        this.expr = exprNode;
        this.bodyOp = bodyOp;
        this.elseBodyOp = elseBodyOp;
    }

    public ExprNode getExpr() {
        return expr;
    }

    public void setExpr(ExprNode exprNode) {
        this.expr = exprNode;
    }

    public BodyOp getBodyOp() {
        return bodyOp;
    }

    public void setBodyOp(BodyOp bodyOp) {
        this.bodyOp = bodyOp;
    }

    public BodyOp getElseBodyOp() {
        return elseBodyOp;
    }

    public void setElseBodyOp(BodyOp elseBodyOp) {
        this.elseBodyOp = elseBodyOp;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SymbolTable getElseSymbolTable() {
        return elseSymbolTable;
    }

    public void setElseSymbolTable(SymbolTable elseSymbolTable) {
        this.elseSymbolTable = elseSymbolTable;
    }
}
