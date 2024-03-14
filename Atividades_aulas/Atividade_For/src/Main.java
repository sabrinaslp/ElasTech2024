import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* --------------------------------------------------------------------------------------------------------------------------------------------------------
        Escreva um programa em Java que solicita ao usuário um número inteiro positivo e, em seguida, exibe uma contagem regressiva a partir desse número até zero.
        ---------------------------------------------------------------------------------------------------------------------------------------------------------*/
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = leia.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

}