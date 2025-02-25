package herencia;

public class Trabajador {

    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private String nSS;

    private static final double SALARIO_BASE = 30000.0;

    public Trabajador() {
        
    }

    public Trabajador(String nombre, String puesto, String direccion, String telefono, String nSS) {
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setnSS(nSS);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getnSS() {
        return nSS;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    public static double getSalarioBase() {
        return SALARIO_BASE;
    }

    public double calcularPaga() {
        return SALARIO_BASE;
    }

    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
                + telefono + ", nSS=" + nSS + "]";
    }

    

}
