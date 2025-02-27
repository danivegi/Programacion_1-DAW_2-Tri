package metodos;

import java.util.List;
import java.util.stream.Collectors;
import listas.ListaAlumnos;
import modelo.Alumno;

public class NombresAlumnos {

	public static void main(String[] args) {
		// Obtiene una lista de alumnos desde el método obtenerListaAlumnos()
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

		// Usa un stream para extraer los nombres de los alumnos y almacenarlos en una
		// nueva lista
		List<String> nombres = alumnos.stream().map(Alumno::getNombre) // Transforma cada Alumno en su nombre (String)
				.collect(Collectors.toList()); // Recoge los nombres en una lista

		// Imprime un encabezado para la lista de nombres
		System.out.println("Lista de nombres de alumnos:");

		// Imprime cada nombre en la lista
		nombres.forEach(System.out::println);
	}
}
