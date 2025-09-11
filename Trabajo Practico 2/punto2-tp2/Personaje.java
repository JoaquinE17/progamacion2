import java.util.Random;

abstract class Personaje {
    protected int vida;
    protected int nivelAtaque;
    protected int nivelDefensa;

    public Personaje(int vida, int nivelAtaque, int nivelDefensa) {
        this.vida = vida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public int atacar() {
        // Daño generado es igual al nivel de ataque
        return nivelAtaque;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}




