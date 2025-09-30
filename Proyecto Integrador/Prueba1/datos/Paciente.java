package datos;

public class Paciente {
    private String id;
    private String nombre;
    private String dni;
    private String telefono;

    public Paciente(String id, String nombre, String dni, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return id + ";" + nombre + ";" + dni + ";" + telefono;
    }

    public static Paciente fromString(String linea) {
        String[] partes = linea.split(";");
        return new Paciente(partes[0], partes[1], partes[2], partes[3]);
    }
}

