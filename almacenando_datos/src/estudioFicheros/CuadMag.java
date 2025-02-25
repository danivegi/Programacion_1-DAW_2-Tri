package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CuadMag {

    public CuadMag() {
        System.out.println("Ejercicio Fichero de Cuadrado Mágico");
        File f;
        FileReader fr;
        BufferedReader br;

        f = new File("CuadradoMag.txt");
        int numMatrices = 0;
        int tamMatriz = 0;
        int matriz[][] = null;

        try {
            if (!f.exists()) {
                System.out.println("El fichero no existe.");
                f.createNewFile();
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            // leemos el número de matrices
            numMatrices = Integer.parseInt(br.readLine());
            for (int x = 0; x < numMatrices; x++) {
                // leemos el tamaño de la matriz
                tamMatriz = Integer.parseInt(br.readLine());
                matriz = new int[tamMatriz][];
                for (int y = 0; y < tamMatriz; y++) {
                    matriz[y] = lineArrayInt(br.readLine().split(","));
                }
                // mostramos la matriz
                System.out.println(Arrays.deepToString(matriz));
                // Ya habríamos leído la matriz, ahora comprobamos si es cuadrado mágico

                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int[] lineArrayInt(String[] arrayCadena) {
        int[] arrayInt = new int[arrayCadena.length];
        for (int x = 0; x < arrayInt.length; x++) {
            arrayInt[x] = Integer.parseInt(arrayCadena[x]);
        }
        return arrayInt;
    }

}
