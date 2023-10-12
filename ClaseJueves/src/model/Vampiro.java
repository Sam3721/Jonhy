package model;

import javax.swing.JOptionPane;

public class Vampiro implements Volar, Magia {

	public String despegar() {

		return "Agita su capa como alas y empiza a volar";
	}

	public String aterrizar() {

		return "Deja de agitar su capa para poder aterrizar";
	}

	public String acelerar() {

		return "agita su capa mas rapido";
	}

	public String lanzarHechizos() {

		return "usa magia vampirica para lanzar un hechizo";
	}

	public String transformarse(String opcion) {

		if(opcion == "1") {
			opcion = "se transforma en muricelago";
		}else if(opcion == "2") {
			opcion = "toma la forma de un humano";
		}
		return opcion;
	}

	public String teletransportarse() {

		return "usa energia vampirica para teletransportarse al lugar que esta pensando";
	}

	public String invisibilidad() {

		return "se cubre con su capa de oscuridad dando la ilusion de invisibilidad";
	}

}
