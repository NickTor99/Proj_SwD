package nodes;

import java.util.ArrayList;

public class ParDeclOp extends AbstractSyntaxNode{
    private String mode;
    private String varType;
    private ArrayList<IdInit> idList;

    public ParDeclOp(String mode, String varType, ArrayList<IdInit> idList) {
        this.mode = mode;
        this.varType = varType;
        this.idList = idList;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public ArrayList<IdInit> getIdList() {
        return idList;
    }

    public void setIdList(ArrayList<IdInit> idList) {
        this.idList = idList;
    }
}
