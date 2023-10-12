package model;

import javax.swing.JOptionPane;

public class Mago implements Magia {

	public String lanzarHechizos() {
		return "mueve su varita, dice el hechizo en voz alta y lo lanza";
	}

	public String transformarse(String opcion) {
		return "lanza un hechizo a si mismo para transformarse en " + opcion;
	}
	
	public String teletransportarse() {

		return "lanza un hechizo concentrandose en el lugar al que quiere ir y el mago o bruja"
				+ " viaja instantáneamente de un lugar a otro, sin atravesar el espacio intermedio";
	}

	public String invisibilidad() {

		return "usa un encantamiento para hacer invisible un área u objetivo";
	}

}
