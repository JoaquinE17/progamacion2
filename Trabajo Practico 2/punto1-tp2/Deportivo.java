//package Tp2;

public class Deportivo extends Barco {
    private double potenciaCV;

    // Constructor
    public Deportivo(String matricula, double metrosEslora, int anioFabricacion, double potenciaCV) {
        super(matricula, metrosEslora, anioFabricacion); // llamada al constructor de la superclase
        this.potenciaCV = potenciaCV;
    }

    // Método calcular módulo sobrescrito
    @Override
    public double moduloBarco() {
        return super.moduloBarco() + potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + "\n      |_Deportivo: [potenciaCV: " + potenciaCV + "]";
    }
}
