package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import excepciones.GolosinaException;

public class Ejercicio {

    String[][] nombreGolosinas;
    double[][] precioGolosinas;
    int[][] cantidadGolosinas;
    int[][] ventaGolosinas;

    public Ejercicio() {

        leerFichero();
        Scanner leer = new Scanner(System.in);
        String dato = "";
        int opcion = 0;

        do {

            // Menú para mostrar al usuario
            System.out.println("MÁQUINA DE GOLOSINAS");
            System.out.println("ELIJA UNA OPCIÓN.");
            System.out.println("1. PEDIR GOLOSINAS.");
            System.out.println("2. MOSTRAR GOLOSINAS.");
            System.out.println("3. RELLENAR GOLOSINAS.");
            System.out.println("4. APAGAR MÁQUINA.");

            do {
                dato = leer.next();
            } while (opcionIncorrecta(dato)); // Método para comprobar si el dato introducido es correcto.
            opcion = Integer.parseInt(dato);

            switch (opcion) {
                case 1: // Método para pedirle Golosinas al usuario
                    try {
                        pedirGolosinas();
                    } catch (GolosinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: // Método para mostrar las Golosinas DISPONIBLES al usuario
                    mostrarGolosinas();
                    break;

                case 3:
                    try {
                        rellenarGolosinas();
                    } catch (GolosinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    apagarMaquina();
                    break;

                default:
                    break;
            }

        } while (opcion != 4);

    }

    private void apagarMaquina() {
        double ventaTotal = 0;
        for (int i = 0; i < cantidadGolosinas.length; i++) {
            for (int j = 0; j < cantidadGolosinas[i].length; j++) {
                if (ventaGolosinas[i][j] >= 1) {
                    System.out.println("Se han vendido " + ventaGolosinas[i][j] + " productos de " + nombreGolosinas[i][j] + " al precio de: " + precioGolosinas[i][j] + " cada uno.");
                    ventaTotal += ventaGolosinas[i][j] * precioGolosinas[i][j];
                }
            }
        }
        System.out.println("Se ha vendido un total de: " + ventaTotal);
        System.out.println("¡Hasta Luego!");
    }

    private void rellenarGolosinas() throws GolosinaException {
        Scanner leer = new Scanner(System.in);
        String cont = "";
        String contCorrecta = "MaquinaExpendedora2017";
        System.out.println("Introduzca la contraseña:");
        cont = leer.next();

        // Comprobamos que la contraseña sea correcta
        if (cont.equals(contCorrecta)) {
            System.out.println("Introduzca la coordenada de la Golosina a rellenar:");
            String cord = "";
            cord = leer.next();

            // Comprobamos si el código introducido correponde dentro de los valores
            // permitidos
            if (cord.length() != 2) {
                throw new GolosinaException("El código debe ser de 2 dígitos.");
            }
            if (cord.charAt(0) < '0' || cord.charAt(0) > '3') {
                throw new GolosinaException("Código incorrecto, los dígitos deben ir de 0 a 3");
            }
            if (cord.charAt(1) < '0' || cord.charAt(1) > '3') {
                throw new GolosinaException("Código incorrecto, los dígitos deben ir de 0 a 3");
            }
            int x = Integer.parseInt(cord.substring(0, 1));
            int y = Integer.parseInt(cord.substring(1, 2));

            // Pedimos la cantidad que desea rellenar el usuario
            System.out.println("Introduzca la cantidad:");
            String dato = "";
            int cantidad = 0;
            dato = leer.next();

            // Comprobamos que la cantidad sea numérica
            try {
                cantidad = Integer.parseInt(dato);
            } catch (NumberFormatException e) {
                System.out.println("La cantidad debe ser un número.");
            }

            // Comprobamos que la cantidad introducida sea positiva
            if (cantidad > 0) {
                cantidadGolosinas[x][y] += cantidad;
                System.out.println(
                        "El producto " + nombreGolosinas[x][y] + " ha sido aumentado a: " + cantidadGolosinas[x][y]);
            } else if (cantidad <= 0) {
                System.out.println("Error, porfavor, introduzca una cantidad numérica positiva.");
            }
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    private void mostrarGolosinas() {
        System.out.println("Mostando las Golosinas disponibles...");
        for (int i = 0; i < cantidadGolosinas.length; i++) {
            for (int j = 0; j < cantidadGolosinas.length; j++) {
                if (cantidadGolosinas[i][j] > 0) {
                    System.out.println("Producto: " + nombreGolosinas[i][j] + " - Código: " + i + "" + j + " - Precio: "
                            + precioGolosinas[i][j]);
                }
            }
        }
        System.out.println();
    }

    private void pedirGolosinas() throws GolosinaException {
        System.out.println("Introduzca el código de la Golosina");
        Scanner leer = new Scanner(System.in);
        String cord = "";
        cord = leer.next();

        // Comprobamos si el código introducido correponde dentro de los valores
        // permitidos
        if (cord.length() != 2) {
            throw new GolosinaException("El código debe ser de 2 dígitos.");
        }
        if (cord.charAt(0) < '0' || cord.charAt(0) > '3') {
            throw new GolosinaException("Código incorrecto, los dígitos deben ir de 0 a 3");
        }
        if (cord.charAt(1) < '0' || cord.charAt(1) > '3') {
            throw new GolosinaException("Código incorrecto, los dígitos deben ir de 0 a 3");
        }
        int x = Integer.parseInt(cord.substring(0, 1));
        int y = Integer.parseInt(cord.substring(1, 2));

        if (cantidadGolosinas[x][y] <= 0) {
            System.out.println("Lo siento, no quedan más productos de " + nombreGolosinas[x][y]);
        } else {
            cantidadGolosinas[x][y]--;
            ventaGolosinas[x][y]++;
            System.out.println("Quedan " + cantidadGolosinas[x][y] + " productos de " + nombreGolosinas[x][y]);
        }

    }

    private boolean opcionIncorrecta(String dato) {
        int op = 0;
        try {
            op = Integer.parseInt(dato);
        } catch (NumberFormatException e) { // Comprobamos si el dato es un número
            System.out.println("El dato debe ser numérico.");
            return true;
        }
        if (op < 1 || op > 4) {
            System.out.println("Opción errónea, la opción debe ser entre 1 y 4");
            return true;
        }
        return false;
    }

    private void leerFichero() {

        File f;
        FileReader fr;
        BufferedReader br;
        f = new File("Golosinas.txt");

        try {

            if (!f.exists()) {
                System.out.println("El fichero no existe... Creando fichero");
                f.createNewFile();
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            int tamMatriz = Integer.parseInt(br.readLine());
            // System.out.println("El tamaño de las matrices es de: " + tamMatriz);
            // System.out.println();

            nombreGolosinas = new String[tamMatriz][tamMatriz];
            for (int i = 0; i < nombreGolosinas.length; i++) {
                nombreGolosinas[i] = br.readLine().split(",");
            }
            // System.out.println("Nombre de las Golosinas:");
            // System.out.println(Arrays.deepToString(nombreGolosinas));
            // System.out.println();
            String[] arrayCadena;

            precioGolosinas = new double[tamMatriz][tamMatriz];
            for (int i = 0; i < precioGolosinas.length; i++) {
                precioGolosinas[i] = lineArrayDouble(br.readLine().split(","));
            }
            // System.out.println("Precio de Golosinas");
            // System.out.println(Arrays.deepToString(precioGolosinas));
            // System.out.println();

            cantidadGolosinas = new int[tamMatriz][tamMatriz];
            for (int i = 0; i < cantidadGolosinas.length; i++) {
                cantidadGolosinas[i] = lineArrayInt(br.readLine().split(","));
            }
            // System.out.println("Cantidad de Golosinas");
            // System.out.println(Arrays.deepToString(cantidadGolosinas));
            // System.out.println();

            ventaGolosinas = new int[tamMatriz][tamMatriz];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double[] lineArrayDouble(String[] arrayCadena) {
        double[] arrayDouble = new double[arrayCadena.length];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = Double.parseDouble(arrayCadena[i]);
        }
        return arrayDouble;
    }

    private int[] lineArrayInt(String[] arrayCadena) {
        int[] arrayInt = new int[arrayCadena.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayCadena[i]);
        }
        return arrayInt;
    }

}