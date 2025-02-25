package metodos;

import java.util.List;
import listas.ListaAlumnos;
import modelo.Alumno;

//Filtrar Alumnos con Nota Mayor a 7

public class FiltrarAlumnos {
	public static void main(String[] args) {
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
		System.out.println(" Alumnos con nota superior a 7:");
		// Usa streams para filtrar y mostrar los alumnos con nota media superior a 7
        alumnos.stream()
               .filter(alumno -> alumno.getNotaMedia() > 7) // Filtra los alumnos con nota mayor a 7
               .forEach(System.out::println); // Imprime cada alumno que cumple la condición
	}
	
	

}
