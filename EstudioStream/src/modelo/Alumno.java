package modelo;

public class Alumno {

	// Atributos
	private String nombre;
	private String curso;
	private double notaMedia;

	// Constructor vacío
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	//Constructor con atributos
	public Alumno(String nombre, String curso, double notaMedia) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	//To String
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notaMedia=" + notaMedia + "]";
	}
	

}
