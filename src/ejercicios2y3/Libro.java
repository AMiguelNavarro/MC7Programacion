package ejercicios2y3;

public class Libro extends Articulo {

	private String isbn;
	private int numeroPaginas;
	private String autor;
	
	public Libro(String referencia, String nombre, double precio, String isbn, int numeroPaginas, String autor) {
		super(referencia, nombre, precio);
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String obtenerAutorORealizador() {
		return getAutor();
	}
	
	
	
	
	
	
}
