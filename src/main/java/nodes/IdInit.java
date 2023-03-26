package nodes;

public class IdInit extends AbstractSyntaxNode{
    private IdExprNode id;
    private ExprNode exprNode;
    private ConstExprNode costante;

    public IdInit(IdExprNode id, ExprNode exprNode, ConstExprNode costante) {
        this.id = id;
        this.exprNode = exprNode;
        this.costante = costante;
    }

    public IdExprNode getId() {
        return id;
    }

    public void setId(IdExprNode id) {
        this.id = id;
    }

    public ExprNode getExprNode() {
        return exprNode;
    }

    public void setExprNode(ExprNode exprNode) {
        this.exprNode = exprNode;
    }

    public ConstExprNode getCostante() {
        return costante;
    }

    public void setCostante(ConstExprNode costante) {
        this.costante = costante;
    }

    @Override
    public String toString() {
        return "IdInit{" +
                "id=" + id +
                ", exprNode=" + exprNode +
                ", costante=" + costante +
                '}';
    }
}
