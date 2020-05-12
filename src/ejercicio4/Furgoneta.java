package ejercicio4;

public class Furgoneta extends Vehiculo {

	private String matricula;
	private static int numFurgonetasCreadas;

	public Furgoneta (String matricula, String marca) {
		super(marca);
		this.matricula = matricula;
		numFurgonetasCreadas++;
	}
	
	public static int getNumFurgonetasCreadas() {
		return numFurgonetasCreadas;
	}


	
}
