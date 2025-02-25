package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ficheros {
    File fichero;

    public Ficheros() {
        fichero = new File("Ruta");
        System.out.println("nombre del fichero " + fichero.getName());
        System.out.println("ruta del fichero" + fichero.getPath());
        System.out.println("ruta  absoluta" + fichero.getAbsolutePath());
        System.out.println("tamaño del fichero" + fichero.length());

        if (fichero.exists()) {
            System.out.println("el fichero existe");
        }

            File f;
            f = new File("prueba.txt");


            try {
                if (!f.exists()) {

                    f.createNewFile();
                    System.out.println("fichero creado");
                } else {
                    System.out.println("fichero no crado");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            FileReader fr;
            BufferedReader br;
            String nombre = "";
            
            try {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                
                while ((nombre = br.readLine())!= null) {
                    System.out.println(nombre);
                }


            } catch (IOException e) {

                e.printStackTrace();
            }

        

    }
}
