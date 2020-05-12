package ejercicio4;

public class Camion extends Vehiculo {
	
	private String nombreDelTransportista;
	private String mercancia;
	private static int numCamionesCreados;
	
	public Camion (String nombreDelTransportista, String mercancia, String marca) {
		super(marca);
		this.nombreDelTransportista = nombreDelTransportista;
		this.mercancia = mercancia;
		numCamionesCreados++;
	}
	
	public static int getNumCamionesCreados() {
		return numCamionesCreados;
	}
	
	
	
	
	
	

}
