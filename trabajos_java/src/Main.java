import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el promedio: ");
        double promedio = entrada.nextDouble();

        System.out.print("Ingresa el porcentaje de asistencia: ");
        double asistencia = entrada.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else if (asistencia < 80) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }

        entrada.close();
    }
}