package metodos;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import listas.ListaAlumnos;
import modelo.Alumno;

public class AgruparPorCurso {
    public static void main(String[] args) {
        // Obtiene una lista de alumnos desde el método obtenerListaAlumnos()
        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

        // Agrupa los alumnos en un mapa donde la clave es el curso y el valor es la lista de alumnos en ese curso
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                                                           .collect(Collectors.groupingBy(Alumno::getCurso));

        // Imprime un mensaje indicando que los alumnos serán agrupados por curso
        System.out.println("Alumnos agrupados por curso:");

        // Recorre el mapa e imprime cada grupo de alumnos por curso
        alumnosPorCurso.forEach((curso, lista) -> {
            System.out.println(" " + curso + ":"); // Imprime el nombre del curso
            lista.forEach(System.out::println); // Imprime cada alumno en ese curso
            System.out.println(); // Línea en blanco para separación entre cursos
        });
    }
}
