package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Notas {

    public Notas() {
        System.out.println("Leyendo notas");

        File f;
        FileReader fr;
        BufferedReader br;
        String linea = "";
        String[] alumnos;
        String[] asignaturas;
        int[][] notas;
        f = new File("notas.txt");
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            /*
             * while ((linea = br.readLine()) !=null) { PARA LEER TODO EL FICHERO
             * System.out.println(linea);
             * };
             */

            alumnos = br.readLine().split(",");
            asignaturas = br.readLine().split(",");
            System.out.println(Arrays.toString(alumnos));
            System.out.println(Arrays.toString(asignaturas));
            notas = new int[asignaturas.length][];
            for (int x = 0; x < asignaturas.length; x++) {
                notas[x] = lineArrayInt(br.readLine().split(",")); 
            }
            System.out.println(Arrays.deepToString(notas));

            muestraNotas(alumnos, asignaturas, notas);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void muestraNotas(String[] alumnos, String[] asignaturas, int[][] notas) {
        // Nota más alta examen 1 y 5
        int notaEx1 = calculoNotaMasAlta(notas[0]);
        int notaEx5 = calculoNotaMasAlta(notas[4]);
        System.out.println("La nota más alta del Examen 1 es: " + notaEx1);
        System.out.println("La nota más alta del Examen 5 es: " + notaEx5);
        for (int y = 0; y < notas[0].length; y++) {
            if (notas[0][y] == notaEx1 && notas[4][y] == notaEx5) {
                System.out.println("La nota más alta la tiene: " + alumnos[y] + ", y tienen estas notas:" + notas[0][y] + " " + notas[4][y]);
            }
        }
    }

    private int calculoNotaMasAlta(int[] notas) {
        int notaMasAlta = 0;
        for (int x = 0; x < notas.length; x++) {
            if (notas[x] > notaMasAlta) {
            notaMasAlta = notas[x];
            }
        }
        return notaMasAlta;
        
    }

    private int[] lineArrayInt(String[] arrayCadena) {
        int[] arrayInt = new int[arrayCadena.length];
        for (int x = 0; x < arrayCadena.length; x++) {
            arrayInt[x] = Integer.parseInt(arrayCadena[x]);
        }
        return arrayInt;
    }

}