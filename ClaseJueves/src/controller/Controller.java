package controller;

import model.HechiceroMarvel;
import model.Mago;
import model.Marciano;
import model.Sayayin;
import model.Vampiro;
import view.VistaConsola;
import view.VistaEmergente;

public class Controller {

	private VistaEmergente vistaE;
	private VistaConsola vistaC;
	private Vampiro dracula;
	private HechiceroMarvel drStrange;
	private Sayayin goku;
	private Mago harryPotter;
	private Marciano marciano;
	public Controller() {
		vistaE = new VistaEmergente();
		dracula = new Vampiro();
		drStrange = new HechiceroMarvel();
		goku = new Sayayin();
		vistaC = new VistaConsola();
		harryPotter = new Mago();
		marciano = new Marciano();
		funcionar();
	}

	public void funcionar() {
		vistaE.mostrarInformacion("Dracula:");
		vistaE.mostrarInformacion(dracula.despegar());
		vistaE.mostrarInformacion(dracula.acelerar());
		vistaE.mostrarInformacion(dracula.desplazarse(5));
		vistaE.mostrarInformacion(dracula.aterrizar());
		vistaE.mostrarInformacion(dracula.invisibilidad());
		vistaE.mostrarInformacion(dracula.transformarse("2"));
		vistaE.mostrarInformacion(dracula.teletransportarse());
		vistaE.mostrarInformacion(dracula.lanzarHechizos());

		vistaE.mostrarInformacion("drStrange:");
		vistaE.mostrarInformacion(drStrange.transformarse("PATO"));
		vistaE.mostrarInformacion(drStrange.invisibilidad());
		vistaE.mostrarInformacion(drStrange.lanzarHechizos());
		vistaE.mostrarInformacion(drStrange.teletransportarse());
		vistaE.mostrarInformacion(drStrange.leerMentes());
		vistaE.mostrarInformacion(drStrange.controlarMentes());
		vistaE.mostrarInformacion(drStrange.crearIlusiones());
		vistaE.mostrarInformacion(drStrange.moverObjetos());

		vistaE.mostrarInformacion("Goku:");
		vistaE.mostrarInformacion(goku.golpear());
		vistaE.mostrarInformacion(goku.lanzar());
		vistaE.mostrarInformacion(goku.empujar(7));
		vistaE.mostrarInformacion(goku.levantar());
		vistaE.mostrarInformacion(goku.saltar(34));
		vistaE.mostrarInformacion(goku.despegar());
		vistaE.mostrarInformacion(goku.desplazarse(67));
		vistaE.mostrarInformacion(goku.acelerar());
		vistaE.mostrarInformacion(goku.aterrizar());

		vistaE.mostrarInformacion("Harry Potter:");
		vistaE.mostrarInformacion(harryPotter.lanzarHechizos());
		vistaE.mostrarInformacion(harryPotter.invisibilidad());
		vistaE.mostrarInformacion(harryPotter.teletransportarse());
		vistaE.mostrarInformacion(harryPotter.transformarse("lechuza"));
		
		vistaE.mostrarInformacion("Marciano de marte:");
		vistaE.mostrarInformacion(marciano.golpear());
		vistaE.mostrarInformacion(marciano.lanzar());
		vistaE.mostrarInformacion(marciano.empujar(8));
		vistaE.mostrarInformacion(marciano.levantar());
		vistaE.mostrarInformacion(marciano.saltar(42));
		
	}
}
