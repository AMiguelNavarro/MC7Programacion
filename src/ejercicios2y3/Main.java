package ejercicios2y3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Buena", "La Red Púrpura", 20.85, "ISBN547896-12", 457, "Carmen Mola");
		Dvd dvd1 = new Dvd("Bien", "Alien", 50.30, 257, "Realizador 1");

		System.out.println("El nombre del autor es: " +libro1.obtenerAutorORealizador());
		System.out.println("El nombre del realizador es: " +dvd1.obtenerAutorORealizador());
		
		ArrayList<Articulo>listaArticulos = new ArrayList<>();
		listaArticulos.add(libro1);
		listaArticulos.add(dvd1);
		
		for (Articulo articulo : listaArticulos) {
			System.out.println(articulo.obtenerAutorORealizador());
		}
		
	}

}
