package Tp2;
 
public class Yate extends Barco {
	private double potenciaCV;
	private int numeroCamarotes;
	
	public Yate(String matricula, double eslora, int anioFabricacion, double potenciaCV,int numeroCamarotes)
	{
		super(matricula,eslora,anioFabricacion);
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
		return "Yate [potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + "]";
	}	
}
