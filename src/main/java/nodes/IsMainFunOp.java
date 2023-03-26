package nodes;

public class IsMainFunOp extends AbstractSyntaxNode{
    private boolean main;
    private FunOp funOp;

    public IsMainFunOp(boolean main, FunOp funOp) {
        this.main = main;
        this.funOp = funOp;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public FunOp getFunOp() {
        return funOp;
    }

    public void setFunOp(FunOp funOp) {
        this.funOp = funOp;
    }
}
