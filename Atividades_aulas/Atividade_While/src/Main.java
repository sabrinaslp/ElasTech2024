import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0, tentativas = 5, numerodasorte = random.nextInt(10) + 1; // adiciona +1 para ficar no intervalo de 1 a 10

        System.out.println("============== * Vamos iniciar o jogo! * ==============");
        System.out.println("Você deve acertar o numero que o robô esta pensando!");
        System.out.println("=======================================================");

        for (int i = 0; i < 5; i++) {
            while (palpite != numerodasorte && tentativas != 0) {
                System.out.println("Informe um palpite: ");
                palpite = leitura.nextInt();
                tentativas--;

                if (palpite == numerodasorte) {
                    System.out.println("Parabéns!! Você acertou!");
                } else if (tentativas == 0) {
                    System.out.println("GAME OVER!");
                    System.out.println("O número da sorte era: " + numerodasorte);
                } else {
                    System.out.println("Tente novamente!");
                    System.out.println("Você ainda tem " + tentativas + " chances.");
                    System.out.println(palpite > numerodasorte ? "Acho que você deveria colocar um valor MENOR..." : "Acho que você deveria colocar um valor MAIOR...");
                }
            }
        }
    }
}