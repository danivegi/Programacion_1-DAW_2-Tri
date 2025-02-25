package vista;

import ejercicios.TarjetaRegalo;
import equals.EstudioEquals;
import excepciones.CampoVacioException;
import excepciones.DniException;
import excepciones.SaldoInsuficienteException;
import herencia.Consultor;
import herencia.Empleado;
import herencia.Trabajador;
import modelo.Bicicleta;
import modelo.Circulo;
//import modelo.Persona;
import modelo.Persona1;
import modelo.Punto;
import modelo.Rectangulo;

public class Main {

    public static void main(String[] args) throws CampoVacioException {
        System.out.println("Programación Orientada a Objetos");
        // estudioClasePersona();
        // estudioConstructores();
        // ClaseDni();
        // PasoValorReferencia();
        // Modificadores();
        // metodosEstaticos();
        // herencia();
        // olimorfismo();
        // interfaces();
        // EstudioEquals estudioEquals = new EstudioEquals();
        corteIrlandes();

    }

    private static void corteIrlandes() {
        TarjetaRegalo t1 = new TarjetaRegalo("100");
        TarjetaRegalo t2 = new TarjetaRegalo("120");
        System.out.println(t1);
        System.out.println(t2);
        try {
            t1.gasta(45);
            t2.gasta(5);
            t2.gasta(100);
            t1.gasta(3.55);
            System.out.println(t1);
            System.out.println(t2);
            TarjetaRegalo t3 = t1.fusionaCon(t2);
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);

        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void interfaces() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interfaces'");
    }

    public static void imprimeNombreYPaga(Trabajador t) {
        System.out.printf("El trabajador %s tiene una paga de %.2f %n", t.getNombre(), t.calcularPaga());
    }

    public static void saludar(Trabajador t) {
        System.out.println("Hola, " + t.getNombre());
    }

    private static void polimorfismo() {
        Trabajador trabajador;
        Trabajador empleado;
        Trabajador consultor;

        trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
        empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
        consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);

        imprimeNombreYPaga(trabajador);
        imprimeNombreYPaga(empleado);
        imprimeNombreYPaga(consultor);

        saludar(trabajador);
        saludar(empleado);
        saludar(consultor);
    }

    private static void herencia() {
        Trabajador trabajador = new Trabajador("Dani", "Programador", "Calle Vino Fino", "601076153", "1122334455");
        System.out.println(trabajador);
        System.out.println(trabajador.calcularPaga());

        Empleado empleado = new Empleado("Marypaz", "Regidora", "Calle EAQyR", "601076157", "1122334455", 100000.0,
                1000.0);
        System.out.println(empleado);
        System.out.println(empleado.calcularPaga());

        Consultor consultor = new Consultor("Leire", "Limpiadora", "Calle Almeria", "656985745", "1234512345", 100,
                50.0);
        System.out.println(consultor);
        System.out.println(consultor.calcularPaga());
    }

    private static void metodosEstaticos() {
        Bicicleta bici1 = new Bicicleta(21, 27, 0);
        Bicicleta bici2 = new Bicicleta(18, 24, 0);

        System.out.println(bici1);
        System.out.println(bici2);

        System.out.println(Bicicleta.getNumeroDeBicicletas());
    }

    private static void Modificadores() {

    }

    private static void PasoValorReferencia() {
        // Crear clase Circulo y método mueveCirculo
        Circulo circulo = new Circulo(2, 3);
        System.out.println(circulo);
        mueveCirculo(circulo, 20, 30);
        System.out.println(circulo);
    }

    private static void mueveCirculo(Circulo c, int i, int j) {
        c.setX(i);
        c.setY(j);
        c = new Circulo(5, 5);
        System.out.println(c);
    }

    private static void ClaseDni() throws CampoVacioException {

        try {
            Persona1 persona = new Persona1("Daniel", "Vega", "32098557X");
            System.out.println(persona);
            System.out.println("Edad: " + persona.getEdad());
            persona.setEdad(25);
            System.out.println("Nueva edad: " + persona.getEdad());
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }

        Punto punto = new Punto(2, 3);
        Punto punto1 = new Punto(5, 3);
        Punto punto2 = new Punto(2, 0);
        Punto punto3 = new Punto(-2, 3);
        Punto[] puntos = { punto, punto1, punto2, punto3 };
        Rectangulo rectangulo = new Rectangulo(punto, punto1, punto2, punto3);
        Rectangulo rectangulo2 = new Rectangulo(puntos);
        System.out.println(rectangulo);
        rectangulo = null;
    }

    /*
     * private static void estudioConstructores() {
     * Persona1 persona = new Persona1("Pepe", "García", 20);
     * System.out.println(persona);
     * }
     * 
     * private static void estudioClasePersona() {
     * Persona persona;
     * persona = new Persona();
     * persona.nombre = "Dani";
     * System.out.println(persona.nombre);
     * System.out.println();
     * persona = null;
     * persona = new Persona();
     * persona.nombre = "Marypaz";
     * System.out.println(persona.nombre);
     * Persona persona2 = new Persona();
     * persona2.nombre = "Jesus";
     * System.out.println(persona2.nombre);
     * Persona persona3 = new Persona();
     * persona3.nombre = "Marypaz";
     * System.out.println(persona3.nombre);
     * System.out.println(persona.equals(persona3));
     * }
     */

}
