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

	public boolean estaVivo(){
		if (this.energia<=VALOR_MIN){ // Muere se energia es cero o menor
			this.canDesgaste = 0;
			return false;
		}
		return true;
	}

	public boolean estaDormido() {
		if (this.energia<=VALOR_MIN) // Si la mascota murio
			this.dormido = true;
		return this.dormido;
	}

	public double nivelEnergia() {
		if (this.energia>VALOR_MAX) // Respetar el VALOR_MAX
			this.energia = VALOR_MAX;
		if (this.energia<=VALOR_MIN) // Respatar el VALOR_MIN
			this.energia = VALOR_MIN;
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
		return this.canDesgaste;
	}

	public int nivelIngesta() {
		if (this.canComer<=VALOR_MIN) // Respetar el VALOR_MIN
			this.canComer = VALOR_MIN;
		return this.canComer;
	}

	public boolean beber() {
		if (this.canComer == 5){ // Muere de indigestion
			this.energia = 0;
			this.canComer=this.canComer+1;
		}
		if (estaDormido() == false){ // Verifica que este despierto
			this.energia = this.energia + 15; // Incrementa energia
			this.canComer = this.canComer + 1; // Incrementa canComer
		}
		return true;
	}
	
	public boolean comer() {
		if (this.canComer == 4) { // Muere de indigestion
			this.energia = 0;
			this.canComer=this.canComer+1;
		}
		if (estaDormido() == false){ // Verifica que este despierto
			this.energia = this.energia + 30; // Incrementa energia
			this.canComer = this.canComer + 1; // Incrementa canComer
		}
		return true;
	}
	
	public void dormir() {
		this.dormido = true;
	}

	public boolean despertar() {
		if (estaDormido()!=false && estaVivo()==true){ // Verifica que estaDormido y estaVivo sean true
			this.energia = this.energia + this.energia*0.25;
			this.dormido = false;
			// Restablece valores
			this.canDesgaste = 0; 
			this.canComer = 0;
		}
		return this.dormido;
	}
	
	public boolean caminar() {
		if (this.canDesgaste==3){ // Solo haga tres actividades de desgaste
			this.dormido = true;
			this.canDesgaste += 1;
		}
		if (!estaDormido()){ // Verifica que estaDormido sea false
			this.energia = this.energia - 15;
			this.canDesgaste += 1; // Incrementa canDesgaste
			this.canComer -=1; // Disminuye canComer
		}
		return true;
		
	}

	public boolean correr() {
		if (this.canDesgaste==3){ // Solo haga tres actividades de desgaste
			this.dormido = true;
			this.canDesgaste += 1;
		}
		if (!estaDormido()){ // Verifica que estaDormido sea false
			this.energia = this.energia - this.energia*0.50;
			this.canDesgaste += 1; // Incrementa canDesgaste
			this.canComer -=1; // Disminuye canComer
		}
		return true;
	}

	public boolean saltar() {
		if (this.canDesgaste==3){ // Solo haga tres actividades de desgaste
			this.dormido = true;
		}
		if (!estaDormido()){ // Verifica que estaDormido sea false
			this.energia = this.energia - 5;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
	}

	public void MostrarMascota() {
		System.out.print("> Me llamo: " + mostrarNombre() + "   ");
		System.out.println( (estaVivo()==true)?" (^w^) SI!!...":" (-_-) MORI..."); // Operador ternario
		System.out.println("> Estoy vivo: " + estaVivo());
		System.out.println("> Estoy durmiendo: " + estaDormido());
		System.out.println("   _ Nivel de energia: " + nivelEnergia() + "%");
		System.out.println("   _ Nivel de humor: " + gradoHumor());
		System.out.println("   _ Desgaste max(3): " + nivelDesgaste());
		System.out.println("   _ Ingesta max(5): " + nivelIngesta());
	}	
	
}
