package nodes;

public class IdExprNode extends ExprNode{

    private String nameId;

    public IdExprNode(String nome, String nameId) {
        super(nome);
        this.nameId = nameId;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    @Override
    public String toString() {
        return "IdExprNode{" +
                "nameId='" + nameId + '\'' +
                '}';
    }
}
