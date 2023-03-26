package nodes;

import java.util.ArrayList;

public class BodyOp extends AbstractSyntaxNode{

    private ArrayList<VarDeclOp>  varDeclListOp;

    private ArrayList<StatOp> statList;

    public BodyOp(ArrayList<VarDeclOp> varDeclListOp, ArrayList<StatOp> statList) {
        this.varDeclListOp = varDeclListOp;
        this.statList = statList;
    }

    public ArrayList<VarDeclOp> getVarDeclListOp() {
        return varDeclListOp;
    }

    public void setVarDeclListOp(ArrayList<VarDeclOp> varDeclListOp) {
        this.varDeclListOp = varDeclListOp;
    }

    public ArrayList<StatOp> getStatList() {
        return statList;
    }

    public void setStatList(ArrayList<StatOp> statList) {
        this.statList = statList;
    }
}
