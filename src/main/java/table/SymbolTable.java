package table;

import java.util.HashMap;

public class SymbolTable extends HashMap<String,SymbolRecord>{
    private String nomeScope;

    private String nomeFunzione;

    public SymbolTable(String nomeScope) {
        this.nomeScope = nomeScope;
        nomeFunzione = null;
    }

    public SymbolTable(String nomeScope,String nomeFunzione) {
        this.nomeScope = nomeScope;
        this.nomeFunzione = nomeFunzione;
    }

    public String getNomeScope() {
        return nomeScope;
    }

    public void setNomeScope(String nomeScope) {
        this.nomeScope = nomeScope;
    }

    public String getNomeFunzione() {
        return nomeFunzione;
    }

    public void setNomeFunzione(String nomeFunzione) {
        this.nomeFunzione = nomeFunzione;
    }

    @Override
    public String toString() {
        return super.values().toString();
    }
}
