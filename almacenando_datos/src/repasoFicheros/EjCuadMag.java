package repasoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class EjCuadMag {

    int sumaReferencia = 0;

    public EjCuadMag() {

        System.out.println("Ejercicio del Cuadrado Mágico");
        File f;
        FileReader fr;
        BufferedReader br;

        f = new File("CuadradoMag.txt");
        int numMatrices;
        int tamMatriz;
        int[][] cuadrado;
        boolean sumaFilaIgual = false;
        boolean sumaColumnaIgual = false;
        boolean sumaDiagonalIgual = false;
        boolean sumaDiagonalInversaIgual = false;

        try {
            if (!f.exists()) {
                System.out.println("El fichero no existe");
                f.createNewFile();
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            numMatrices = Integer.parseInt(br.readLine());
            System.out.println("Hay " + numMatrices + " matrices.");

            for (int x = 0; x < numMatrices; x++) {
                tamMatriz = Integer.parseInt(br.readLine());
                cuadrado = new int[tamMatriz][];
                for (int y = 0; y < tamMatriz; y++) {
                    cuadrado[y] = lineArrayInt(br.readLine().split(","));
                }
                System.out.println(Arrays.deepToString(cuadrado));
                sumaFilaIgual = compruebaFila(cuadrado);
                sumaColumnaIgual = compruebaColumna(cuadrado);
                sumaDiagonalIgual = compruebaDiagonal(cuadrado);
                sumaDiagonalInversaIgual = compruebaDiagonalInversa(cuadrado);

                if (sumaFilaIgual && sumaColumnaIgual && sumaDiagonalIgual && sumaDiagonalInversaIgual) {
                    System.out.println("¡El Cuadrado es mágico!");
                } else {
                    System.out.println("El Cuadrado NO es mágico :(");
                }
                sumaReferencia = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean compruebaFila(int[][] cuadrado) {
        int sumaFila = 0;
        for (int y = 0; y < cuadrado[0].length; y++) {
            sumaReferencia += cuadrado[0][y];
        }
        System.out.println("La Suma Referencia es: " + sumaReferencia);

        for (int x = 0; x < cuadrado.length; x++) {
            for (int y = 0; y < cuadrado[x].length; y++) {
                sumaFila += cuadrado[x][y];
            }
            System.out.println("La suma de la Fila " + x + " nos da: " + sumaFila);
            if (sumaFila != sumaReferencia) {
                return false;
            }
            sumaFila = 0;
        }
        return true;
    }

    private boolean compruebaColumna(int[][] cuadrado) {
        int sumaColumna = 0;

        for (int y = 0; y < cuadrado[0].length; y++) {
            for (int x = 0; x < cuadrado.length; x++) {
                sumaColumna += cuadrado[x][y];
            }
            System.out.println("La Suma de la Columna " + y + " nos da: " + sumaColumna);
            if (sumaColumna != sumaReferencia) {
                return false;
            }
            sumaColumna = 0;
        }
        return true;
    }

    private boolean compruebaDiagonal(int[][] cuadrado) {
        int sumaDiagonal = 0;
        for (int x = 0; x < cuadrado.length; x++) {
            for (int y = 0; y < cuadrado[x].length; y++) {
                if (x == y) {
                    sumaDiagonal += cuadrado[x][y];
                }
            }
        }
        System.out.println("La Suma de la Diagonal es: " + sumaDiagonal);
        if (sumaDiagonal != sumaReferencia) {
            return false;
        }
        return true;
    }

    private boolean compruebaDiagonalInversa(int[][] cuadrado) {
        int sumaDiagonalInv = 0;
        int y = cuadrado.length - 1;
        for (int x = 0; x < cuadrado.length; x++) {
            sumaDiagonalInv += cuadrado[x][y--];
        }
        System.out.println("La Suma de la Diagonal Inversa es: " + sumaDiagonalInv);
        if (sumaDiagonalInv != sumaReferencia) {
            return false;
        }
        return true;
    }

    private int[] lineArrayInt(String[] arrayCadena) {
        int[] arrayInt = new int[arrayCadena.length];
        for (int x = 0; x < arrayInt.length; x++) {
            arrayInt[x] = Integer.parseInt(arrayCadena[x]);
        }
        return arrayInt;
    }

}