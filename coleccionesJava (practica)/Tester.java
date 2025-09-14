import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Tester {
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

	public static String[] alumnos = new String[]{"Jose Perez","Martin Sosa","Roberto Baez","Josefina Sanchez","Diego Rios","Pedro Nandez"};
	public static String[] sexos = new String[]{"Masculino","Femenino","LGTBQ+"};
	public static String[] condiciones = new String[]{"Regular","Condicional"};
	public static int indiceAux = 0;

	public static void main(String[] args){
		boolean banderaSalir = false;
		while (banderaSalir==false) {
			LimpiarPantalla.limpiar();
			System.out.println("MENU:");
			// MENU
			switch (eleccionMenu()){
				case "1":
					cargarAsignatura();
					break;
				case "2":
					cargarAlumno();
					break;
				case "3":
					Mostrar.alumnosInscriptos(asignaturas);
					scan.nextLine();
					break;
				case "4":
					Mostrar.alumnosCondicion(asignaturas, condiciones);	
					scan.nextLine();				
					break;
				case "5":
					//OrdenarPorNota(); mayor a menor
					Ordenar.ordenarPorNota(asignaturas);					
					scan.nextLine();
					break;
				case "6":
					//OrdenarPorNyA();
					Ordenar.ordenarPorNyA(asignaturas);
					scan.nextLine();
					break;
				case "q":
					System.out.println("* Saliendo del programa.");
					banderaSalir = true;
					break;
				default:
					System.out.print("Error:\n * El valor ingresado no corresponde con las opciones dadas.");
					scan.nextLine();
			}
		}
	}

	public static String getMenu(){
		return (" [1] Crear una nueva asignatura\n"+ 
			" [2] Agregar alumnos a una asignatura\n"+ 
			" [3] Mostrar alumnos de una asignatura\n"+ // Ordenar alumnos (nota: [mayor a menor])
			" [4] Mostrar alumnos por condicion\n"+
			" [5] Ordenar alumnos (nota:[mayor a menor])\n"+
			" [6] Ordenar alumnos (nombre y apellido)\n"+
			" [q] Salir");
	}
	public static String eleccionMenu(){
		System.out.println(getMenu());
		System.out.print("Seleccione una opcion: ");
		String eleccion = scan.nextLine();
		return eleccion;
	}

	public static void cargarAsignatura(){
		Asignatura asignatura = new Asignatura();
		System.out.print("Inserte nombre de la asignatura: ");
		asignatura.setNombreAsignatura(scan.nextLine());
		System.out.print("Inserte anio de la asignatura: ");
		asignatura.setAnio(scan.nextInt());
		System.out.print("Inserte total de horas de la asignatura: ");
		asignatura.setTotalHoras(scan.nextInt());
		scan.nextLine();
		asignaturas.add(asignatura);
	}

	public static void cargarAlumno(){
		Alumno alumno = new Alumno();
		insertarDatos(alumno);
		System.out.println(alumno);
		System.out.println("A que asignatura pertenece el alumno:");
		int pivot = Mostrar.elegirAsignatura(asignaturas);
		for (int j=0; j<asignaturas.size();j++){
			if (j==pivot)
				asignaturas.get(j).agregarAlumno(alumno);
		}
	}
	public static void insertarDatos(Alumno alumno){
		if (indiceAux<alumnos.length){
			Random rand = new Random();
			alumno.setNombreAlumno(alumnos[indiceAux]);
			alumno.setLibretaUniversitaria(rand.nextInt(1000, 2000));
			alumno.setSexo(sexos[rand.nextInt(sexos.length)]);
			alumno.setCondicion(condiciones[rand.nextInt(condiciones.length)]);
			alumno.setNotaFinal(rand.nextDouble(101.0));
			indiceAux++;
		}
		else
			insertarDatosManual(alumno);
	}
	public static void insertarDatosManual(Alumno alumno){
		System.out.print("Inserte nombre del alumno: ");
		alumno.setNombreAlumno(scan.nextLine());
		System.out.print("Inserte L.U. del alumno: ");
		alumno.setLibretaUniversitaria(scan.nextInt());
		scan.nextLine();
		System.out.print("Inserte sexo del alumno: ");
		alumno.setSexo(scan.nextLine());
		System.out.print("Inserte condicion del alumno: ");
		alumno.setCondicion(scan.nextLine());
		System.out.print("Inserte nota final del alumno: ");
		alumno.setNotaFinal(scan.nextDouble());
	}
}