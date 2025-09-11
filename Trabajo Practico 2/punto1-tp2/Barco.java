//package Tp2; // CV = Caballos a Vapor

public class Barco {
    // Atributos
    private String matricula;
    private double metrosEslora;
    private int anioFabricacion;

    // Constructor
    public Barco(String matricula, double metrosEslora, int anioFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioFabricacion = anioFabricacion;
    }

    // Calcular modulo
    public double moduloBarco() {
        return metrosEslora * 10;
    }

    @Override
    public String toString() {
        return "\n  |_Barco: [matricula: " + matricula + ", metrosEslora: " + metrosEslora + ", anioFabricacion: " + anioFabricacion + "]";
    }
}


/*
public class Deportivo extends Barco { // SUB-CLASE
	private double potenciaCV;// ✓
	
	public Deportivo(double potenciaCV){
		this.potenciaCV = potenciaCV;
	}

	@Override
	public double calcularModulo() {
		// TODO Auto-generated method stub
		return super.calcularModulo()+potenciaCV;
	}

	@Override
	public String toString() {
		return "Deportivo [potenciaCV=" + potenciaCV + "]";
	}
}

public class Yate extends Deportivo {
	private int numeroCamarotes;
	
	public Yate(double potenciaCV,int numeroCamarotes){
		this.potenciaCV = potenciaCV;
		this.numeroCamarotes = numeroCamarotes;
	}

	@Override
	public double calcularModulo() {
		// TODO Auto-generated method stub
		return super.calcularModulo()+potenciaCV+numeroCamarotes;
	}

	@Override
	public String toString() {
		return "Barco velero [potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + "]";
	}	
}*/
