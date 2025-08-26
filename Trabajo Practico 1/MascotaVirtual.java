public class MascotaVirtual {
	/* ATRIBUTOS */
	final private int VALOR_MAX = 100;
	final private int VALOR_MIN = 0;
	
	private String nombre;
	private boolean dormido;
	private double energia;
	private int canDesgaste;
	private int canComer;
	
	/* CONSTRUCTORES*/
	public MascotaVirtual(String nombre) {
		this.nombre = nombre;
		this.dormido = false;
		this.energia = 40.0;
		this.canDesgaste = 0;
		this.canComer = 0;
	}

	public MascotaVirtual(String nombre, boolean dormido, double energia, int canDesgaste, int canComer) {
		this.nombre = nombre;
		this.dormido = dormido;
		this.energia = energia;
		this.canDesgaste = canDesgaste;
		this.canComer = canComer;
	}

	/* METODOS */
	public String mostrarNombre() {
		return this.nombre;
	}

	public boolean estaDormido() {
		if (this.energia<=VALOR_MIN)
			this.dormido = true;
		return this.dormido;
	}

	public double nivelEnergia() {
		if (this.energia>VALOR_MAX)
			this.energia = VALOR_MAX;
		if (this.energia<=VALOR_MIN){
			this.energia = VALOR_MIN;
			this.canDesgaste = 0;
		}
		return this.energia;
	}

	public int gradoHumor(){
		double pivot = nivelEnergia();
		if (pivot>0 && pivot<=20)
				return 1;
		if (pivot>=21 && pivot<=40)
				return 2;
		if (pivot>=41 && pivot<=60)
				return 3;
		if (pivot>=61 && pivot<=80)
				return 4;
		if (pivot>=81 && pivot<=100)
				return 5;
		else
			return 0;
	}

	public int nivelDesgaste() {
		if (this.canDesgaste==3){
			this.dormido = true;
		}
		return this.canDesgaste;
	}

	public int nivelIngesta() {
		if (this.canComer<=VALOR_MIN)
			this.canComer = VALOR_MIN;
		return this.canComer;
	}

	public boolean estaVivo(){
		if (this.energia<=VALOR_MIN){
			return false;
		}
		return true;
	}


	/* METODOS */
	public boolean beber() {
		if (this.canComer == 5) {
			this.energia = 0;
		}
		if (this.energia<=VALOR_MAX && this.energia>VALOR_MIN && this.dormido == false){
			this.energia = this.energia + 15;
			this.canComer = this.canComer + 1;
		}
		return true;
	}
	
	public boolean comer() {
		if (this.canComer == 5) {
			this.energia = 0;
		}
		if (this.energia<=VALOR_MAX && this.energia>VALOR_MIN && this.dormido == false){
			this.energia = this.energia + 30;
			this.canComer = this.canComer + 1;
		}
		return true;
	}
	
	public boolean dormir() {
		this.dormido = true;
		return this.dormido;
	}
	public boolean despertar() {
		if (this.dormido == true && estaVivo()==true){
			this.energia = this.energia + this.energia*0.25;
			this.dormido = false;
			this.canDesgaste = 0;
			this.canComer = 0;
		}
		return this.dormido;
	}
	// ---vv
	public boolean caminar() {
		if (estaDormido()==false){
			this.energia = this.energia - 15;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
		
	}

	public boolean correr() {
		if (estaDormido()==false){
			this.energia = this.energia - this.energia*0.50;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
	}

	public boolean saltar() {
		if (estaDormido()==false){
			this.energia = this.energia - 5;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
	}

	

	public void MostrarMascota() {
		System.out.print("> Me llamo: " + mostrarNombre() + "   ");
		System.out.println( (estaVivo()==true)?" (^w^) SI!!...":" (-_-) MORI...");
		System.out.println("> Estoy vivo: " + estaVivo());
		System.out.println("> Estoy durmiendo: " + estaDormido());
		System.out.println("   _ Nivel de energia: " + nivelEnergia() + "%");
		System.out.println("   _ Nivel de humor: " + gradoHumor());
		System.out.println("   _ Desgaste max(3): " + nivelDesgaste());
		System.out.println("   _ Ingesta max(5): " + nivelIngesta());
	}	
	
}
