import java.util.Scanner;

public class clima {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en °C: ");
        int temperatura = entrada.nextInt();

        if (temperatura < 10) {
            System.out.println("Frío extremo");
        } else if (temperatura <= 20) {
            System.out.println("Clima fresco");
        } else if (temperatura <= 30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }

        entrada.close();
    }
}