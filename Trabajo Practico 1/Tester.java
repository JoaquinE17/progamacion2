import java.util.Scanner;
import utilidades.LimpiarPantalla;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hola!!, ponme un nombre: ");
		String name = scan.nextLine();
		MascotaVirtual mascota1 = new MascotaVirtual(name);
		String opcion, continuar;
		boolean bandera = true;

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
	                case "0":
	                    System.out.println("¡Adiós!");
	                    bandera = false;
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	            System.out.println("> Cambio a realizar en el estado: ");
	            switch(medidorEnergetico(opcion)){
	            	case 1:
	                    System.out.println("  * [+]Energia | [+]Ingesta  ");
	                    break;
	                case 2:
	                    System.out.println("  * [+]Desgaste | [-]Energia | [-]Ingesta  ");
	                    break;
	                case 3:
	                    System.out.println("  * [0]Desgaste | [+]Energia | [0]Ingesta  ");
	                    break;
	                default:
	                    System.out.println("  * Durmiendo");
	            }
	            if (bandera!=false){
	            	System.out.print("Pulse enter para continuar..");
	            	continuar = scan.nextLine();
	            }
	        } while (bandera!=false);

	        scan.close();
	}

	public static int medidorEnergetico(String opcion){
		if (opcion.equals("1") || opcion.equals("2"))
			return 1;
		if (opcion.equals("5") || opcion.equals("6") || opcion.equals("7"))
			return 2;
		if (opcion.equals("4"))
			return 3;
		else 
			return 4;
	}
}
