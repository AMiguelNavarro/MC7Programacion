package ejercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo coche1 = new Coche("Ford", "77777777E");
		Vehiculo coche2 = new Coche("Opel", "45121365P");
		Vehiculo coche3 = new Coche("Seat", "78956547U");
		
		Vehiculo camion1 = new Camion("Pepe", "Ropa", "Mercedes");
		Vehiculo camion2 = new Camion("Manuel", "Gasolina", "Lexus");
		Vehiculo camion3 = new Camion("Laura", "Comida", "Volvo");
		
		Vehiculo furgoneta1 = new Furgoneta("4512 KJH", "Opel");
		Vehiculo furgoneta2 = new Furgoneta("7851 LKJ", "Ford");
		Vehiculo furgoneta3 = new Furgoneta("5623 MFD", "Nissan");
		
		coche1.viaje(5000);
		coche2.viaje(250);
		coche3.viaje(650);
		
		camion1.viaje(800);	
		camion2.viaje(740);	
		camion3.viaje(500000);
		
		furgoneta1.viaje(4521);
		furgoneta2.viaje(76854);
		furgoneta3.viaje(7896534);
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(coche1);
		listaVehiculos.add(coche2);
		listaVehiculos.add(coche3);
		listaVehiculos.add(furgoneta1);
		listaVehiculos.add(furgoneta2);
		listaVehiculos.add(furgoneta3);
		listaVehiculos.add(camion1);
		listaVehiculos.add(camion2);
		listaVehiculos.add(camion3);
		
		for (Vehiculo vehiculo : listaVehiculos) {
			System.out.println("kilometros " +vehiculo.getKilometraje());
		}
		
		System.out.println("El kilometraje total es: " +Vehiculo.getKilometrosTotales());
		System.out.println("El número de vehiculos creados es: " +Vehiculo.getNumVehiculosCreados());
		

	}

}
