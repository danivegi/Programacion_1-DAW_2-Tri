package modelo;

import excepciones.CampoVacioException;
import excepciones.DniException;

public class Persona1 {

    // Estructura, conocida como propiedades o atributos. Tienen que ser privados
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private String dni;
    private float peso;

    

    public Persona1(String nombre, String apellido, int edad, int altura, String dni, float peso) throws DniException, CampoVacioException {
        this(nombre, apellido, dni);
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona1(String nombre, String apellido, String dni) throws DniException, CampoVacioException{
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
    }

    public Persona1(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona1(String nombre, String apellido, int edad, int altura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CampoVacioException {
        if (nombre.length() == 0) {
            throw new CampoVacioException();
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws CampoVacioException {
        if (apellido.length() == 0) {
            throw new CampoVacioException();
        }
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona1 [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + dni + "]";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniException {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni.length() != 9) {
            throw new DniException();
        }

        /* String numDni = dni.substring(0, 8);
        
        char letraDni = dni.charAt(8);
        int num = 0; 

        try {
            
            num = Integer.parseInt(numDni);
        } catch (NumberFormatException e) {
            
            throw new DniException();
        }

        
        int resto = num % 23;

        
        if (letrasDNI.charAt(resto) != letraDni) {
            throw new DniException(); 
        } else {
            
            System.out.println("El DNI es correcto.");
        }*/
    
        this.dni=dni;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona1 other = (Persona1) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    

}
