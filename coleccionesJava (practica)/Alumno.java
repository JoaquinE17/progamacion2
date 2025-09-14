public class Alumno {

	private String nombreAlumno;
	private int libretaUniversitaria;
	private String sexo;
	private String condicion;
	private double notaFinal;

	Alumno(){
		this.nombreAlumno = null;
		this.libretaUniversitaria = 0;
		this.sexo = null;
		this.condicion = null;
		this.notaFinal = 0.0;
	}

	// Setter
	public void setNombreAlumno(String nombreAlumno) {
	    this.nombreAlumno = nombreAlumno;
	}
	public void setLibretaUniversitaria(int libretaUniversitaria) {
	    this.libretaUniversitaria = libretaUniversitaria;
	}
	public void setSexo(String sexo) {
	    this.sexo = sexo;
	}
	public void setCondicion(String condicion) {
	    this.condicion = condicion;
	}
	public void setNotaFinal(double notaFinal) {
	    this.notaFinal = notaFinal;
	}

	// Getter
	public String getNombreAlumno() {
	    return nombreAlumno;
	}

	public String getSexo() {
	    return sexo;
	}

	public String getCondicion() {
	    return condicion;
	}

	public double getNotaFinal() {
	    return notaFinal;
	}

	@Override
	public String toString() {
	    return "  * ALUMNO: [Nombre: "+nombreAlumno+
	    ", LU: "+libretaUniversitaria+
	    ", Sexo: "+sexo+
	    ", Condicion: "+condicion+
	    ", Nota final: "+String.format("%.2f", notaFinal)+"]";// [%.2f]:Reduce a dos decimales (amigable a la vista)
	}
}