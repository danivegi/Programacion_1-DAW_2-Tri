package herencia;

public class Consultor extends Trabajador{

    private int horas;
    private double tarifas;

    public Consultor() {

    }

    public Consultor(String nombre, String puesto, String direccion, String telefono, String nSS, int horas,
            double tarifas) {
        super(nombre, puesto, direccion, telefono, nSS);
        this.horas = horas;
        this.tarifas = tarifas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifas() {
        return tarifas;
    }

    public void setTarifas(double tarifas) {
        this.tarifas = tarifas;
    }

    public double calcularPaga() {
        return horas*tarifas;
    }

    

}
