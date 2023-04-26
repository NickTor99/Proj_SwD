package table;

import java.util.ArrayList;

public class SymbolRecord {
    private String symbolName;
    private String kind;
    private int type;
    private ArrayList<Integer> paramsType;
    private ArrayList<Boolean> paramsOut;
    private int returnType;
    private boolean pointer = false;

    public SymbolRecord() {

    }

    public SymbolRecord(String symbolName, String kind, int type) {
        this.symbolName = symbolName;
        this.kind = kind;
        this.type = type;
    }

    public SymbolRecord(String symbolName, String kind, int type,boolean pointer) {
        this.symbolName = symbolName;
        this.kind = kind;
        this.type = type;
        this.pointer = pointer;
    }

    public SymbolRecord(String symbolName, String kind, ArrayList<Integer> paramsType,ArrayList<Boolean> paramsOut ,int returnType) {
        this.symbolName = symbolName;
        this.kind = kind;
        this.paramsType = paramsType;
        this.returnType = returnType;
        this.paramsOut = paramsOut;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList<Integer> getParamsType() {
        return paramsType;
    }

    public void setParamsType(ArrayList<Integer> paramsType) {
        this.paramsType = paramsType;
    }

    public int getReturnType() {
        return returnType;
    }

    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }

    public boolean isPointer() {
        return pointer;
    }

    public void setPointer(boolean pointer) {
        this.pointer = pointer;
    }

    public ArrayList<Boolean> getParamsOut() {
        return paramsOut;
    }

    public void setParamsOut(ArrayList<Boolean> paramsOut) {
        this.paramsOut = paramsOut;
    }

    @Override
    public String toString() {
        if(kind.equals("fun")){
            return "\n"+"SYMBOL:"+ symbolName + ", KIND:"+ kind + ", PARAM TYPES:" + paramsType + " PARAM OUT:"+ paramsOut +", RETURN TYPE:" + returnType;
        }
        if(pointer){
            return "\n"+"SYMBOL:"+ symbolName + ", KIND:"+ kind + ", TYPE:" + type + " Pointer";
        }
        return "\n"+"SYMBOL:"+ symbolName + ", KIND:"+ kind + ", TYPE:" + type;

    }
}
