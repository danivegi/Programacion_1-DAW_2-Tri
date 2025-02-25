package test;

import modelo.Direccion;
import modelo.Usuario;

public class CompruebaUsuario {

	public static void main(String[] args) {
		try {
			Direccion direccion = new Direccion("Calle Vino Fino", "Jerez de la Frontera", "Cádiz", "11404");
			Usuario usuario = new Usuario("Daniel", "Vega Alcázar", "32098557X", direccion);
			System.out.println("Usuario creado con éxito");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
