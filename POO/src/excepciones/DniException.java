package excepciones;

public class DniException extends Exception{

    public DniException() {
        super("El DNI es incorrecto.");
    }

}
