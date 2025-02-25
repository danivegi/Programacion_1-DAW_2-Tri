package modelo;

public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public int altura;
    public float peso;

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    public void hablar() {
        System.out.println("Estoy hablando");
    }

    public void nacer() {
        System.out.println("¡¡¡Acabo de nacer!!!");
    }

    public void morir() {
        System.out.println("¡Hasta más ver!");
    }
}
