package modelo;

public class Bicicleta {

    private int numMarchas;
    private int diametroRuedas;
    private int velocidad;
    private int id;
    // Compartida para todas las instancias
    private static int numeroDeBicicletas = 0;


    public Bicicleta(int numMarchas, int diametroRuedas, int velocidad) {
        this.numMarchas = numMarchas;
        this.diametroRuedas = diametroRuedas;
        this.velocidad = velocidad;
        id = ++numeroDeBicicletas;
    }


    public int getNumMarchas() {
        return numMarchas;
    }


    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }


    public int getDiametroRuedas() {
        return diametroRuedas;
    }


    public void setDiametroRuedas(int diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }


    public int getVelocidad() {
        return velocidad;
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public static int getNumeroDeBicicletas() {
        return numeroDeBicicletas;
    }


    public static void setNumeroDeBicicletas(int numeroDeBicicletas) {
        Bicicleta.numeroDeBicicletas = numeroDeBicicletas;
    }

    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRuedas=" + diametroRuedas + ", velocidad=" + velocidad
                + ", id=" + id + "]";
    }
    
}
