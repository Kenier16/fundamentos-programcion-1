import java.util.Scanner;

public class jugador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int puntos = 100; // puntos iniciales
        int opcion = 0;

        // el menu se repite hasta salir
        while (opcion != 4) {
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Que quieres hacer?: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                puntos = puntos + 20;
                System.out.println("Ganaste 20 puntos");
            }

            if (opcion == 2) {
                // regla: no puede gastar si tiene menos de 15
                if (puntos < 15) {
                    System.out.println("No puedes gastar, tienes pocos puntos");
                } else {
                    puntos = puntos - 15;
                    System.out.println("Gastaste 15 puntos");
                }
            }

            if (opcion == 3) {
                System.out.println("Tus puntos son: " + puntos);
            }

            if (opcion == 4) {
                System.out.println("Adios");
            }
        }

        // al terminar muestra los puntos
        System.out.println("Te quedaste con " + puntos + " puntos");
        entrada.close();
    }
}