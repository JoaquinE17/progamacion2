import java.util.Random;

class Guerrero extends Personaje {
    private Random random = new Random();

    public Guerrero() {
        super(150, 30, 20);// vida, ataque, defensa
    }

    public void defender(int ataqueRecibido) {
        int esquivar = random.nextInt(nivelDefensa + 1); // defensa aleatoria
        int dañoRecibido = ataqueRecibido - esquivar; 
        dañoRecibido = Math.max(dañoRecibido, 0);// Garantizar que el valor minimo sea 0
        vida -= dañoRecibido;  
        System.out.println("[-] Guerrero recibe " + dañoRecibido + " de daño (esquivo: " + esquivar + ").");
        if (vida <= 0) {
            vida = 0;
            System.out.println("[x] EL GUERRERO AH MUERTO");
        }
    }
}

// Guerrero: tiene más vida y defensa más fuerte