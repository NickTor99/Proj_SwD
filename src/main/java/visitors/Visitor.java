package visitors;

import nodes.AbstractSyntaxNode;

public interface Visitor {
    String visit(AbstractSyntaxNode ast);
}
