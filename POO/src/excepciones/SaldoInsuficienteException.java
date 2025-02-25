package excepciones;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("El saldo es insuficiente.");
    }

}
