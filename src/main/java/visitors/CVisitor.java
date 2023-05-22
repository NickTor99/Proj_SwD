package visitors;

import java.util.ArrayList;
import java.util.Collections;
import exceptions.*;

import java.util.Stack;

import table.*;
import launcher.sym;
import nodes.*;

public class CVisitor implements Visitor{

    private boolean globalVarDecl = true;

    public void setGlobalVarDecl(boolean globalVarDecl) {
        this.globalVarDecl = globalVarDecl;
    }

    private Stack<SymbolTable> activeStackScope = new Stack<>();

    public void setActiveStackScope(Stack<SymbolTable> activeStackScope) {
        this.activeStackScope = activeStackScope;
    }

    @Override
    public String visit(AbstractSyntaxNode node) {
        String codiceC = "";
        if(node instanceof ProgramOp){
            activeStackScope.push(((ProgramOp) node).getSymbolTable());
            codiceC += "#include <stdio.h>\n#include <stdlib.h>\n#include <string.h>\n#include <math.h>\n#include <malloc.h>\n";
            codiceC += "#define true 1\n";
            codiceC += "#define false 0\n";
            ArrayList<VarDeclOp> varDeclList = ((ProgramOp) node).getVarDeclList();
            Collections.reverse(varDeclList);
            ArrayList<IsMainFunOp> funList = ((ProgramOp) node).getFunList();
            for(IsMainFunOp funOp : funList){ // generazione dei prototipi
                FunOp fun = funOp.getFunOp();
                if(funOp != null){
                    codiceC += typeConverter(XMLVisitor.numericToStringType(fun.getType())) + " " + fun.getId().getNameId()+"(";
                    if(fun.getParDeclList() != null){
                        for (ParDeclOp param : fun.getParDeclList()) {
                            for (IdInit idInit : param.getIdList()) {
                                if(typeConverter(param.getVarType()).equals("STRING")){
                                    codiceC += "char *";
                                }
                                else {
                                    codiceC += typeConverter(param.getVarType());
                                }
                                if(param.getMode().equals("OUT")){
                                    codiceC += "*";
                                }
                                codiceC += ",";
                            }
                        }
                        codiceC = codiceC.substring(0,codiceC.length()-1);
                    }
                    codiceC += ");\n";
                }
            }
            codiceC += "char* intToString(int var){\n" +
                            "char *int_str = malloc(256) ;\n" +
                            "sprintf(int_str, \"%d\", var);\n" +
                            "return int_str;\n"
                        +"}\n";
            codiceC += "char* doubleToString(double var){\n" +
                            "char *double_str= malloc(256);\n" +
                            "sprintf(double_str, \"%f\", var);\n" +
                            "return double_str;\n"
                        +"}\n";
            codiceC += "char* boolToString(int var){\n" +
                            "if(var == 1){\n" +
                                "return \"true\";\n}\n" +
                            "if(var == 0){\n" +
                                "return \"false\";\n}\n" +
                            "return \"\";\n"
                        +"}\n";
            codiceC += "char* concat(char *s1, char* i) {\n" +
                            "char* s = malloc(256);\n" +
                            "sprintf(s, \"%s%s\", s1, i);\n" +
                            "return s;\n" +
                        "}\n";
            for(VarDeclOp varDecl : varDeclList){
                if(varDecl != null){
                    codiceC += (varDecl).accept(this);
                }
            }
            globalVarDecl = false;
            for(IsMainFunOp funOp : funList){
                if(funOp != null){
                    codiceC += (funOp).accept(this);
                }
            }
            activeStackScope.pop();
            return codiceC;
        }
        if(node instanceof VarDeclOp){
            String varType = ((VarDeclOp) node).getVarType();
            ArrayList<IdInit> idInitList = ((VarDeclOp) node).getIdInitList();
            if(globalVarDecl){
                for (IdInit idInit : idInitList) {
                    String cType = typeConverter(XMLVisitor.numericToStringType(idInit.getId().getType()));
                    if(varType.equals("VAR")) {
                        if(idInit.getCostante() != null && !cType.equals("STRING")) {
                            codiceC += cType + " " +idInit.getId().getNameId() + " = ";
                            codiceC += idInit.getCostante().accept(this) + ";";
                        }
                        else if(idInit.getCostante() != null && cType.equals("STRING")){
                            codiceC += "char *" + idInit.getId().getNameId() + " = " + idInit.getCostante().accept(this)+";";
                        }
                        else{
                            if(cType.equals("STRING")) {
                                codiceC += "char *" + idInit.getId().getNameId() + ";";
                            } else {
                                codiceC += cType + " " + idInit.getId().getNameId() + ";";
                            }
                        }
                    }
                    else{
                        if(idInit.getExprNode() != null) {
                            if(typeConverter(varType).equals("STRING")){
                                if(idInit.getExprNode() instanceof BiExprNode){
                                    throw new Error("Errore nella dichiarazione della variabile globale "+ idInit.getId().getNameId() +". Per dichiarare una concatenazioni di stringhe costanti utilizza il tipo var al posto di string");
                                }
                                codiceC += "char *" + idInit.getId().getNameId() + " = " + idInit.getExprNode().accept(this)+";";
                            }
                            else{
                                codiceC +=  "#define " + idInit.getId().getNameId() + " ("+cType+") ";
                                codiceC += idInit.getExprNode().accept(this);
                            }
                        }
                        else{
                            if(typeConverter(varType).equals("STRING")){
                                codiceC += "char *" + idInit.getId().getNameId() + ";";
                            }
                            else{
                                codiceC += typeConverter(varType) + " " + idInit.getId().getNameId() + ";";
                            }
                        }
                    }
                    codiceC += "\n";
                }
            }
            else{
                if (varType.equals("VAR")) {
                    for (IdInit idInit : idInitList) {
                        String cType = typeConverter(XMLVisitor.numericToStringType(idInit.getId().getType()));
                        if (cType.equals("STRING")) {
                            codiceC += "char *" + idInit.getId().getNameId() + " = " + idInit.getCostante().accept(this) + ";\n";
                        } else {
                            codiceC += cType + " " + idInit.getId().getNameId() + " = " + idInit.getCostante().accept(this) + ";\n";
                        }
                    }
                } else {
                    for (IdInit idInit : idInitList) {
                        if (typeConverter(varType).equals("STRING")) {
                            codiceC += "char *" + idInit.getId().getNameId();
                            if (idInit.getExprNode() == null) {
                                codiceC += " = \"\"";
                            }
                        }
                        else {
                            codiceC += typeConverter(varType) + " " + idInit.getId().getNameId();
                        }
                        if (idInit.getExprNode() != null) {
                            codiceC += " = " + idInit.getExprNode().accept(this);
                        }
                        codiceC += ";\n";
                    }
                }
            }
            return codiceC;
        }
        if(node instanceof IsMainFunOp){
            FunOp funOp = ((IsMainFunOp) node).getFunOp();
            activeStackScope.push(funOp.getSymbolTable());
            if(((IsMainFunOp) node).isMain()){
                codiceC += "// MAIN FUNCTION\n";
                codiceC += "int main(int argc, char** argv){\n";
                codiceC += funOp.getId().getNameId()+"(";
                if(funOp.getParDeclList() != null){
                    for (ParDeclOp param : funOp.getParDeclList()) {
                        for(int j=0;j<param.getIdList().size();j++){
                            if (param.getType() == sym.INTEGER) {
                                codiceC += "0";
                            }
                            if (param.getType() == sym.REAL) {
                                codiceC += "0.0";
                            }
                            if (param.getType() == sym.STRING) {
                                codiceC += "\"\"";
                            }
                            if (param.getType() == sym.CHAR) {
                                codiceC += "\'\'";
                            }
                            if (param.getType() == sym.BOOL) {
                                codiceC += "false";
                            }
                            codiceC += ",";
                        }
                    }
                    codiceC = codiceC.substring(0,codiceC.length()-1);
                }
                codiceC += ");\n";
                codiceC += "return (EXIT_SUCCESS);\n}\n";
            }
            codiceC += typeConverter(funOp.getReturnType())+ " "+ funOp.getId().getNameId()+"(";
            ArrayList<ParDeclOp> parList = funOp.getParDeclList();
            if(parList != null) {
                for (ParDeclOp param : parList) {
                    codiceC += param.accept(this);
                }
                codiceC = codiceC.substring(0,codiceC.length()-1);
            }
            codiceC += "){\n";
            codiceC += funOp.getBody().accept(this);
            codiceC += "}\n";

            activeStackScope.pop();
            return codiceC;
        }
        if(node instanceof ParDeclOp){
            String type = typeConverter(((ParDeclOp) node).getVarType());
            ArrayList<IdInit> idInitList = ((ParDeclOp) node).getIdList();
            for(IdInit idInit : idInitList){
                if(typeConverter(type).equals("STRING")){
                    codiceC += "char *";
                }
                else {
                    codiceC += type + " ";
                }
                if(((ParDeclOp) node).getMode().equals("OUT")){
                    codiceC += "*";
                }
                codiceC += idInit.getId().getNameId()+",";
            }
            return codiceC;
        }
        if(node instanceof BodyOp){
            ArrayList<VarDeclOp> varDeclList = ((BodyOp) node).getVarDeclListOp();
            ArrayList<StatOp> statList = ((BodyOp) node).getStatList();
            Collections.reverse(statList);
            Collections.reverse(varDeclList);
            // riordino le dichiarazioni di variabili, mettendo per ultime quelle con altre variabili a destra dell'espressione
            ArrayList<VarDeclOp> list1 = new ArrayList<>();
            ArrayList<VarDeclOp> list2 = new ArrayList<>();
            for(VarDeclOp var : varDeclList){
                for(IdInit init : var.getIdInitList()){
                    if(init.getExprNode() == null){
                        list1.add(var);
                        break;
                    }
                    else{
                        list2.add(var);
                        break;
                    }
                }
            }
            list1.addAll(list2);
            varDeclList.clear();
            varDeclList.addAll(list1);
            for(VarDeclOp varDecl : varDeclList){
                if(varDecl != null){
                    codiceC += (varDecl).accept(this);
                }
            }
            for(StatOp stat : statList){
                if(stat != null){
                    codiceC += (stat).accept(this);
                }
            }
            return codiceC;
        }
        if(node instanceof CallParamOp){
            if(((CallParamOp)node).isOut()){
                codiceC += "&";
            }
            codiceC += ((CallParamOp)node).getExpr().accept(this);
        }
        if(node instanceof StatOp){
            if(node instanceof ForStatOp){
                activeStackScope.push(((ForStatOp) node).getSymbolTable());
                String index = ((ForStatOp) node).getIndex().getNameId();
                String const1 = ((ForStatOp) node).getConst1().getConstante();
                String const2 = ((ForStatOp) node).getConst2().getConstante();
                codiceC += "int "+index+";\n";
                codiceC += "for("+index+" = "+const1+";"+index+" <= "+ const2+";"+index+"++){\n";
                codiceC += ((ForStatOp) node).getBody().accept(this)+"}\n";
                activeStackScope.pop();
            }
            if(node instanceof WhileOp){
                activeStackScope.push(((WhileOp) node).getSymbolTable());
                codiceC += "while(";
                codiceC += ((WhileOp) node).getExpr().accept(this) + "){\n";
                codiceC += ((WhileOp) node).getBody().accept(this) + "}\n";
                activeStackScope.pop();
            }
            if(node instanceof IfStatOp){
                activeStackScope.push(((IfStatOp) node).getSymbolTable());
                codiceC += "if(";
                codiceC += ((IfStatOp) node).getExpr().accept(this) + "){\n";
                codiceC += ((IfStatOp) node).getBodyOp().accept(this) + "}\n";
                if(((IfStatOp) node).getElseBodyOp() != null){
                    codiceC += "else{\n";
                    codiceC += ((IfStatOp) node).getElseBodyOp().accept(this);
                    codiceC += "}\n";
                }
                activeStackScope.pop();
            }
            if(node instanceof AssignOp){
                ArrayList<IdInit> idInitList = ((AssignOp) node).getIdList();
                ArrayList<ExprNode> exprList = ((AssignOp) node).getExprList();
                if(exprList.size() == 1){
                    for(IdInit idInit : idInitList){
                        codiceC += idInit.getId().accept(this) + " = " + exprList.get(0).accept(this) + ";\n";
                    }
                }
                else {
                    for (int i = 0; i < idInitList.size(); i++) {
                        codiceC += idInitList.get(i).getId().getNameId() + " = ";
                        codiceC += exprList.get(i).accept(this) + ";\n";
                    }
                }
            }
            if(node instanceof WriteOp){
                ArrayList<ExprNode> exprList = ((WriteOp) node).getExprNodesList();
                Collections.reverse(exprList);
                for(ExprNode expr : exprList){
                    codiceC += "printf(";
                    codiceC += getFormato(expr.getType())+","+expr.accept(this) + ");\n";
                }
                if(((WriteOp) node).getWriteType() == "WRITELN"){
                    codiceC += "printf(\"\\n\");\n";
                }
            }
            if(node instanceof ReadOp){
                ArrayList<IdInit> idInitList = ((ReadOp) node).getIdList();
                if(((ReadOp) node).getStringConst() != null){
                    codiceC += "printf(\"" + ((ReadOp) node).getStringConst().getConstante() + "\");\n";
                }
                for(IdInit idInit : idInitList){
                    if(idInit.getId().getType() == sym.STRING){
                        codiceC += idInit.getId().getNameId() + " = malloc(256);\n";
                        codiceC += "scanf(" + getFormato(idInit.getId().getType()) + "," + idInit.getId().getNameId() + ");\n";
                    }
                    else {
                        codiceC += "scanf(" + getFormato(idInit.getId().getType()) + ",&" + idInit.getId().getNameId() + ");\n";
                    }
                }
            }
            if(node instanceof ReturnStatOp){
                codiceC += "return " + ((ReturnStatOp) node).getReturnExpr().accept(this) + ";\n";
            }
        }
        if(node instanceof ExprNode){
            if(node instanceof BiExprNode){
                ExprNode expr1 = ((BiExprNode) node).getExprNode1();
                ExprNode expr2 = ((BiExprNode) node).getExprNode2();
                if((expr1.getType() == sym.STRING || expr1.getType() == sym.CHAR) && ((((BiExprNode) node).getNome().equals("EQ")) || ((BiExprNode) node).getNome().equals("NE"))){
                    if(((BiExprNode) node).getNome().equals("EQ")){
                        codiceC += "!strcmp(" + expr1.accept(this)+ "," + expr2.accept(this) + ")";
                    }
                    else if(((BiExprNode) node).getNome().equals("NE")){
                        codiceC += "strcmp(" + expr1.accept(this)+ "," + expr2.accept(this) + ")";
                    }

                }
                else if(((BiExprNode) node).getNome().equals("POW")){
                    codiceC += "pow((float)(" + expr1.accept(this) + "), (float)(" + expr2.accept(this) + "))";
                }
                else if(((BiExprNode) node).getNome().equals("STR_CONCAT")){
                    codiceC += "concat(" + exprStringConverter(expr1) + "," + exprStringConverter(expr2) + ")";
                }
                else {
                    codiceC += "(";
                    codiceC += expr1.accept(this);
                    if (((BiExprNode) node).getNome().equals("PLUS")) {
                        codiceC += " + ";
                    }
                    if (((BiExprNode) node).getNome().equals("MINUS")) {
                        codiceC += " - ";
                    }
                    if (((BiExprNode) node).getNome().equals("TIMES")) {
                        codiceC += " * ";
                    }
                    if (((BiExprNode) node).getNome().equals("DIV")) {
                        codiceC += " / ";
                    }
                    if (((BiExprNode) node).getNome().equals("AND")) {
                        codiceC += " && ";
                    }
                    if (((BiExprNode) node).getNome().equals("OR")) {
                        codiceC += " || ";
                    }
                    if (((BiExprNode) node).getNome().equals("GT")) {
                        codiceC += " > ";
                    }
                    if (((BiExprNode) node).getNome().equals("GE")) {
                        codiceC += " >= ";
                    }
                    if (((BiExprNode) node).getNome().equals("LT")) {
                        codiceC += " < ";
                    }
                    if (((BiExprNode) node).getNome().equals("LE")) {
                        codiceC += " <= ";
                    }
                    if (((BiExprNode) node).getNome().equals("EQ")) {
                        codiceC += " == ";
                    }
                    if (((BiExprNode) node).getNome().equals("NE")) {
                        codiceC += " != ";
                    }
                    codiceC += expr2.accept(this);
                    codiceC += ")";
                }
            }
            if(node instanceof IdExprNode){
                String str = "";
                String nomeId = ((IdExprNode) node).getNameId();
                SymbolRecord record = getFromScope(nomeId);
                if(record.isPointer()){
                    str += "*";
                }
                return str+nomeId;
            }
            if(node instanceof ConstExprNode){
                if(((ConstExprNode) node).getNome().equals("STRING_CONST")){
                    return "\"" + ((ConstExprNode) node).getConstante() + "\"";
                }
                if(((ConstExprNode) node).getNome().equals("CHAR_CONST")){
                    return "\"" + ((ConstExprNode) node).getConstante() + "\"";
                }
                return ((ConstExprNode) node).getConstante();
            }
            if(node instanceof UnExprNode){
                if(((UnExprNode) node).getNome().equals("MINUS")){
                    codiceC += ((UnExprNode) node).getExprNode().accept(this) + " * (-1)";
                }
                if(((UnExprNode) node).getNome().equals("NOT")){
                    codiceC += "!("+((UnExprNode) node).getExprNode().accept(this)+")";
                }
                return codiceC;
            }
            if(node instanceof CallFunOp){
                codiceC += ((CallFunOp) node).getId().getNameId() + "(";
                ArrayList<CallParamOp> exprList = ((CallFunOp) node).getExprList();
                if(exprList != null) {
                    Collections.reverse(exprList);
                    for (CallParamOp expr : exprList) {
                        codiceC += expr.accept(this) + ",";
                    }
                    codiceC = codiceC.substring(0,codiceC.length()-1);
                }
                if(((CallFunOp) node).isExpr()){
                    codiceC += ")";
                }
                else{
                     codiceC += ");\n";
                }
            }
            return codiceC;
        }
        return codiceC;
    }

    public String typeConverter(String type){
        switch (type) {
            case "STRING":
                return "STRING";
            case "REAL":
                return "float";
            case "BOOL":
                return "int";
            case "INTEGER":
                return "int";
            case "CHAR":
                return "char";
            case "VOID":
                return "void";
            default:
                return "ERROR";
        }
    }

    private String getFormato(int type){
        switch (type) {
            case sym.INTEGER:
            case sym.BOOL:
                return "\"%d\"";
            case sym.REAL:
                return "\"%f\"";
            case sym.CHAR:
                return "\"%c\"";
            case sym.STRING:
                return "\"%s\"";
            default:
                return "ERROR";
        }
    }

    private String exprStringConverter(ExprNode expr){
        String str = "";
        if(expr instanceof BiExprNode){
            str = (String) expr.accept(this);
            if(expr.getNome().equals("STR_CONCAT") || expr.getNome().equals("POW")){
                return str;
            }
        }
        if(expr instanceof ConstExprNode){
            str = (String) expr.accept(this);
            if(expr.getNome().equals("STRING_CONST") || expr.getNome().equals("CHAR_CONST")){
                return str;
            }
        }
        if(expr instanceof UnExprNode){
            str = (String) expr.accept(this);
        }
        if(expr instanceof IdExprNode){
            String var = ((IdExprNode) expr).getNameId();
            if(expr.getType() == sym.INTEGER) {
                return "intToString("+var+")";
            }
            if(expr.getType() == sym.REAL) {
                return "doubleToString("+var+")";
            }
            if(expr.getType() == sym.BOOL) {
                return "boolToString("+var+")";
            }
            return var;
        }
        return "\""+str+"\"";
    }
    private SymbolRecord getFromScope(String id){
        Stack<SymbolTable> stack = (Stack) activeStackScope.clone();
        while(!stack.isEmpty()){
            SymbolTable sTable = stack.pop();
            if(sTable.containsKey(id)){
                return sTable.get(id);
            }
        }
        throw new UndeclaredVariableException(id);
    }
}




