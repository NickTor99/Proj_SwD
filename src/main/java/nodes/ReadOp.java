package nodes;

import java.util.ArrayList;

public class ReadOp extends StatOp{

    private ArrayList<IdInit> idList;
    private ConstExprNode stringConst;

    public ReadOp(String nome, ArrayList<IdInit> idList, ConstExprNode stringConst) {
        super(nome);
        this.idList = idList;
        this.stringConst = stringConst;
    }

    public ArrayList<IdInit> getIdList() {
        return idList;
    }

    public void setIdList(ArrayList<IdInit> idList) {
        this.idList = idList;
    }

    public ConstExprNode getStringConst() {
        return stringConst;
    }

    public void setStringConst(ConstExprNode stringConst) {
        this.stringConst = stringConst;
    }
}
