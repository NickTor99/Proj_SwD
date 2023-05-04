package nodes;

import java.util.ArrayList;

public class VarDeclOp extends AbstractSyntaxNode{
    private String varType;
    private ArrayList<IdInit> idInitList;

    public VarDeclOp(String varType, ArrayList<IdInit> idInitList) {
        this.varType = varType;
        this.idInitList = idInitList;
    }

    public VarDeclOp(String varType, IdInit idInit) {
        idInitList = new ArrayList<>();
        this.varType = varType;
        this.idInitList.add(idInit);
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public ArrayList<IdInit> getIdInitList() {
        return idInitList;
    }

    public void setIdInitList(ArrayList<IdInit> idInitList) {
        this.idInitList = idInitList;
    }
}
