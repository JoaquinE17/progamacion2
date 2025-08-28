import java.util.Scanner;
import utilidades.LimpiarPantalla;

public class Tester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.print("Hola!!, ponme un nombre: ");
		//String name = scan.nextLine();
		MascotaVirtual mascota1 = new MascotaVirtual("Tuki2.0");
		String opcion;
		boolean bandera = true;
	        do {
				LimpiarPantalla.limpiar();
				System.out.println("------- MascotaVirtual -------");
	        	mascota1.MostrarMascota();
	        	
	            System.out.println("\n------ Menú de acciones ------");
	            System.out.println(" 1. Comer\t 5. Caminar");

	            System.out.println(" 2. Beber\t 6. Correr");

	            System.out.println(" 3. Dormir\t 7. Saltar");
	            System.out.println(" 4. Despertar\t 8. Ver reglas");

	            System.out.println("--------\n0. Salir");
	            System.out.print("----------------\nElige una acción: ");
	            opcion = scan.nextLine();

	            switch (opcion) {
	                case "1":
	                    mascota1.comer();
	                    break;
	                case "2":
	                    mascota1.beber();
	                    break;
	                case "3":
	                    mascota1.dormir();
	                    break;
	                case "4":
	                    mascota1.despertar();
	                    break;
	                case "5":
	                    mascota1.caminar();
	                    break;
	                case "6":
	                    mascota1.correr();
	                    break;
	                case "7":
	                   	mascota1.saltar();
	                   	break;
	                case "8":
	                	reglas();
	                   	break;
	                case "0":
	                    System.out.println("¡Adiós!");
	                    bandera = false;
	                    break;
	                default:
	                    System.out.print("Opción no válida. Continuar...");
	                    String seguir = scan.nextLine();
	            }
	            
	        } while (bandera!=false);

	        scan.close();
	}

	public static void reglas(){
		Scanner scan = new Scanner(System.in);
		System.out.println("\n------ Reglas del juego ------");		
		System.out.println("1- Nivel de Energia maximo 100.");
		System.out.println("2- Nivel de Energia minimo 0.");
		System.out.println("3- La Energia incrementa (comer,beber,dormir).");
		System.out.println("4- La Energia disminuye (caminar,correr,saltar).");
		System.out.println("5- Si Energia llega a 0 la mascota muere.");
		System.out.println("6- Si Ingesta llega a 5 la mascota muere.");
		System.out.println("7- La Ingesta disminuye con deporte.");
		System.out.println("8- Si Desgaste llega a 4 la mascota duerme.");
		System.out.println("9- Al Despertar Ingesta y Desgaste se resetean.");
		System.out.println("------------------------------");
		System.out.print("Pulse enter para volver al menu de acciones:  ");
		String atras = scan.nextLine();
	}
}
