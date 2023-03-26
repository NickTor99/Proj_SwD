package nodes;

public class ReturnStatOp extends StatOp{
    private ExprNode returnExpr;

    public ReturnStatOp(String nome, ExprNode returnExpr) {
        super(nome);
        this.returnExpr = returnExpr;
    }

    public ExprNode getReturnExpr() {
        return returnExpr;
    }

    public void setReturnExpr(ExprNode returnExpr) {
        this.returnExpr = returnExpr;
    }
}
