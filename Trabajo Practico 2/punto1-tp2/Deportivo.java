package Tp2;

public class Deportivo extends Barco {
	private double potenciaCV;
	
	public Deportivo(String matricula, double eslora, int anioFabricacion, double potenciaCV)
	{
		super(matricula,eslora,anioFabricacion);
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
