package view;

import java.util.Scanner;

public class VistaConsola {
	
	Scanner leer = new Scanner(System.in);
	public VistaConsola() {
		
	}
	
	public String pedirLeerDatos(String mensaje) {
		System.out.println(mensaje);
		String dato = leer.next();
		return dato;
	}
	
	public void mostrarInfoConsola(String mensaje) {
		System.out.println(mensaje);
	}
}
