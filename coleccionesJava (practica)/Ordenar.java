import java.util.ArrayList;

public class Ordenar {

	public static void ordenarPorNota(ArrayList<Asignatura> asignaturas){
		System.out.println("Ordenando alumnos por nota final (mayor a menor):");
		for (Asignatura b : asignaturas) {
		    int n = b.getAlumnos().size();
		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - i - 1; j++) {
		            if (b.getAlumnos().get(j).getNotaFinal() < b.getAlumnos().get(j + 1).getNotaFinal()) {
		            	// Intercambio
		                Alumno temp = b.getAlumnos().get(j);
		                b.getAlumnos().set(j, b.getAlumnos().get(j + 1));
		                b.getAlumnos().set(j + 1, temp);
		            }
		        }
		    }
		}
		mostrarListaOrdenada(asignaturas);
	}

	public static void ordenarPorNyA(ArrayList<Asignatura> asignaturas){
		System.out.println("Ordenando alumnos por nombre/apellido:");
		for (Asignatura b : asignaturas) {
			int n = b.getAlumnos().size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (b.getAlumnos().get(j).getNombreAlumno().compareTo(b.getAlumnos().get(j + 1).getNombreAlumno()) > 0) {
	                    // Intercambio
	                    Alumno temp = b.getAlumnos().get(j);
	                    b.getAlumnos().set(j, b.getAlumnos().get(j + 1));
	                    b.getAlumnos().set(j + 1, temp);
	                }
	            }
	        }
	    }
	    mostrarListaOrdenada(asignaturas);
	}

	private static void mostrarListaOrdenada(ArrayList<Asignatura> asignaturas){
		for (Asignatura b : asignaturas){
			System.out.println(b.getNombreAsignatura()+":");
			for (int i=0; i<b.getAlumnos().size(); i++){
				System.out.println(b.getAlumnos().get(i));
			}
		}
	}
}