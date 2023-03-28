package visitors;

import launcher.sym;
import nodes.*;

import java.util.ArrayList;

public class XMLVisitor implements Visitor {
    static final String VERDE = "\u001B[32m";
    @Override
    public String visit(AbstractSyntaxNode node) {
        String xmlString = "";

        //ProgramNode START
        if (node instanceof ProgramOp) {
            if (node != null) {
                xmlString = "<ProgramOp>" + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                ArrayList<VarDeclOp> varDeclListNode = ((ProgramOp) node).getVarDeclList();
                for (VarDeclOp varDecl : varDeclListNode) {
                    if (varDecl != null) {
                        xmlString += (varDecl).accept(this) + " ";
                    }
                }
                ArrayList<IsMainFunOp> funListNode = ((ProgramOp) node).getFunList();
                for (IsMainFunOp funOp : funListNode) {
                    if (funOp != null) {
                        xmlString += (funOp).accept(this) + " ";
                    }
                }
            }
            xmlString += "</ProgramOp>";
            return xmlString;
        }
        //ProgramNode END

        //FunNode START
        if (node instanceof IsMainFunOp) {
            if (node != null) {
                xmlString = "<FunOp>";
                FunOp funOp = ((IsMainFunOp) node).getFunOp();
                xmlString += funOp.getId().accept(this);
                if(((IsMainFunOp) node).isMain()){
                    xmlString += "<isMain>" + "True" + "</isMain> ";
                }
                else {
                    xmlString += "<isMain>" + "False" + "</isMain> ";
                }
                ArrayList<ParDeclOp> paramDeclList = funOp.getParDeclList();
                if(paramDeclList != null){
                    for (ParDeclOp parDecl : paramDeclList) {
                        if (parDecl != null) {
                            xmlString += (parDecl).accept(this);
                        }
                    }
                }
                xmlString += "<Return_Type>"+ funOp.getReturnType() + "</Return_Type> ";
                xmlString += funOp.getBody().accept(this);
                xmlString += "</FunOp>";
            }
            return xmlString;
        }
        //FunNode END


        //VarDeclNode START
        if (node instanceof VarDeclOp) {
            if (node != null) {
                xmlString = "<VarDeclOp>";
                if (((VarDeclOp) node).getVarType() != null) {
                    xmlString += "<Type>" + ((VarDeclOp) node).getVarType() + "</Type>\n";
                }
                ArrayList<IdInit> idInit = ((VarDeclOp) node).getIdInitList();
                for (IdInit init : idInit) {
                    if (init != null) {
                        xmlString += (init).accept(this);
                    }
                }
                xmlString += "</VarDeclOp>";
            }
            return xmlString;
        }
        //VarDeclNode END


        //InitNode START
        if (node instanceof IdInit) {
            if (node != null) {
                xmlString = "<IdInit> "  + "<Type>" + numericToStringType(node.getType()) + "</Type>";;
                xmlString += ((IdInit) node).getId().accept(this);

                if (((IdInit) node).getExprNode() != null) {
                    xmlString += ((IdInit) node).getExprNode().accept(this);
                }
                if (((IdInit) node).getCostante() != null) {
                    xmlString += ((IdInit) node).getCostante().accept(this);
                }
                xmlString += "</IdInit>";
            }
            return xmlString;
        }
        //InitNode END

        //ParamDeclNode START
        if (node instanceof ParDeclOp) {
            if (node != null) {
                xmlString = "<ParDeclOp>";
                xmlString += "<Mode>" + ((ParDeclOp) node).getMode() + "</Mode> ";
                xmlString += "<Type>" + ((ParDeclOp) node).getVarType() + "</Type> ";
                ArrayList<IdInit> idInit = ((ParDeclOp) node).getIdList();
                for (IdInit init : idInit) {
                    if (init != null) {
                        xmlString += (init).accept(this);
                    }
                }
                xmlString += "</ParDeclOp>";
            }
            return xmlString;
        }
        //ParamDeclNode END

        if (node instanceof BodyOp){
            if(node != null){
                xmlString = "<BodyOp>"  + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                ArrayList<VarDeclOp> varDeclList = ((BodyOp) node).getVarDeclListOp();
                for(VarDeclOp varDecl : varDeclList){
                    if(varDecl != null){
                        xmlString += (varDecl).accept(this);
                    }
                }
                ArrayList<StatOp> statList = ((BodyOp) node).getStatList();
                for(StatOp stat : statList){
                    if(stat != null){
                        xmlString += (stat).accept(this);
                    }
                }
                xmlString += "</BodyOp>";
            }
        }

        //ExprNode START
        if (node instanceof ExprNode) {
            if (node != null) {
                if (node instanceof WhileOp) {
                    xmlString += "<WhileOp>" + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((WhileOp) node).getExpr().accept(this);
                    xmlString += ((WhileOp) node).getBody().accept(this);
                    xmlString += "</WhileOp>";
                }

                if(node instanceof ForStatOp) {
                    xmlString += "<ForStatOp>"  + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((ForStatOp) node).getIndex().accept(this);
                    xmlString += ((ForStatOp) node).getConst1().accept(this);
                    xmlString += ((ForStatOp) node).getConst2().accept(this);
                    xmlString += ((ForStatOp) node).getBody().accept(this);
                    xmlString += "</ForStatOp>";
                }

                if (node instanceof IfStatOp) {
                    xmlString += "<IfStatOp>" + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((IfStatOp) node).getExpr().accept(this);
                    xmlString += ((IfStatOp) node).getBodyOp().accept(this);
                    if(((IfStatOp) node).getElseBodyOp() != null){
                        xmlString += ((IfStatOp) node).getElseBodyOp().accept(this);
                    }
                    xmlString += "</IfStatOp>";
                }

                if (node instanceof WriteOp) {
                    xmlString += "<WriteOp>"  + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += "<Write_Type>" + ((WriteOp) node).getWriteType() + "</Write_Type> ";
                    ArrayList<ExprNode> exprList = ((WriteOp) node).getExprNodesList();
                    for(ExprNode expr : exprList){
                        if(expr != null){
                            xmlString += (expr).accept(this);
                        }
                    }
                    xmlString += "</WriteOp>";
                }

                if (node instanceof AssignOp) {
                    xmlString += "<AssignOp>"  + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    ArrayList<IdInit> idList = ((AssignOp) node).getIdList();
                    for(IdInit id : idList){
                        if(id != null){
                            xmlString += (id).accept(this);
                        }
                    }
                    ArrayList<ExprNode> exprList = ((AssignOp) node).getExprList();
                    for(ExprNode expr : exprList){
                        if(expr != null){
                            xmlString += (expr).accept(this);
                        }
                    }
                    xmlString += "</AssignOp>";
                }

                if (node instanceof ReadOp) {
                    xmlString += "<ReadOp>" + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    ArrayList<IdInit> idList = ((ReadOp) node).getIdList();
                    for (IdInit id : idList) {
                        if (id != null) {
                            xmlString += id.accept(this);
                        }
                    }
                    if (((ReadOp) node).getStringConst() != null) {
                        xmlString += ((ReadOp) node).getStringConst().accept(this);
                    }
                    xmlString += "</ReadOp>";
                }

                if (node instanceof ReturnStatOp) {
                    xmlString += "<Return>";
                    xmlString += ((ReturnStatOp) node).getReturnExpr().accept(this);
                    xmlString += "</Return>";
                }

                if (node instanceof CallFunOp) {
                    xmlString += "<CallFunOp>" + "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((CallFunOp) node).getId().accept(this);
                    ArrayList<CallParamOp> exprList = ((CallFunOp) node).getExprList();
                    xmlString += "<Parametri>";
                    if(exprList != null) {
                        for (CallParamOp cExpr : exprList) {
                            ExprNode expr = cExpr.getExpr();
                            if (expr != null) {
                                xmlString += expr.accept(this);
                            }
                        }
                    }
                    xmlString += "</Parametri>";
                    xmlString += "</CallFunOp>";
                }

                if (node instanceof BiExprNode) {
                    xmlString += "<BiExprNode>"+ "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((BiExprNode) node).getExprNode1().accept(this);
                    xmlString += "<Operatore>"+((BiExprNode) node).getNome()+"</Operatore> ";
                    xmlString += ((BiExprNode) node).getExprNode2().accept(this);
                    xmlString += "</BiExprNode>";
                }
                if (node instanceof UnExprNode) {
                    xmlString += "<UnExprNode>"+ "<Type>" + numericToStringType(node.getType()) + "</Type>";
                    xmlString += ((UnExprNode) node).getExprNode().accept(this);
                    xmlString += "<Name>"+((UnExprNode) node).getNome()+"</Name> ";
                    xmlString += "</UnExprNode>";
                }
                if (node instanceof IdExprNode) {
                    xmlString +="<ID>" + ((IdExprNode) node).getNameId()+ "<Type>" + numericToStringType(node.getType()) + "</Type>" + "</ID>";
                }
                if (node instanceof ConstExprNode) {
                    xmlString +="<CONST>" + ((ConstExprNode) node).getNome() + "," + ((ConstExprNode) node).getConstante() + "</CONST> ";
                }
            }
            return xmlString;
        } //ExprNode END
        return xmlString;
    }

    static public String numericToStringType(int numericType){
        switch (numericType) {
            case sym.INTEGER:
                return "INTEGER";
            case sym.REAL:
                return "REAL";
            case sym.BOOL:
                return "BOOL";
            case sym.STRING:
                return "STRING";
            case sym.CHAR:
                return "CHAR";
            case sym.VOID:
                return "VOID";
            default:
                return "ERROR";
        }
    }
}
