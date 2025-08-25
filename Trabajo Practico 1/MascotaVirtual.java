package Tp1;

public class MascotaVirtual {
	static private int max_energia;
	static private int min_energia;
	
	private String nombre;
	private boolean dormido;
	private double energia;
	private int canDesgaste;
	private int canComer;
	
	public MascotaVirtual() {
		
	}
	public MascotaVirtual(String nombre, boolean dormido, double energia, int canDesgaste, int canComer) {
		this.nombre = nombre;
		this.dormido = dormido;
		this.energia = energia;
		this.canDesgaste = canDesgaste;
		this.canComer = canComer;
	}
	public boolean Beber() {
		energia = energia + 15;
		canComer = canComer + 1;
		if (canComer == 5) {
			energia = 0;
		}
		return true;
	}
	
	public boolean Comer() {
		energia = energia + 30;
		canComer =canComer + 1;
		if (canComer == 5) {
			energia = 0;
		}
		return true;
	}
	
	public boolean Dormir() {
		energia = energia + energia*0.25;
		dormido = true;
		 return true;
	}
	
	public boolean Caminar() {
		energia = energia - 15;
		canDesgaste -= 1;
		return true;
		
	}
	public boolean Correr() {
		energia = energia - energia*0.50;
		canDesgaste -= 1;
		return true;
	}
	public boolean Saltar() {
		energia = energia - 5;
		canDesgaste -= 1;
		return true;
	}
	
	public void MostrarMascota() {
		System.out.println("nombre: " + nombre);
		System.out.println("energia: " + energia);
		System.out.println("dormir: " + dormido);
		System.out.println("cantidad de desgaste: " + canDesgaste);
		System.out.println("cantidad de comer: " + canComer);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isDormido() {
		return dormido;
	}
	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}
	public double getEnergia() {
		return energia;
	}
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	public int getCanDesgaste() {
		return canDesgaste;
	}
	public void setCanDesgaste(int canDesgaste) {
		this.canDesgaste = canDesgaste;
	}
	public int getCanComer() {
		return canComer;
	}
	public void setCanComer(int canComer) {
		this.canComer = canComer;
	}
	
	
	
	
	
}
