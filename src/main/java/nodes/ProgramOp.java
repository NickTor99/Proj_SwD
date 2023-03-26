package nodes;

import table.SymbolTable;
import java.util.ArrayList;

public class ProgramOp extends AbstractSyntaxNode{
    private ArrayList<VarDeclOp> varDeclList = new ArrayList<>();
    private ArrayList<IsMainFunOp> funList = new ArrayList<>();
    private SymbolTable symbolTable;

    public ProgramOp(ArrayList<AbstractSyntaxNode> declList1, IsMainFunOp mainFun, ArrayList<AbstractSyntaxNode> declList2) {
        declList1.addAll(declList2);
        funList.add(mainFun);
        for(AbstractSyntaxNode decl : declList1){
            if(decl instanceof VarDeclOp){
                varDeclList.add((VarDeclOp) decl);
            }
            if(decl instanceof IsMainFunOp){
                funList.add((IsMainFunOp) decl);
            }
        }
    }

    public ArrayList<VarDeclOp> getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(ArrayList<VarDeclOp> varDeclList) {
        varDeclList = varDeclList;
    }

    public ArrayList<IsMainFunOp> getFunList() {
        return funList;
    }

    public void setFunList(ArrayList<IsMainFunOp> funList) {
        this.funList = funList;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
