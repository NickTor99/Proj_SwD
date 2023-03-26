package visitors;

import table.*;
import jflexcup.sym;
import exceptions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import nodes.*;

public class TypeVisitor implements Visitor{

    private final Stack<SymbolTable> activeStackScope;
    private SymbolTable symbolTable;
    private boolean hasReturn = false;

    public TypeVisitor() {
        activeStackScope = new Stack<>();
    }

    @Override
    public String visit(AbstractSyntaxNode ast) {
        if(ast instanceof ProgramOp){
            visitProgramOp((ProgramOp) ast);
        }else if(ast instanceof VarDeclOp){
            visitVarDeclOp((VarDeclOp) ast);
        }else if(ast instanceof IsMainFunOp){
            visitFunOp((IsMainFunOp) ast);
        }else if(ast instanceof AssignOp){
            visitAssignOp((AssignOp) ast);
        }else if(ast instanceof BiExprNode){
            visitBiExprNode((BiExprNode) ast);
        }else if(ast instanceof BodyOp){
            visitBodyOp((BodyOp) ast);
        }else if(ast instanceof CallFunOp){
            visitCallFunOp((CallFunOp) ast);
        }else if(ast instanceof ConstExprNode){
            visitConstExprNode((ConstExprNode) ast);
        }else if(ast instanceof ForStatOp){
            visitForStatOp((ForStatOp) ast);
        }else if(ast instanceof IdExprNode){
            visitIdExprNode((IdExprNode) ast);
        }else if(ast instanceof IfStatOp){
            visitIfStatOp((IfStatOp) ast);
        }else if(ast instanceof ReadOp){
            visitReadOp((ReadOp) ast);
        }else if(ast instanceof WriteOp){
            visitWriteOp((WriteOp) ast);
        }else if(ast instanceof ReturnStatOp){
            visitReturnStatOp((ReturnStatOp) ast);
        }else if(ast instanceof UnExprNode){
            visitUnExprNode((UnExprNode) ast);
        }else if(ast instanceof VarDeclOp){
            visitVarDeclOp((VarDeclOp) ast);
        }else if(ast instanceof WhileOp){
            visitWhileOp((WhileOp) ast);
        }
        return null;
    }

    void visitBiExprNode(BiExprNode node){
        String op = node.getNome();
        ExprNode expr1 = node.getExprNode1();
        ExprNode expr2 = node.getExprNode2();
        expr1.accept(this);
        expr2.accept(this);
        int type = sym.error;

        if(op.equals("PLUS") || op.equals("MINUS") || op.equals("TIMES")){
            type = TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC,expr1.getType(),expr2.getType());
        }
        else if(op.equals("POW")){
            type = TypeChecker.binaryOpChecker(TypeChecker.POW,expr1.getType(),expr2.getType());
        }
        else if(op.equals("AND") || op.equals("OR")){
            type = TypeChecker.binaryOpChecker(TypeChecker.BOOLEANOP,expr1.getType(),expr2.getType());
        }
        else if(op.equals("EQ") || op.equals("GT") || op.equals("GE") || op.equals("LT") || op.equals("LE") || op.equals("NE")){
            type = TypeChecker.binaryOpChecker(TypeChecker.RELOP,expr1.getType(),expr2.getType());
        }
        else if(op.equals("STR_CONCAT")){
            type = TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT,expr1.getType(),expr2.getType());
        }
        else if(op.equals("DIV")){
            type = TypeChecker.binaryOpChecker(TypeChecker.DIV,expr1.getType(),expr2.getType());
        }
        node.setType(type);
    }

    void visitUnExprNode(UnExprNode node){
        String op = node.getNome();
        ExprNode expr = node.getExprNode();
        expr.accept(this);
        int type = sym.error;

        if(op.equals("MINUS")){
            type = TypeChecker.unaryOpChecker(TypeChecker.UMINUSOP,expr.getType());
        }
        else if(op.equals("NOT")){
            type = TypeChecker.unaryOpChecker(TypeChecker.BOOLEANOP,expr.getType());
        }
        node.setType(type);
    }

    void visitConstExprNode(ConstExprNode node){
        int type = TypeChecker.getInferenceType(node.getNome());
        node.setType(type);
    }

    SymbolRecord getFromScope(String id){
        Stack<SymbolTable> stack = (Stack) activeStackScope.clone();
        while(!stack.isEmpty()){
            SymbolTable sTable = stack.pop();
            if(sTable.containsKey(id)){
                return sTable.get(id);
            }
        }
        throw new UndeclaredVariableException(id);
    }

    void visitIdExprNode(IdExprNode node){
        String nameId = node.getNameId();
        int type = getFromScope(nameId).getType();
        node.setType(type);
    }

    void visitAssignOp(AssignOp node){
        ArrayList<IdInit> idList = node.getIdList();
        ArrayList<ExprNode> exprList = node.getExprList();
        if(exprList.size() == 1){
            ExprNode expr = exprList.get(0);
            expr.accept(this);
            for(IdInit idInit : idList){
                IdExprNode id = idInit.getId();
                id.accept(this);
                idInit.setType(TypeChecker.AssignOpChecker(expr.getType(),id.getType()));
            }
            node.setType(sym.VOID);
        }
        else{
            if(exprList.size() == idList.size()){
                for(ExprNode expr : exprList){
                    expr.accept(this);
                    for(IdInit idInit : idList){
                        IdExprNode id = idInit.getId();
                        id.accept(this);
                        idInit.setType(TypeChecker.AssignOpChecker(expr.getType(),id.getType()));
                    }
                }
            }
            else{
                throw new Error("il numero di variabili non coincidono con il numero di espessioni da assegnare");
            }
            node.setType(sym.VOID);
        }

    }

    void visitProgramOp(ProgramOp node){
        activeStackScope.push(node.getSymbolTable());
        ArrayList<VarDeclOp> varDeclList = node.getVarDeclList();
        ArrayList<IsMainFunOp> isMainFunList = node.getFunList();

        if(varDeclList != null){
            for(VarDeclOp varDecl : varDeclList){
                varDecl.accept(this);
            }
        }
        if(isMainFunList != null){
            for(IsMainFunOp fun : isMainFunList){
                fun.accept(this);
            }
        }
        activeStackScope.pop();
    }

    void visitVarDeclOp(VarDeclOp node){
        String varType = node.getVarType();
        int type = TypeChecker.getInferenceType(varType);
        ArrayList<IdInit> idInitList = node.getIdInitList();
        if(varType == "VAR"){
            for(IdInit idInit : idInitList){
                idInit.getId().accept(this);
                idInit.setType(sym.VOID);
            }
        }
        else {
            for(IdInit idInit : idInitList){
                ExprNode expr = idInit.getExprNode();
                idInit.getId().accept(this);
                if(expr != null){
                    expr.accept(this);
                    idInit.setType(TypeChecker.AssignOpChecker(expr.getType(),type));
                }
                idInit.setType(sym.VOID);
            }
        }
    }

    void visitFunOp(IsMainFunOp node){
        FunOp fun = node.getFunOp();
        fun.getId().setType(fun.getType());
        activeStackScope.push(fun.getSymbolTable());
        ArrayList<ParDeclOp> parDeclList = fun.getParDeclList();
        if(parDeclList != null){
            for (ParDeclOp param : parDeclList) {
                for (IdInit idInit : param.getIdList()) {
                    idInit.getId().accept(this);
                }
            }
        }
        BodyOp body = fun.getBody();
        body.accept(this);
        if(fun.getReturnType().equals("VOID") && hasReturn){
            throw new Error("la funzione " + fun.getId().getNameId() + "è di tipo void, quindi non deve avere un valore di ritorno");
        }
        if(!fun.getReturnType().equals("VOID") && !hasReturn){
            throw new Error("valore di ritorno mancante per la funzione "+ fun.getId().getNameId());
        }
        hasReturn = false;
        activeStackScope.pop();
    }

    void visitBodyOp(BodyOp node){
        ArrayList<VarDeclOp> varDeclList = node.getVarDeclListOp();
        ArrayList<StatOp> statList = node.getStatList();
        if(varDeclList != null){
            for(VarDeclOp varDecl : varDeclList){
                varDecl.accept(this);
            }
        }
        if(statList != null){
            for(StatOp statOp : statList){
                if(statOp != null) {
                    statOp.accept(this);
                }
            }
        }
    }

    void visitCallFunOp(CallFunOp node){
        String nomeFun = node.getId().getNameId();
        SymbolRecord funRecord = getFromScope(nomeFun);
        ArrayList<Integer> callParams = new ArrayList<>();
        ArrayList<Integer> funParams = new ArrayList<>();

        if(node.getExprList() != null){
            ExprNode expr;
            for (CallParamOp cExpr : node.getExprList()) {
                expr = cExpr.getExpr();
                expr.accept(this);
                callParams.add(expr.getType());
            }
        }
        for(Integer param : funRecord.getParamsType()){
            funParams.add(param);
        }
        Collections.reverse(callParams);
        if(callParams.size() == funParams.size()){
            for(int i=0;i<callParams.size();i++){
                if(callParams.get(i) != funParams.get(i)){
                    throw new TypeMismatchException("I tipi dei parametri della chiamata a funzione "+nomeFun+" non coincidono con la firma della funzione");
                }
            }
        }
        else{
            throw new Error("I parametri passati alla chiamata della funzione "+ nomeFun + " non coincidono");
        }

        if(node.getExprList() != null){
            ArrayList<CallParamOp> params = node.getExprList();
            ArrayList<Boolean> outParams = funRecord.getParamsOut();
            Collections.reverse(params);
            for (int i = 0; i < params.size(); i++) {
                params.get(i).setOut(outParams.get(i));
                if(outParams.get(i)){
                    if(!(params.get(i).getExpr() instanceof IdExprNode)){
                        throw new Error("Errore nel passaggio del parametro per riferimento per la funzione: "+nomeFun);
                    }
                }
            }
            Collections.reverse(params);
        }
        node.getId().setType(funRecord.getReturnType());
        node.setType(funRecord.getReturnType());
    }

    void visitReturnStatOp(ReturnStatOp node){
        hasReturn = true;
        Stack<SymbolTable> stack = (Stack) activeStackScope.clone();
        while(stack.peek().getNomeScope() != "FUN"){ // trova la funzione a cui il return è riferito
            if(!stack.isEmpty()){
                stack.pop();
            }
            else{
                throw new Error("Return statment non valido");
            }
        }
        String nomeFun = stack.peek().getNomeFunzione();
        SymbolRecord funRecord = getFromScope(nomeFun);
        if(funRecord.getKind() != "fun"){
            throw new Error("Conflitto tra il nome della variabile "+nomeFun+" e la funzione "+nomeFun);
        }
        ExprNode expr = node.getReturnExpr();
        expr.accept(this);
        if(!TypeChecker.typeCompatibility(funRecord.getReturnType(),expr.getType())){
            throw new TypeMismatchException("il tipo di ritorno della funzione "+nomeFun+" non è corretto");
        }
        node.setType(sym.VOID);
    }

    void visitIfStatOp(IfStatOp node){
        ExprNode condition = node.getExpr();
        activeStackScope.push(node.getSymbolTable());
        condition.accept(this);
        if(condition.getType() == sym.BOOL){
            BodyOp body = node.getBodyOp();
            body.accept(this);
            BodyOp elseBody = node.getElseBodyOp();
            if(elseBody != null){
                activeStackScope.push(node.getElseSymbolTable());
                elseBody.accept(this);
                activeStackScope.pop();
            }
        }
        else{
            throw new TypeMismatchException("Errore: la condizione dell'if deve essere un booleano");
        }
        activeStackScope.pop();
    }

    void visitWhileOp(WhileOp node){
        ExprNode condition = node.getExpr();
        activeStackScope.push(node.getSymbolTable());
        condition.accept(this);
        if(condition.getType() == sym.BOOL){
            BodyOp body = node.getBody();
            body.accept(this);
        }
        else{
            throw new TypeMismatchException("Errore: la condizione del while deve essere un booleano");
        }
        activeStackScope.pop();
    }

    void visitForStatOp(ForStatOp node){
        activeStackScope.push(node.getSymbolTable());
        node.getIndex().accept(this);
        ExprNode const1 = node.getConst1();
        ExprNode const2 = node.getConst2();
        const1.accept(this);
        const2.accept(this);
        if(const1.getType() == sym.INTEGER && const2.getType() == sym.INTEGER){
            BodyOp body = node.getBody();
            body.accept(this);
        }
        else{
            throw new TypeMismatchException("Errore: le costanti del ciclo for devono essere numeri interi");
        }
        activeStackScope.pop();
    }

    void visitReadOp(ReadOp node){
        ArrayList<IdInit> idInitLidt = node.getIdList();
        for(IdInit idInit : idInitLidt){
            ExprNode id = idInit.getId();
            id.accept(this);
            idInit.setType(sym.VOID);
        }
        node.setType(sym.VOID);
    }

    void visitWriteOp(WriteOp node){
        ArrayList<ExprNode> exprList = node.getExprNodesList();
        for(ExprNode expr : exprList){
            expr.accept(this);
        }
        node.setType(sym.VOID);
    }

}
