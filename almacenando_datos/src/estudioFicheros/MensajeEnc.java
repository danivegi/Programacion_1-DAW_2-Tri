package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MensajeEnc {

    public MensajeEnc() {
        System.out.println("Ejercicio Mensaje Encriptado");
        File f;
        FileReader fr;
        BufferedReader br;

        f = new File("Mensaje.txt");
        String[] mensaj;
        int[] mensajeEnt;

        try {
            if (!f.exists()) {
                System.out.println("El fichero no existe.");
                f.createNewFile();
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            // Leemos el número de palabras
            mensaj = br.readLine().split(",");
            mensajeEnt = new int[mensaj.length];

            for (int i = 0; i < mensajeEnt.length; i++) {
                mensajeEnt[i] = Integer.parseInt(mensaj[i]);
            }
            System.out.println("Mensaje a enteros: " + Arrays.toString(mensajeEnt));

            int numPalabras = 0;
            numPalabras = mensajeEnt[0];
            System.out.println("El número de Palabras es: " + numPalabras);

            descomponeMensaje(mensajeEnt);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void descomponeMensaje(int[] mensajeEnt) {
        int cont = 1;
        int cantidadPalabra = 0;
        int[] array;
        int tam = 0;

        for (int x = 0; x < mensajeEnt.length; x++) {
            cantidadPalabra = mensajeEnt[cont] * 2;
            cont++;
            array = new int[cantidadPalabra];
            tam = 0;
            for (int y = cont; y < cantidadPalabra + cont; y++) {
                array[tam] = mensajeEnt[y];
                tam++;
            }
            // System.out.println(Arrays.toString(array));
            desencripta(array);
            cont = cont + cantidadPalabra;

        }

    }

    private void desencripta(int[] array) {

        String abc = "abcdefghijklmnopqrstuvwxyz";
        String zyx = "zyxwvutsrqponmlkjihgfedcba";
        int contador = 1;

        for (int x = 0; x < array.length; x += 2) {
            if (array[contador] % 2 == 0) {
                System.out.print(abc.charAt(array[x] - 1));
            } else {
                System.out.print(zyx.charAt(array[x] - 1));
            }
            contador += 2;
        }
        System.out.print(" ");

    }

}