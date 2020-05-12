package ejercicio4;

public abstract class Vehiculo {

	private String marca;
	private int kilometraje;
	private static int kilometrosTotales = 0;
	private static int numVehiculosCreados = 0;
	
	public Vehiculo(String marca) {
		this.marca = marca;
		kilometraje = 0;
		numVehiculosCreados++;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public static int getNumVehiculosCreados() {
		return numVehiculosCreados;
	}
	
	public void viaje(int kilometrosViaje) {
		kilometraje += kilometrosViaje;
		kilometrosTotales += kilometrosViaje;
	}
	
}
