package excepciones;

public class CampoVacioException extends Exception{

    public CampoVacioException() {
        super("El mensaje está vacío.");
    }
}
