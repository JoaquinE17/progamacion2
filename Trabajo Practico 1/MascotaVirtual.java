public class MascotaVirtual {
	/* ATRIBUTOS */
	final private int MAX_ENERGIA = 100;
	final private int MIN_ENERGIA = 0;
	
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


	/* SETTER */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}
	
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public void setCanDesgaste(int canDesgaste) {
		this.canDesgaste = canDesgaste;
	}
	
	public void setCanComer(int canComer) {
		this.canComer = canComer;
	}
	

	/* GETTER */
	public String getNombre() {
		return nombre;
	}

	public boolean getDormido() {
		if (this.energia<=MIN_ENERGIA)
			this.dormido = true;
		return this.dormido;
	}

	public double getEnergia() {
		if (this.energia>MAX_ENERGIA)
			this.energia = MAX_ENERGIA;
		if (this.energia<=MIN_ENERGIA){
			this.energia = MIN_ENERGIA;
			this.canDesgaste = 0;
		}
		return this.energia;
	}

	public int getHumor(){
		double pivot = getEnergia();
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

	public int getCanDesgaste() {
		if (this.canDesgaste==3){
			this.dormido = true;
		}
		return this.canDesgaste;
	}

	public int getCanComer() {
		if (this.canComer<=MIN_ENERGIA)
			this.canComer = MIN_ENERGIA;
		return this.canComer;
	}

	public boolean getVivo(){
		if (this.energia<=MIN_ENERGIA){
			return false;
		}
		return true;
	}


	/* METODOS */
	public boolean beber() {
		if (this.canComer == 5) {
			this.energia = 0;
		}
		if (this.energia<=MAX_ENERGIA && this.energia>MIN_ENERGIA && this.dormido == false){
			this.energia = this.energia + 15;
			this.canComer = this.canComer + 1;
		}
		return true;
	}
	
	public boolean comer() {
		if (this.canComer == 5) {
			this.energia = 0;
		}
		if (this.energia<=MAX_ENERGIA && this.energia>MIN_ENERGIA && this.dormido == false){
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
		if (this.dormido == true && getVivo()==true){
			this.energia = this.energia + this.energia*0.25;
			this.dormido = false;
			if (this.canDesgaste<=3 && this.canComer<=5){
				this.canDesgaste = 0;
				this.canComer = 0;
			}
		}
		return this.dormido;
	}
	// ---vv
	public boolean caminar() {
		if (getDormido()==false){
			this.energia = this.energia - 15;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
		
	}

	public boolean correr() {
		if (getDormido()==false){
			this.energia = this.energia - this.energia*0.50;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
	}

	public boolean saltar() {
		if (getDormido()==false){
			this.energia = this.energia - 5;
			this.canDesgaste += 1;
			this.canComer -=1;
		}
		return true;
	}

	

	public void MostrarMascota() {
		System.out.println("> Me llamo: " + this.nombre);
		System.out.print("> Estoy vivo: " + getVivo());
		System.out.println( (getVivo()==true)?" (^w^) SI!!...":" (-_-) MORI...");
		System.out.println("> Estoy durmiendo: " + getDormido());
		System.out.println("   _ Nivel de energia: " + getEnergia() + "%");
		System.out.println("   _ Nivel de humor: " + getHumor());
		System.out.println("   _ Desgaste max(3): " + getCanDesgaste());
		System.out.println("   _ Ingesta max(5): " + getCanComer());
	}	
	
}
