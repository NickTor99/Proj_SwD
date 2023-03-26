package exceptions;

public class UndeclaredVariableException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UndeclaredVariableException(String nameId) {
        super("Variabile o funzione " + nameId + " non dichiarata!");
    }
}