import java.util.Scanner;
import utilidades.LimpiarPantalla;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hola!!, ponme un nombre: ");
		String name = scan.nextLine();
		MascotaVirtual mascota1 = new MascotaVirtual(name);
		int opcion;

	        do {
				LimpiarPantalla.limpiar();
	        	mascota1.MostrarMascota();
	            System.out.println("\n------ Menú de acciones ------");
	            System.out.println(" 1. Comer\t 5. Caminar");

	            System.out.println(" 2. Beber\t 6. Correr");

	            System.out.println(" 3. Dormir\t 7. Saltar");
	            System.out.println(" 4. Despertar");

	            System.out.println("---\n0. Salir");

	            System.out.print("Elige una acción: ");
	            opcion = scan.nextInt();

	            switch (opcion) {
	                case 1:
	                    mascota1.comer();
	                    break;
	                case 2:
	                    mascota1.beber();
	                    break;
	                case 3:
	                    mascota1.dormir();
	                    break;
	                case 4:
	                    mascota1.despertar();
	                    break;
	                case 5:
	                    mascota1.caminar();
	                    break;
	                case 6:
	                    mascota1.correr();
	                    break;
	                case 7:
	                   	mascota1.saltar();
	                   	break;
	                case 0:
	                    System.out.println("¡Adiós!");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 0);

	        scan.close();
	}

}
