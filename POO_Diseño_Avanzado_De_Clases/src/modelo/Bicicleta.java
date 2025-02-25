package modelo;

public class Bicicleta {

    private int numMarchas;
    private int diametroRueda;

    public Bicicleta() {

    }

    public Bicicleta(int numMarchas, int diametroRueda) {
        this.numMarchas = numMarchas;
        this.diametroRueda = diametroRueda;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + "]";
    }

    

}
