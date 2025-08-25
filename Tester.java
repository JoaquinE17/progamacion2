package Tp1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MascotaVirtual mascota1 = new MascotaVirtual("pepe", false, 50, 3, 0);
		//mascota1.Beber();
		//System.out.println("esta bebiendo: " + mascota1.getEnergia());
		 int opcion;

	        do {
	        	mascota1.MostrarMascota();
	            System.out.println("\n--- Menú de acciones ---");
	            System.out.println("1. Caminar");
	            System.out.println("2. Dormir");
	            System.out.println("3. Saltar");
	            System.out.println("4. Comer");
	            System.out.println("5. Beber");
	            System.out.println("6. Correr");
	            System.out.println("0. Salir");
	            System.out.print("Elige una acción: ");
	            opcion = scan.nextInt();

	            switch (opcion) {
	                case 1:
	                    mascota1.Caminar();
	                    break;
	                case 2:
	                    mascota1.Dormir();
	                    break;
	                case 3:
	                    mascota1.Saltar();
	                    break;
	                case 4:
	                    mascota1.Comer();
	                    break;
	                case 5:
	                    mascota1.Beber();
	                    break;
	                case 6:
	                    mascota1.Correr();
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
