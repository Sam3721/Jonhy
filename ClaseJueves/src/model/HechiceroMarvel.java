package model;

import javax.swing.JOptionPane;

public class HechiceroMarvel implements PoderesMentales, Magia {

	public String lanzarHechizos() {

		return "utiliza energia Eldritch para manifestar su voluntad en un poderozo hechizo";
	}

	public String transformarse(String opcion) {
		return "se transforma en " + opcion + " con una ilusion";
	}
	
	public String teletransportarse() {

		return "mueve su anillo de eslinga en circulos y abre un portal a la ubicacion que este pensando";
	}

	public String invisibilidad() {

		return "usa un conjuro para ser invisible";
	}

	public String leerMentes() {

		return "concentra su energia mistica en la conciencia de un objetivo para leer su mente";
	}

	public String moverObjetos() {

		return "mueve un objeto con el puro poder de su pensamiento";
	}

	public String crearIlusiones() {

		return "invoca la ilusion de un ser mistico para crear una distraccion o engañar";
	}

	public String controlarMentes() {

		return "concentra su energia mistica en la conciencia de un "
				+ "objetivo para imponer su voluntad en la mente de dicho objetivo";
	}

}
