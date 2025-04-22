import carros.Carro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Carro carro[] = new Carro[2];
        int fimDaCorrida = 30;

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o modelo do carro %d : ",i+1);
            carro[i] = new Carro(sc.nextLine());
        }

        /* Menu da corrida */
        System.out.println("==============================");
        System.out.println("#");
        System.out.println("#");
        System.out.println("==============================");

        /* SIMULADOR DE CORRIDA */

        boolean corridaFinalizada = false;

        while (!corridaFinalizada) {
            System.out.println("==============================");

            for (int i = 0; i < 2; i++) {
                carro[i].mover();
                System.out.println(carro[i]);
            }

            System.out.println("==============================");

            if (carro[0].getDistancia() >= fimDaCorrida || carro[1].getDistancia() >= fimDaCorrida) {
                corridaFinalizada = true;
                if (carro[0].getDistancia() > carro[1].getDistancia()) {
                    System.out.println("Corrida finalizada, " + carro[0].getModelo() + " venceu!");
                } else if (carro[1].getDistancia() > carro[0].getDistancia()) {
                    System.out.println("Corrida finalizada, " + carro[1].getModelo() + " venceu!");
                } else {
                    System.out.println("Corrida finalizada, empate!");
                }
            }
        }

        sc.close();
    }
}
