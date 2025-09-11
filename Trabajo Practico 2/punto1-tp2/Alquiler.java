//package Tp2; 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	// Atributos
	private String nombre;// ✓
	private int dni;// ✓
	private LocalDate fechaInicio;// ✓
	private LocalDate fechaFin;// ✓
	private int posicionAmarre; // ✓
	private Barco barco; // ✓ 

	final private int valorFijo = 20000; // ✓
	
	// Constructor
	public Alquiler(){
		this.nombre = null;
		this.dni = 0;
		this.fechaInicio = null;
		this.fechaFin = null;
		this.posicionAmarre = 0;
		this.barco = null;
	}
	public Alquiler(String nombre, int dni, LocalDate fechaInicio, LocalDate fechaFin,int posicionAmarre, Barco barco){
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}

	public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

	
	// Calcular alquiler
	public double calcularAlquiler(double moduloBarco){
		int diasOcupacion = (int) (ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1);// Contar dias entre fechas (convertirlo a int) (incluyendo inicio y fin)
		return diasOcupacion*moduloBarco*valorFijo;
	}// ✓

	public String toString() {
		return "Alquiler: [Nombre: "+nombre+
		", DNI: "+dni+
		", Dias de alquiler: "+(ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1)+
		", Fecha (inicio): "+fechaInicio+
		", Fecha (fin) "+fechaFin+
		", "+barco+"]";	
	}
	
	
}
