import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Informe 5 números:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] > numeros[j]) {
                    int posicaoTemporaria = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = posicaoTemporaria;
                }
            }
        }

        System.out.println("Números ordenados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

    }
}