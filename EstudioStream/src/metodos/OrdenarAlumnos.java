package metodos;

import java.util.List;

import listas.ListaAlumnos;
import modelo.Alumno;

import java.util.Comparator;

public class OrdenarAlumnos {
    public static void main(String[] args) {
        // Obtiene una lista de alumnos desde el método obtenerListaAlumnos()
        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

        // Imprime un mensaje indicando que los alumnos serán ordenados por nota
        System.out.println("Alumnos ordenados por nota (descendente):");

        // Usa un stream para ordenar la lista de alumnos por su nota media en orden descendente
        alumnos.stream()
               .sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed()) // Ordena por nota de mayor a menor
               .forEach(System.out::println); // Imprime cada alumno ordenado
    }
}

