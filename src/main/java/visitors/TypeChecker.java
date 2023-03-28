package visitors;

import exceptions.TypeMismatchException;
import launcher.sym;

public class TypeChecker{

    public static final String ARITMETIC = "ARITMETIC";
    public static final String DIV = "DIV";
    public static final String RELOP = "RELOP";
    public static final String UMINUSOP = "UMINUSOP";
    public static final String BOOLEANOP = "BOOLEANOP";
    public static final String STRINGCONCAT = "CONCAT";
    public static final String POW = "POW";


    public static int getInferenceType(String type) {
        switch (type) {
            case "INTEGER":
            case "INTEGER_CONST":
                return sym.INTEGER;
            case "REAL":
            case "REAL_CONST":
                return sym.REAL;
            case "TRUE":
            case "FALSE":
            case "BOOL":
                return sym.BOOL;
            case "STRING":
            case "STRING_CONST":
                return sym.STRING;
            case "CHAR":
            case "CHAR_CONST":
                return sym.CHAR;
            case "VOID":
                return sym.VOID;
            default:
                return sym.error;
        }

    }

    public static int binaryOpChecker(String op,int type1, int type2){
        if(op.equals(ARITMETIC)){
            if (type1 == sym.INTEGER && type2 == sym.INTEGER) {
                return sym.INTEGER;
            } else if (type1 == sym.INTEGER && type2 == sym.REAL) {
                return sym.REAL;
            } else if (type1 == sym.REAL && type2 == sym.REAL) {
                return sym.REAL;
            } else if (type1 == sym.REAL && type2 == sym.INTEGER) {
                return sym.REAL;
            }
            throw new TypeMismatchException("Il tipo " + type1 + " e il tipo " + type2 + " sono incompatibili");
        }
        else if(op.equals(DIV)){
            if (type1 == sym.INTEGER && type2 == sym.INTEGER) {
                return sym.REAL;
            } else if (type1 == sym.INTEGER && type2 == sym.REAL) {
                return sym.REAL;
            } else if (type1 == sym.REAL && type2 == sym.REAL) {
                return sym.REAL;
            } else if (type1 == sym.REAL && type2 == sym.INTEGER) {
                return sym.REAL;
            }
            throw new TypeMismatchException("Il tipo " + type1 + " e il tipo " + type2 + " sono incompatibili");
        }
        else if(op.equals(STRINGCONCAT)){
            if(type1 != sym.VOID && type2 != sym.VOID){
                return sym.STRING;
            }
            else {
                throw new TypeMismatchException("Il tipo " + type1 + " e il tipo " + type2 + " sono incompatibili");
            }
        }
        else if(op.equals(RELOP)){
            if(type1 == sym.INTEGER){
                if(type2 == sym.REAL || type2 == sym.INTEGER){
                    return sym.BOOL;
                }
            }
            if(type1 == sym.REAL){
                if(type2 == sym.REAL || type2 == sym.INTEGER){
                    return sym.BOOL;
                }
            }
            if(type1 == sym.STRING){
                if(type2 == sym.STRING || type2 == sym.CHAR){
                    return sym.BOOL;
                }
            }
            if(type1 == sym.CHAR){
                if(type2 == sym.STRING || type2 == sym.CHAR){
                    return sym.BOOL;
                }
            }
            throw new TypeMismatchException("Il tipo" + type1 + " e il tipo " + type2 + " sono incompatibili");
        }
        else if(op.equals(BOOLEANOP)){
            if(type1 == sym.BOOL && type2 == sym.BOOL){
                return sym.BOOL;
            }
        }
        else if(op.equals(POW)){
            if(type1 == sym.INTEGER && type2 == sym.INTEGER){
                return sym.REAL;
            } else if(type1 == sym.INTEGER && type2 == sym.REAL){
                return sym.REAL;
            } else if(type1 == sym.REAL && type2 == sym.INTEGER){
                return sym.REAL;
            } else if(type1 == sym.REAL && type2 == sym.REAL){
                return sym.REAL;
            }
            throw new TypeMismatchException("Il tipo " + type1 + " e il tipo " + type2 + " sono incompatibili");
        }
        else{
            throw new TypeMismatchException("Il tipo " + type1 + " e il tipo " + type2 + " sono incompatibili");
        }
        throw new Error("Operazione non consentita");
    }

    public static int unaryOpChecker(String op, int type){
        if(op.equals(UMINUSOP)){
            if(type == sym.INTEGER){
                return sym.INTEGER;
            }
            else if( type == sym.REAL){
                return sym.REAL;
            }

            throw new Error("Operazione " + op + " non verificabile ");
        }
        else if(op.equals(BOOLEANOP)){
            if(type == sym.BOOL){
                return sym.BOOL;
            }

            throw new Error("Operazione " + op + " non verificabile ");
        }
        else{

            throw new Error("Operazione " + op + " non verificabile ");
        }

    }
    public static int AssignOpChecker(int type1, int type2) {
        if (type1 == sym.INTEGER && type2 == sym.INTEGER) {
            return sym.VOID;
        } else if (type1 == sym.REAL && type2 == sym.INTEGER) {
            return sym.VOID;
        }else if (type1 == sym.INTEGER && type2 == sym.REAL) {
            return sym.VOID;
        }else if (type1 == sym.REAL && type2 == sym.REAL) {
            return sym.VOID;
        } else if (type1 == sym.STRING && type2 == sym.STRING) {
            return sym.VOID;
        } else if (type1 == sym.BOOL && type2 == sym.BOOL) {
            return sym.VOID;
        } else if (type1 == sym.INTEGER && type2 == sym.BOOL) {
            return sym.VOID;
        } else if (type1 == sym.BOOL && type2 == sym.INTEGER) {
            return sym.VOID;
        }else if (type1 == sym.CHAR && type2 == sym.CHAR) {
            return sym.VOID;
        }

        throw new TypeMismatchException("Non è possibile assegnare il tipo " + type2 + " al tipo " + type1);

    }

    public static boolean typeCompatibility(int type1, int type2){
        if(type1 == type2){
            return true;
        }
        if(type1 == sym.REAL && type2 == sym.INTEGER){
            return true;
        }
        return false;
    }

}
