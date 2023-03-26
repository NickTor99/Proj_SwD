package nodes;

import java.util.ArrayList;

public class WriteOp extends StatOp{
    private String writeType;
    private ArrayList<ExprNode> exprNodesList;

    public WriteOp(String nome, String writeType, ArrayList<ExprNode> exprNodesList) {
        super(nome);
        this.writeType = writeType;
        this.exprNodesList = exprNodesList;
    }

    public String getWriteType() {
        return writeType;
    }

    public void setWriteType(String writeType) {
        this.writeType = writeType;
    }

    public ArrayList<ExprNode> getExprNodesList() {
        return exprNodesList;
    }

    public void setExprNodesList(ArrayList<ExprNode> exprNodesList) {
        this.exprNodesList = exprNodesList;
    }
}
