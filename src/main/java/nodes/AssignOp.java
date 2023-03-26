package nodes;

import java.util.ArrayList;

public class AssignOp extends StatOp{
    private ArrayList<IdInit> idList;
    private ArrayList<ExprNode> exprList;

    public AssignOp(String nome, ArrayList<IdInit> idList, ArrayList<ExprNode> exprList) {
        super(nome);
        this.idList = idList;
        this.exprList = exprList;
    }

    public ArrayList<IdInit> getIdList() {
        return idList;
    }

    public void setIdList(ArrayList<IdInit> idList) {
        this.idList = idList;
    }

    public ArrayList<ExprNode> getExprList() {
        return exprList;
    }

    public void setExprList(ArrayList<ExprNode> exprList) {
        this.exprList = exprList;
    }
}
