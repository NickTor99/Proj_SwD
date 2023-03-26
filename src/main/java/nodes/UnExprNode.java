package nodes;

public class UnExprNode extends ExprNode{
    private ExprNode exprNode;

    public UnExprNode(String nome, ExprNode exprNode) {
        super(nome);
        this.exprNode = exprNode;
    }

    public ExprNode getExprNode() {
        return exprNode;
    }

    public void setExprNode(ExprNode exprNode) {
        this.exprNode = exprNode;
    }
}
