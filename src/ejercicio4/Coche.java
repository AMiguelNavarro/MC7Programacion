package ejercicio4;

public class Coche extends Vehiculo {

	private String dniConductor;
	private static int numCochesCreados;
	
	public Coche (String marca, String dniConductor) {
		super(marca);
		this.dniConductor = dniConductor;
		numCochesCreados++;
	}
	
	public static int getNumCochesCreados() {
		return numCochesCreados;
	}
}
