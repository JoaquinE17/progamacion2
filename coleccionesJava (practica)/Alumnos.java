// Nombre y apellido, Libreta Universitaria, sexo, condición (regular o condicional) y la nota final.

class Alumnos{
// Atributos
	private String nombre;
	private String apellido;
	private String libretaUniversitaria;
	private String sexo;
	private String condicion;
	private double notaFinal;
// Constructor
	Alumnos(){
		this.nombre = null;
		this.apellido = null;
		this.libretaUniversitaria = null;
		this.sexo = null;
		this.condicion = null;
		this.notaFinal = 0.0;
	}
// Setters
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	void setApellido(String apellido){
		this.apellido = apellido;
	}
	void setLibretaUniversitaria(String libretaUniversitaria){
		this.libretaUniversitaria = libretaUniversitaria;
	}
	void setSexo(String sexo){
		this.sexo = sexo;
	}
	void setCondicion(String condicion){
		this.condicion = condicion;
	}
	void setNotaFinal(double notaFinal){
		this.notaFinal = notaFinal;
	}
// Getters
	String getNombre(){
		return this.nombre;
	}
	String getApellido(){
		return this.apellido;
	}
	String getLibretaUniversitaria(){
		return this.libretaUniversitaria;
	}
	String getSexo(){
		return this.sexo;
	}
	String getCondicion(){
		return this.condicion;
	}
	double getNotaFinal(){
		return this.notaFinal;
	}
}