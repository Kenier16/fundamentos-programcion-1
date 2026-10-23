import java.util.Scanner;

public class ControlEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, autos = 0, descuentos = 0;
        double pago, total = 0;

        System.out.println("Horas estacionado:");
        horas = sc.nextInt();

        while (horas != 0) {

            if (horas < 0) {
                System.out.println("Horas no validas");
            } else {
                pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    descuentos++;
                }

                System.out.println("Debe pagar: $" + pago);

                autos++;
                total = total + pago;
            }

            System.out.println("Horas estacionado:");
            horas = sc.nextInt();
        }

        System.out.println("Automoviles atendidos: " + autos);
        System.out.println("Dinero recaudado: $" + total);
        System.out.println("Automoviles con descuento: " + descuentos);

        if (autos > 0) {
            System.out.println("Promedio pagado: $" + (total / autos));
        } else {
            System.out.println("Promedio pagado: $0");
        }


    }
}
