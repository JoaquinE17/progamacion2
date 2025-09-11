//package Tp2; 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Alquiler> listaDeAlquileres = new ArrayList<Alquiler>();
		Alquiler alquiler = new Alquiler();
		boolean bandera = true;
		// Menu
		do{
			switch(elegirOpcion()){
				case "1":
					consultarAlquiler(alquiler);
					break;
				case "2":
					confirmarAlquiler(alquiler,listaDeAlquileres);
					break;
				case "3":
					mostrarAlquiler(listaDeAlquileres);
					break;
				case "0":
					System.out.println("Saliendo del programa...");
					bandera = false;
					break;
				default:
					System.out.println("Error: El valor ingresado no es valido.");
			}
		}while(bandera!=false);
		
	}
	public static String elegirOpcion(){
		Scanner scan = new Scanner(System.in);
		System.out.print(" [1] Consultar alquiler\n [2] Confirmar alquiler\n [3] Mostrar alquileres realizados\n [0] Salir\nSeleccione una opcion: ");
		String eleccion = scan.nextLine();
		return eleccion;
	}
	public static void consultarAlquiler(Alquiler alquiler){
		Velero barcoVelero = new Velero("12E23E", 34.2, 1987, 23);
		alquiler.setNombre("Ernesto Perez");
		alquiler.setDni(21395243);
		alquiler.setFechaInicio(LocalDate.of(2025,4,23));
		alquiler.setFechaFin(LocalDate.of(2025,5,12));
		alquiler.setPosicionAmarre(9);
		alquiler.setBarco(barcoVelero);
		double precioAlquiler = alquiler.calcularAlquiler(barcoVelero.moduloBarco());
		System.out.printf(" * El total del alquiler es: %.2f\n", precioAlquiler);
	}
	public static void confirmarAlquiler(Alquiler alquiler, ArrayList<Alquiler> listaDeAlquileres){
		Scanner scan = new Scanner(System.in);
		System.out.println(alquiler);
		System.out.print("Confirmar alquiler [s/n]: ");
		String eleccion = scan.nextLine();
		if(eleccion.equals("s")){
			listaDeAlquileres.add(alquiler);
			System.out.println(" * Alquiler guardado.");
		}
		else 
			System.out.println(" * Alquiler no guardado.");
	}
	public static void mostrarAlquiler(ArrayList<Alquiler> listaDeAlquileres){
		if(listaDeAlquileres.size()>0){
			for (Alquiler a : listaDeAlquileres){
				System.out.println(a);
			}
		}
		else{
			System.out.println(" * La lista de alquileres se encuentra vacia.");
		}
	}
	/*
	public static LocalDate ingresarFecha() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese dias");
		int dia = scan.nextInt();
		System.out.println("Ingrese mes");
		int mes = scan.nextInt();
		System.out.println("Ingrese año");
		int anio = scan.nextInt();
		
		LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
		return fechaInicio;
		
	}
	public static Alquiler ingresarAlquileres(int identificador) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del cliente: ");
		String nombre = scan.nextLine();
		System.out.println("Ingresar el dni: ");
		int dni = scan.nextInt();
		System.out.println("Ingrese fecha de inicio:");
		LocalDate fechaInicio = ingresarFecha();
		System.out.println("Ingrese fecha de fin:");
		LocalDate fechaFinal = ingresarFecha();
		System.out.println("Ingrese posicion de amarre:");
		int posicionAmarre = scan.nextInt();
		Barco barco;
		if (identificador == 1 ) {
			barco = new Velero("ZX100", 8, 1990, 2);
		
		}else if (identificador == 2) {
			barco = new Yate ("MW189", 15, 2000, 300, 3);
			
		}else {
			barco = new Deportivo ("QH436", 13, 2020, 1300);
		}
		
		
		Alquiler alquiler = new Alquiler (nombre, dni, fechaInicio, fechaFinal, posicionAmarre, barco);
		return alquiler;
	}*/

}
