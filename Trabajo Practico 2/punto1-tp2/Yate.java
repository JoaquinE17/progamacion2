//package Tp2;

public class Yate extends Barco {
    private double potenciaCV;
    private int numeroCamarotes;

    // Constructor
    public Yate(String matricula, double metrosEslora, int anioFabricacion, double potenciaCV, int numeroCamarotes) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    // Método calcular módulo sobrescrito
    @Override
    public double moduloBarco() {
        return super.moduloBarco() + potenciaCV + numeroCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "\n      |_Yate: [potenciaCV: " + potenciaCV + ", numeroCamarotes: " + numeroCamarotes + "]";
    }
}
