package nodes;

public class ExprNode extends AbstractSyntaxNode{

    private String nome;

    public ExprNode(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
