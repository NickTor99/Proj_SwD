package nodes;

import table.SymbolTable;

import java.util.ArrayList;

public class FunOp extends AbstractSyntaxNode{
    private IdExprNode id;
    private ArrayList<ParDeclOp> parDeclList;
    private String returnType;
    private BodyOp body;

    private SymbolTable symbolTable;


    public FunOp(IdExprNode id, ArrayList<ParDeclOp> parDeclList, String returnType, BodyOp body) {
        this.id = id;
        this.parDeclList = parDeclList;
        this.returnType = returnType;
        this.body = body;
    }

    public IdExprNode getId() {
        return id;
    }

    public void setId(IdExprNode id) {
        this.id = id;
    }

    public ArrayList<ParDeclOp> getParDeclList() {
        return parDeclList;
    }

    public void setParDeclList(ArrayList<ParDeclOp> parDeclList) {
        this.parDeclList = parDeclList;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public BodyOp getBody() {
        return body;
    }

    public void setBody(BodyOp body) {
        this.body = body;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
