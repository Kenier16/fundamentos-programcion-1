import java.util.Scanner;

public class Dron {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int bateria, minuto = 1;

        System.out.print("Bateria inicial: ");
        bateria = entrada.nextInt();

        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        System.out.println("El dron ya no puede seguir volando.");

        entrada.close();
    }
}
