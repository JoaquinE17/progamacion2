public class Velero extends Barco {
    private int numeroMastiles;

    // Constructor
    public Velero(String matricula, double metrosEslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, metrosEslora, anioFabricacion); // llamada al constructor de la superclase
        this.numeroMastiles = numeroMastiles;
    }

    // Método calcular módulo sobrescrito
    @Override
    public double moduloBarco() {
        return super.moduloBarco() + numeroMastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n      |_Velero: [numeroMastiles: " + numeroMastiles + "]";
    }
}
