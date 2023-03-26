package nodes;

import visitors.Visitor;

import java.util.List;

public abstract class AbstractSyntaxNode {
    private AbstractSyntaxNode parent;
    private Integer type;
    private List<Integer> types;

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public AbstractSyntaxNode getParent() {
        return parent;
    }

    public void setParent(AbstractSyntaxNode parent) {
        this.parent = parent;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }
}

