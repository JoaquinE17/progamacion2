//package Tp2; 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Alquiler> listaDeAlquileres = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        Alquiler alquilerActual = null;

        do {
			LimpiarPantalla.limpiar();
            switch (elegirOpcion()) {
                case "1":
                    alquilerActual = consultarAlquiler();
                    break;
                case "2":
                    if (alquilerActual != null) {
                        confirmarAlquiler(alquilerActual, listaDeAlquileres);
                        alquilerActual = null; // Limpiamos después de confirmar
                    } else {
                        System.out.println("Primero debe consultar un alquiler.");
                    }
                    break;
                case "3":
                    mostrarAlquiler(listaDeAlquileres);
                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Error: El valor ingresado no es válido.");
            }

            System.out.print("Pulse enter para continuar.. ");
            scan.nextLine();
        } while (bandera);
    }

    public static String elegirOpcion() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" [1] Consultar alquiler\n [2] Confirmar alquiler\n [3] Mostrar alquileres realizados\n [0] Salir\nSeleccione una opcion: ");
        return scan.nextLine();
    }

    public static Alquiler consultarAlquiler() {
        Alquiler alquiler = new Alquiler();
        double precioAlquiler = llenardatos(alquiler);
        System.out.printf(" * El total del alquiler es: %.2f\n", precioAlquiler);
        return alquiler;
    }

    public static double llenardatos(Alquiler alquiler) {
        Scanner scan = new Scanner(System.in);
        alquiler.setNombre("Ernesto Perez");
        alquiler.setDni(21395243);
        alquiler.setFechaInicio(LocalDate.of(2025, 4, 23));
        alquiler.setFechaFin(LocalDate.of(2025, 5, 12));
        alquiler.setPosicionAmarre(9);

        System.out.println("Seleccione el tipo de barco que dispone:");
        System.out.print(" [1] Velero\n [2] Deportivo\n [3] Yate\nSeleccione uno: ");
        String eleccion = scan.nextLine();

        switch (eleccion) {
            case "1":
                Velero barcoVelero = new Velero("2E23E", 34.2, 1987, 23);
                alquiler.setBarco(barcoVelero);
                return alquiler.calcularAlquiler(barcoVelero.moduloBarco());
            case "2":
                Deportivo barcoDeportivo = new Deportivo("QH436", 13, 2020, 1300);
                alquiler.setBarco(barcoDeportivo);
                return alquiler.calcularAlquiler(barcoDeportivo.moduloBarco());
            case "3":
                Yate barcoYate = new Yate("RD139", 17.5, 2000, 300, 3);
                alquiler.setBarco(barcoYate);
                return alquiler.calcularAlquiler(barcoYate.moduloBarco());
            default:
                System.out.println("Error: Valor ingresado incorrecto.");
                return 0;
        }
    }

    public static void confirmarAlquiler(Alquiler alquiler, ArrayList<Alquiler> listaDeAlquileres) {
        Scanner scan = new Scanner(System.in);
        System.out.println(alquiler);
        System.out.print("Confirmar alquiler [s/n]: ");
        String eleccion = scan.nextLine();
        if (eleccion.equalsIgnoreCase("s")) {
            listaDeAlquileres.add(alquiler);
            System.out.println(" * Alquiler guardado.");
        } else {
            System.out.println(" * Alquiler no guardado.");
        }
    }

    public static void mostrarAlquiler(ArrayList<Alquiler> listaDeAlquileres) {
        if (!listaDeAlquileres.isEmpty()) {
            for (Alquiler a : listaDeAlquileres) {
                System.out.println(a);
            }
        } else {
            System.out.println(" * La lista de alquileres se encuentra vacía.");
        }
    }
}
