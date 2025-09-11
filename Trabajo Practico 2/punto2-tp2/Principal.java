import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("\n####  Combate Nro. " + (i+1) + "  ####");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
            Guerrero guerrero = new Guerrero();
            Mago mago = new Mago();

            Random random = new Random();// Solo dos casos posibles
            boolean turnoGuerrero = random.nextBoolean();

            while (guerrero.estaVivo() && mago.estaVivo()) {
                if (turnoGuerrero) {
                    System.out.println("> Turno del Guerrero:");
                    int ataque = guerrero.atacar();
                    mago.defender(ataque);
                } else {
                    System.out.println("> Turno del Mago:");
                    int ataque = mago.atacar();
                    guerrero.defender(ataque);
                }
                System.out.println("----------------");
                System.out.println(" Vida Guerrero: " + guerrero.getVida());
                System.out.println(" Vida Mago: " + mago.getVida());
                System.out.println("-------------------------");

                turnoGuerrero = !turnoGuerrero;// Cambio de turno

            }

            String ganador = guerrero.estaVivo() ? "GUERRERO" : "MAGO";
            System.out.println("[G] El GANADOR del combate Nro. " + (i+1) + " es: " + ganador + "!");

            System.out.print("Continuar? (pulse enter)");
            scan.nextLine();
        }
    }
}
