package nodes;

public class CallParamOp extends AbstractSyntaxNode {
    private ExprNode expr;
    private boolean out;

    public CallParamOp(ExprNode expr, boolean out) {
        this.expr = expr;
        this.out = out;
    }

    public ExprNode getExpr() {
        return expr;
    }

    public void setExpr(ExprNode expr) {
        this.expr = expr;
    }

    public boolean isOut() {
        return out;
    }

    public void setOut(boolean out) {
        this.out = out;
    }
}
