package ejercicios2y3;

public class Dvd extends Articulo{

	private int duracion;
	private String realizador;
	
	
	public Dvd(String referencia, String nombre, double precio, int duracion, String realizador) {
		super(referencia, nombre, precio);
		this.duracion = duracion;
		this.realizador = realizador;
	}


	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getRealizador() {
		return realizador;
	}
	public void setRealizador(String realizador) {
		this.realizador = realizador;
	}
	
	@Override
	public String obtenerAutorORealizador() {
		return getRealizador();
	}
	
	
	
	
	
	
}
