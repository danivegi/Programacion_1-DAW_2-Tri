package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import excepciones.GolosinaException;

public class Golosinas {

    String[][] nombreProductos = null;
    double[][] precioProductos = null;
    int[][] cantidadProductos = null;
    int[][] ventasProductos = null;

    public Golosinas() throws FileNotFoundException, IOException {
        System.out.println("Ejercicio de la máquina de golosinas");
        Scanner leer = new Scanner(System.in);
        leerArchivo();
        System.out.println(Arrays.deepToString(nombreProductos));
        System.out.println(Arrays.deepToString(precioProductos));
        System.out.println(Arrays.deepToString(cantidadProductos));

        String dato = "";
        int opcion = 0;

        do {
            System.out.println("MÁQUINA DE GOLOSINAS");
            System.out.println("1.- PEDIR GOLOSINAS");
            System.out.println("2.- MOSTRAR GOLOSINAS");
            System.out.println("3.- RELLENAR GOLOSINAS");
            System.out.println("4.- APAGAR MÁQUINA");
            System.out.println("INGRESE UNA OPCIÓN");

            do {
                dato = leer.nextLine();
            } while (opcionIncorrecta(dato));
            opcion = Integer.parseInt(dato);
            switch (opcion) {
                case 1:
                    try {
                        pedirGolosinas();
                        System.out.println();
                    } catch (GolosinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    mostrarGolosinas();
                    break;

                case 3:
                    rellenarGolosinas();
                    break;

                case 4:
                    System.out.println("APAGANDO MÁQUINA...");
                    ventasProductos();
                    break;

                default:
                    break;
            }
        } while (opcion != 4);

    }

    private void ventasProductos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ventasProductos'");
    }

    private void rellenarGolosinas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rellenarGolosinas'");
    }

    private void mostrarGolosinas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarGolosinas'");
    }

    private void pedirGolosinas() throws GolosinaException {
        System.out.println("PEDIR GOLOSINAS");
        System.out.println("INGRESE EL NÚMERO DEL PRODUCTO");
        Scanner leer = new Scanner(System.in);
        String dato = "";
        dato = leer.nextLine();

        if (dato.length() != 2)
            throw new GolosinaException("dato incorrecto");
        if (dato.charAt(0) < '0' || dato.charAt(0) > '3')
            throw new GolosinaException("dato incorrecto");
        if (dato.charAt(1) < '0' || dato.charAt(1) > '3')
            throw new GolosinaException("dato incorrecto");
        int x = Integer.parseInt(dato.substring(0, 1));
        int y = Integer.parseInt(dato.substring(1, 2));
        if (x < 0 || x > nombreProductos.length)
            throw new GolosinaException("dato incorrecto");
        if (y < 0 || y > nombreProductos[x].length)
            throw new GolosinaException("dato incorrecto");
        if (cantidadProductos[x][y] == 0)
            throw new GolosinaException("producto agotado");
        System.out.println("PRODUCTO SELECCIONADO: " + nombreProductos[x][y]);
        cantidadProductos[x][y]--;
        ventasProductos[x][y]++;
    }

    private boolean opcionIncorrecta(String dato) {

        int op = 0;
        try {
            op = Integer.parseInt(dato);
        } catch (NumberFormatException e) {
            System.out.println("ERROR DEBE INGRESAR UN NÚMERO");
            return true;
        }
        if (op < 1 || op > 4) {
            System.out.println("ERROR DEBE INGRESAR UN NÚMERO ENTRE 1 Y 4");
            return true;
        }
        return false;
    }

    private void leerArchivo() throws FileNotFoundException, IOException {
        File f;
        FileReader fr;
        BufferedReader br;

        f = new File("Golosinas.txt");
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        String linea = br.readLine();
        int cantidad = Integer.parseInt(linea);
        nombreProductos = new String[cantidad][cantidad];
        precioProductos = new double[cantidad][cantidad];
        cantidadProductos = new int[cantidad][cantidad];
        ventasProductos = new int[cantidad][cantidad];
        String[] arrayCadena;

        for (int x = 0; x < nombreProductos.length; x++) {
            linea = br.readLine();
            arrayCadena = linea.split(",");
            for (int y = 0; y < arrayCadena.length; y++) {
                nombreProductos[x][y] = arrayCadena[y];
            }
        }

        for (int x = 0; x < precioProductos.length; x++) {
            linea = br.readLine();
            arrayCadena = linea.split(",");
            for (int y = 0; y < arrayCadena.length; y++) {
                precioProductos[x][y] = Double.parseDouble(arrayCadena[y]);
            }
        }

        for (int x = 0; x < cantidadProductos.length; x++) {
            linea = br.readLine();
            arrayCadena = linea.split(",");
            for (int y = 0; y < arrayCadena.length; y++) {
                cantidadProductos[x][y] = Integer.parseInt(arrayCadena[y]);
            }
        }
        System.out.println();

    }

}
