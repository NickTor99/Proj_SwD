package nodes;

public class ConstExprNode extends ExprNode{
    private String constante;

    public ConstExprNode(String nome, String constante) {
        super(nome);
        this.constante = constante;
    }

    public String getConstante() {
        return constante;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    @Override
    public String toString() {
        return "ConstExprNode{" +
                "constante='" + constante + '\'' +
                '}';
    }
}
