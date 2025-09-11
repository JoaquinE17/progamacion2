import java.util.Random;

class Mago extends Personaje {
    private Random random = new Random();

    public Mago() {
        super(100, 45, 10);// vida, ataque, defensa
    }

    public void defender(int ataqueRecibido) {
        int esquivar = random.nextInt(nivelDefensa + 1); // defensa aleatoria
        int dañoRecibido = ataqueRecibido - esquivar;
        dañoRecibido = Math.max(dañoRecibido, 0);// Garantizar que el valor minimo sea 0
        vida -= dañoRecibido;
        System.out.println("[-] Mago recibe " + dañoRecibido + " de daño (esquivo: " + esquivar + ").");
        if (vida <= 0) {
            vida = 0;
            System.out.println("[x] EL MAGO AH MUERTO");
        }
    }
}

// Mago: tiene menos vida, pero esquiva más (defensa aleatoria)
