package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import modelo.Bicicleta;
import modelo.Persona;

public class Listas {

    public Listas() {
        System.out.println("Estudio de listas");
        Persona p1 = new Persona("Pepe", "García", "123");
        Persona p2 = new Persona("Maria", "Perez", "1234");
        Bicicleta b1 = new Bicicleta(11, 29);
        Collection coleccion = new ArrayList();
        coleccion.add(p1);
        coleccion.add(p2);
        coleccion.add(b1);
        coleccion.add(p1);

        for (Object elem : coleccion) {

            // if (elem instanceof Persona=)
            System.out.println("Persona: " + elem);
        }

        System.out.println();

        List<Persona> lista = null;
        lista = new ArrayList<Persona>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p1);
        lista.set(0, p2);
        for(Persona person:lista) {
            System.out.println(person);;
        }
        System.out.println("Tamaño de la lista: " + lista.size());
        //lista.remove(0);
        System.out.println("Tamaño de la lista: " + lista.size());
        lista.remove(p1);
        System.out.println("Tamaño de la lista: " + lista.size());

        System.out.println("===============ITERATOR==============");
        java.util.Iterator<Persona> iter = lista.iterator();
        while (iter.hasNext()) {
            //Persona p3 = iter.next();
            System.out.println(iter.next().toString());
        }

    }

}
