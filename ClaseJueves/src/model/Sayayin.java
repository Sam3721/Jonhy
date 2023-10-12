package model;

import javax.swing.JOptionPane;

public class Sayayin implements Volar, SuperFuerza {

	public String golpear() {

		return "Aumenta su ki en sus punios para pegare a el objetivo ";
	}

	public String lanzar() {

		return "Concentra su fuerza para lanzar una piedra grande";
	}

	public String empujar(int distancia) {

		return "Fija una estructura para empujarlo a una distancia de " + distancia;
	}

	public String levantar() {

		return "Canaliza ki para levantar un objeto pesado";
	}

	public String saltar(int distancia) {

		return "Aumenta su ki en sus piernas para saltar una altura de " + distancia;
	}

	public String despegar() {
		return "Canaliza su ki para salir a volar";
	}

	public String aterrizar() {

		return "Disminuye su ki para poder aterrizar";
	}

	public String acelerar() {

		return "Aumenta un poco su ki para dezplazarse mas rapido";
	}

}
