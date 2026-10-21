import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PuntosAcomulados=0;
        double promedioDePuntuacion=0;
        int partidasMasDe1000=0;
        int partidas1000oMenos=0;

        for (int i = 1;  i <= 7; i++) {
            System.out.println("puntuacion partida "+i);
            int puntos = scanner.nextInt();

            PuntosAcomulados += puntos;
                if (puntos > 1000) {
                    partidasMasDe1000++;
                } else {
                    partidas1000oMenos++;


                }

        }

        System.out.println("puntos acomulados:" + PuntosAcomulados + ":");
        System.out.println("promedio de puntuacion:" + promedioDePuntuacion);
        System.out.println("partidas de mas de 1000" + partidasMasDe1000);
        System.out.println("partidas de 1000 o menos" + partidas1000oMenos);

    }
}
