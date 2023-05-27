package nodes;

public class IdExprNode extends ExprNode{

    private String nameId;

    public IdExprNode(String nome, String nameId) {
        super(nome);
        this.nameId = nameId;
        if(nameId.equals("main") || nameId.equals("const") || nameId.equals("int")){
            throw new Error("Il nome della variabile o funzione " + nameId + " non può essere utilizzato, in quanto è una parola chiave in C");
        }
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
