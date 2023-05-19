package visitors;

import table.*;
import launcher.sym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import nodes.*;

public class ScopingVisitor implements Visitor{
    private final Stack<SymbolTable> activeStackScope;
    private SymbolTable symbolTable;

    public ScopingVisitor() {
        this.activeStackScope = new Stack<SymbolTable>();
    }

    @Override
    public String visit(AbstractSyntaxNode ast) {
        if(ast instanceof ProgramOp) {
            visitProgramOp((ProgramOp) ast);
        } else if(ast instanceof VarDeclOp) {
            visitVarDeclOp((VarDeclOp) ast);
        } else if(ast instanceof IsMainFunOp) {
            visitFunOp((IsMainFunOp) ast);
        } else if(ast instanceof ParDeclOp) {
            visitParDeclOp((ParDeclOp) ast);
        } else if(ast instanceof BodyOp){
            visitBodyOp((BodyOp) ast);
        } else if (ast instanceof WhileOp) {
            visitWhileOp((WhileOp) ast);
        } else if (ast instanceof IfStatOp) {
            visitIfStatOp((IfStatOp) ast);
        } else if(ast instanceof ForStatOp){
            visitForStatOp((ForStatOp) ast);
        }
        return null;
    }

    void visitProgramOp(ProgramOp node){
        symbolTable = new SymbolTable("Global");
        activeStackScope.push(symbolTable);
        node.setSymbolTable(symbolTable);

        ArrayList<VarDeclOp> varDeclList = node.getVarDeclList();
        if(varDeclList != null && !varDeclList.isEmpty()){
            for(VarDeclOp varDecl : varDeclList){
                varDecl.accept(this);
            }
        }
        ArrayList<IsMainFunOp> funList = node.getFunList();
        if(funList != null && !funList.isEmpty()){
            for(IsMainFunOp funOp : funList){
                funOp.accept(this);
            }
        }

        activeStackScope.pop();
    }

    void visitVarDeclOp(VarDeclOp node){
        ArrayList<IdInit> idInitList = node.getIdInitList();
        if(node.getVarType() == "VAR"){
            node.setType(sym.error);
            for(IdInit idInit : idInitList){
                String nomeId = idInit.getId().getNameId();
                if(!activeStackScope.peek().containsKey(nomeId)){
                    int type = TypeChecker.getInferenceType(idInit.getCostante().getNome());
                    activeStackScope.peek().put(nomeId,new SymbolRecord(nomeId,"var",type));
                    node.setType(type);
                }
                else{
                    throw new Error("Identificatore: "+ nomeId +" è già dichiarato all'interno dello scope");
                }
            }
        }
        else{
            int type = TypeChecker.getInferenceType(node.getVarType());
            for(IdInit idInit : idInitList){
                String nomeId = idInit.getId().getNameId();
                if(!activeStackScope.peek().containsKey(nomeId)){
                    activeStackScope.peek().put(nomeId,new SymbolRecord(nomeId,"var",type));
                }
                else{
                    throw new Error("Identificatore: "+ nomeId +" è già dichiarato all'interno dello scope");
                }
            }
            node.setType(type);
        }
    }

    void visitFunOp(IsMainFunOp node){
        FunOp funOp = node.getFunOp();
        String nomeId = funOp.getId().getNameId();
        int returnType = TypeChecker.getInferenceType(funOp.getReturnType());
        if(!activeStackScope.peek().containsKey(nomeId)){
            SymbolTable symbolTableGlobal = activeStackScope.peek();
            symbolTable = new SymbolTable("FUN",nomeId);
            activeStackScope.push(symbolTable);

            ArrayList<ParDeclOp> paramList = funOp.getParDeclList();
            ArrayList<Integer> paramTypes = new ArrayList<>();
            ArrayList<Boolean> paramOut = new ArrayList<>();
            if(paramList != null){
                for(ParDeclOp param : paramList){
                    param.accept(this);
                    for(int i=0;i<param.getIdList().size();i++){
                        paramTypes.add(TypeChecker.getInferenceType(param.getVarType()));
                        if(param.getMode().equals("OUT")){
                            paramOut.add(true);
                        }
                        else{
                            paramOut.add(false);
                        }
                    }
                }
            }
            symbolTableGlobal.put(nomeId,new SymbolRecord(nomeId,"fun",paramTypes,paramOut,returnType));

            funOp.getBody().accept(this);
        }
        else{
            throw new Error("Identificatore della funzione: "+ nomeId +" è già dichiarato all'interno dello scope");
        }
        funOp.setType(returnType);
        node.setType(returnType);
        funOp.setSymbolTable(activeStackScope.peek());
        activeStackScope.pop();
    }

    void visitParDeclOp(ParDeclOp node){
        ArrayList<IdInit> idInitList = node.getIdList();
        int type = TypeChecker.getInferenceType(node.getVarType());
        for(IdInit idInit : idInitList){
            String nomeId = idInit.getId().getNameId();
            if(!activeStackScope.peek().containsKey(nomeId)){
                if(node.getMode().equals("OUT")){
                    activeStackScope.peek().put(nomeId, new SymbolRecord(nomeId, "param", type,true));
                }
                else {
                    activeStackScope.peek().put(nomeId, new SymbolRecord(nomeId, "param", type));
                }
            }
            else{
                throw new Error("Identificatore: "+ nomeId +" è già dichiarato all'interno dello scope");
            }
            idInit.setType(sym.VOID);
        }
        node.setType(type);
    }

    void visitBodyOp(BodyOp node){
        ArrayList<VarDeclOp> varDeclList = node.getVarDeclListOp();
        Collections.reverse(varDeclList);
        if(varDeclList != null && !varDeclList.isEmpty()){
            for(VarDeclOp varDecl : varDeclList){
                varDecl.accept(this);
            }
        }
        ArrayList<StatOp> statList = node.getStatList();
        if(statList != null && !statList.isEmpty()){
            for(StatOp statOp : statList){
                if(statOp != null) {
                    statOp.accept(this);
                }
            }
        }
        node.setType(sym.VOID);
    }

    void visitIfStatOp(IfStatOp node){
        symbolTable = new SymbolTable("IF");
        activeStackScope.push(symbolTable);
        node.setSymbolTable(symbolTable);
        node.getBodyOp().accept(this);
        activeStackScope.pop();

        if(node.getElseBodyOp() != null){
            symbolTable = new SymbolTable("ELSE");
            activeStackScope.push(symbolTable);
            node.setElseSymbolTable(symbolTable);
            node.getElseBodyOp().accept(this);
            activeStackScope.pop();
        }
    }

    void visitWhileOp(WhileOp node){
        symbolTable = new SymbolTable("WHILE");
        activeStackScope.push(symbolTable);
        node.setSymbolTable(symbolTable);
        node.getBody().accept(this);
        activeStackScope.pop();
    }

    void visitForStatOp(ForStatOp node){
        symbolTable = new SymbolTable("FOR");
        activeStackScope.push(symbolTable);

        String index = node.getIndex().getNameId();
        activeStackScope.peek().put(index,new SymbolRecord(index,"var",sym.INTEGER));

        node.setSymbolTable(symbolTable);
        node.getBody().accept(this);
        activeStackScope.pop();
    }

}
