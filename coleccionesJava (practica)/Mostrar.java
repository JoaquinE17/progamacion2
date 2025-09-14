import java.util.ArrayList;
import java.util.Scanner;

public class Mostrar {
	private static Scanner scan = new Scanner(System.in);

	public static void alumnosInscriptos(ArrayList<Asignatura> asignaturas){
		System.out.println("Asignatura a mostrar:");
		int pivot = elegirAsignatura(asignaturas);
		System.out.println(asignaturas.get(pivot));	
		for (Alumno a : asignaturas.get(pivot).getAlumnos())
			System.out.println(a);
	}
	public static int elegirAsignatura(ArrayList<Asignatura> asignaturas){
		for (int i=0; i<asignaturas.size();i++)
			System.out.println(" ["+(i+1)+"] "+asignaturas.get(i));
		System.out.print("Seleccione una: ");
		int pivot = scan.nextInt();
		scan.nextLine();
		return (pivot-1);
	}

	public static void alumnosCondicion(ArrayList<Asignatura> asignaturas,String[] condiciones){
		System.out.println("Condicion a mostrar:");
		int pivot = elegirCondicion(condiciones);
		int contador = 0;
		for (Asignatura b : asignaturas){
			for (int i=0; i<b.getAlumnos().size(); i++){
				if (b.getAlumnos().get(i).getCondicion().equals(condiciones[pivot])){
					System.out.println(b.getAlumnos().get(i));
					contador++;
				}
			}
		}
		System.out.println("* La cantidad de alumnos en condicion '"+condiciones[pivot]+"' es : "+contador+".");
	}
	private static int elegirCondicion(String[] condiciones){
		for (int i=0; i<condiciones.length;i++)
			System.out.println(" ["+(i+1)+"] "+condiciones[i]);
		System.out.print("Seleccione una: ");
		int pivot = scan.nextInt();
		scan.nextLine();
		return (pivot-1);
	}
}