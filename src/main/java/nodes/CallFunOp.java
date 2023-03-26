package nodes;

import java.util.ArrayList;

public class CallFunOp extends StatOp{
    private IdExprNode id;
    private ArrayList<CallParamOp> exprList;
    private boolean isExpr = false;

    public CallFunOp(String nome, IdExprNode id, ArrayList<CallParamOp> exprList) {
        super(nome);
        this.id = id;
        this.exprList = exprList;
    }

    public IdExprNode getId() {
        return id;
    }

    public void setId(IdExprNode id) {
        this.id = id;
    }

    public ArrayList<CallParamOp> getExprList() {
        return exprList;
    }

    public void setExprList(ArrayList<CallParamOp> exprList) {
        this.exprList = exprList;
    }

    public boolean isExpr() {
        return isExpr;
    }

    public void setExpr(boolean expr) {
        isExpr = expr;
    }
}
