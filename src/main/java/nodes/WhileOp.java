package nodes;

import table.SymbolTable;

public class WhileOp extends StatOp{
    private ExprNode expr;
    private BodyOp body;

    private SymbolTable symbolTable;

    public WhileOp(String nome, ExprNode expr, BodyOp body) {
        super(nome);
        this.expr = expr;
        this.body = body;
    }

    public ExprNode getExpr() {
        return expr;
    }

    public void setExpr(ExprNode expr) {
        this.expr = expr;
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
