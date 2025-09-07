/*
Un Establecimiento educativo necesita implementar un sistema en el que se puedan cargar alumnos que
cursan una asignatura, los datos que caracterizan a los alumnos son: el nombre y apellido, Libreta
Universitaria, sexo, condición (regular o condicional) y la nota final.
Los datos para una asignatura son Nombre de la Asignatura, Año, Total de Hs,
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a
continuación:
1.Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
2.Mostrar en pantalla los alumnos que se encuentren como condicional y su cantidad.
3.Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en pantalla.
4.Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla
*/
import java.util.Scanner;

class practicarColecciones{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// Menu
		System.out.println("####  Establecimiento Educativo  ####");
		System.out.println(" 1. Mostrar alumnos de una asignatura");
		System.out.println(" 2. Mostrar alumnos en estado condicional");
		System.out.println(" 3. Ordenar alumnos (nota mayor a menor)");
		System.out.println(" 4. Ordenar alumnos (nombre/apellido)");
		System.out.println(" q. Salir");
		String eleccion = scan.nextLine();
		switch(eleccion){
			case "1":
				alumnosAsignatura();
				break;
			case "2";
				alumnosEstadoCondicional();
				break;
			case "3":
				ordenarNotaMaxMin();
				break;
			case "4";
				ordenarNombreApellido();
				break;
			case "q":
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Error: El valor ingresado es invalido.");

		}
	}
}