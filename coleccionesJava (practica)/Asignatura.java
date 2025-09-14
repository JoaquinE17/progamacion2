import java.util.ArrayList;

public class Asignatura {

	private String nombreAsignatura;
	private int anio;
	private int totalHoras;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	Asignatura() {
		this.nombreAsignatura = null;
		this.anio = 0;
		this.totalHoras = 0;		
	}

	// Setter
	public void setNombreAsignatura(String nombreAsignatura) {
	    this.nombreAsignatura = nombreAsignatura;
	}
	public void setAnio(int anio) {
	    this.anio = anio;
	}
	public void setTotalHoras(int totalHoras) {
	    this.totalHoras = totalHoras;
	}

	// Getter
	public String getNombreAsignatura() {
	    return nombreAsignatura;
	}
	public int getAnio() {
	    return anio;
	}
	public int getTotalHoras() {
	    return totalHoras;
	}
	public ArrayList<Alumno> getAlumnos() {
	    return alumnos;
	}

	@Override
	public String toString() {
	    return " ASIGNATURA: [Nombre: "+nombreAsignatura+
	    ", Anio: "+anio+
	    ", Horas totales: "+totalHoras+"]";
	}

	// Metodos adicionales
	public void agregarAlumno(Alumno alumno) {
	    alumnos.add(alumno);
	}
}