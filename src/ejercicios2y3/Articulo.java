package ejercicios2y3;

public abstract class Articulo {

	private String referencia;
	private String nombre;
	private double precio;
	
	
	public Articulo(String referencia, String nombre, double precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String obtenerAutorORealizador();
	
	
	
	
	
}
