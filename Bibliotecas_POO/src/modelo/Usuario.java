package modelo;

import excepciones.CamposVacioException;
import excepciones.DniException;

public class Usuario {

	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;

	// Constructor vacío
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String apellido, String dni, Direccion direccion) throws DniException, CamposVacioException {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws CamposVacioException{
		this.nombre = nombre;
		if (nombre.isEmpty())
			throw new CamposVacioException("El campo nombre está vacío");
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws CamposVacioException{
		this.apellido = apellido;
		if (apellido.isEmpty()) 
			throw new CamposVacioException("El campo apellido está vacío");
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws DniException{
	
		this.dni = dni;
		
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni.length() != 9)
            throw new DniException("Dni incorrecto");
        String numDniC = dni.substring(0, 8);
        char letraDni = dni.charAt(8);
        int num = 0;

        try { 
            num = Integer.parseInt(numDniC);
        } catch (NumberFormatException e) {
            throw new DniException("Dni incorrecto");
        }

        int resto = num % 23;

        if (letrasDni.charAt(resto) != letraDni) {
            throw new DniException("Dni incorrecto");
        }
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
