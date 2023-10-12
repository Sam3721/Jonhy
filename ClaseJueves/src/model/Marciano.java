package model;

public class Marciano implements SuperFuerza {

	public String golpear() {
		return "tensiona sus musculos marcianos para golpear con fuerza alien";
	}

	public String lanzar() {
		return "lanza una roca de marte que tiene en su bolsillo marciano";
	}

	public String empujar(int distancia) {
		return "empuja un objeto "+ distancia + "m con sus poderosisimas piernas marcianas";
	}

	public String levantar() {
		return "levanta un objeto pesado con su superfuerza de marciano";
	}

	public String saltar(int distancia) {
		return "salta " + distancia + "m con sus poderosisimos gluteos marcianos";
	}

}
