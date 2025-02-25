package herencia;

public class Empleado extends Trabajador{

    private double sueldo;
    private double impuestos;
    private final int PAGAS = 14;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS) {
        super(nombre, puesto, direccion, telefono, nSS);
    }

    public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, double sueldo,
            double impuestos) {
        super(nombre, puesto, direccion, telefono, nSS);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public int getPAGAS() {
        return PAGAS;
    }

    public double calcularPaga() {
        return (sueldo-impuestos) / PAGAS;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", PAGAS=" + PAGAS + "]";
    }

}
