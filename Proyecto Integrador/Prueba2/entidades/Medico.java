package entidades;

public class Medico{
	String id;
	String nombre;
	String especialidadString;
	String telefonoString;
	
	public Medico() {
		super();
		this.id = null;
		this.nombre = null;
		this.especialidadString = null;
		this.telefonoString = null;
	}
	
	public Medico(String id, String nombre, String especialidadString, String telefonoString) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidadString = especialidadString;
		this.telefonoString = telefonoString;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidadString() {
		return especialidadString;
	}

	public String getTelefonoString() {
		return telefonoString;
	}

	@Override
	public String toString() {
		return id + ";" + nombre + ";" + especialidadString + ";" + telefonoString;
	}

	public static Medico fromString(String linea) {
        String[] partes = linea.split(";");
        return new Medico(partes[0], partes[1], partes[2], partes[3]);
    }
	
	
	
	
}