import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ------------------------------------------------------------------------------------------------------
        1- Fazer um programa que imprima a média aritmética dos números 8, 9 e 7.
        A média dos números 4, 5 e 6.
        A soma das duas médias.
        A média das médias.
        ------------------------------------------------------------------------------------------------------ */

        int a = 8, b = 9, c = 7;
        double media1 = (double) (a + b + c) / 3;

        System.out.println("-------------------------- Exercício 1 --------------------------");
        System.out.printf("-> A média aritmética dos números 8, 9 e 7 é igual a: %.0f \n", media1);

        int x = 4, y = 5, z = 6;
        double media2 = (double) (x + y + z) / 3;

        System.out.printf("-> A média aritmética dos números 4, 5 e 6 é igual a: %.0f \n", media2);

        double somaDasMedias = media1 + media2;
        System.out.printf("-> A soma das médias é igual a: %.0f \n", somaDasMedias);

        double mediaDasMedias = (somaDasMedias)/2;
        System.out.println("-> A média das médias é igual a: " + mediaDasMedias);

        /* ------------------------------------------------------------------------------------------------------
        2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 2 --------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int antecessor = --numero;

        System.out.println("O ANTECESSOR é: " + antecessor);

        numero++; // volta a variável número para valor original (digitado)
        int sucessor = ++numero;

        System.out.println("O SUCESSOR é: " + sucessor);

        /* ------------------------------------------------------------------------------------------------------
        3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 3 --------------------------");

        int idadeJorge = 22, idadeLarissa = 10;

        int soma = idadeJorge + idadeLarissa;
        int multi = idadeJorge * idadeLarissa;
        double div = (double) idadeJorge/idadeLarissa;

        System.out.println("A SOMA entre as idades: " + soma);
        System.out.println("A MULTIPLICAÇÃO entre as idades é igual a: " + multi);
        System.out.printf("A DIVISÃO entre as idades é igual a: %.2f \n", div);

        /* ------------------------------------------------------------------------------------------------------
        4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final
        mostre todos os dados informados
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 4 --------------------------");

        System.out.println("Digite seu nome:");
        String nomeDigitado = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Nome completo: " + nomeDigitado + " " + sobrenome + " | Idade: " + idade + " | Endereço: " + endereco);

        /* ------------------------------------------------------------------------------------------------------
        5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse
        usuario nasceu.
        ------------------------------------------------------------------------------------------------------*/
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 5 --------------------------");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade que você completa nesse ano: ");
        int idadeDigitada = scanner.nextInt();

        int anoNascimento = 2024 - idadeDigitada;

        System.out.println("Você nasceu em: " + anoNascimento);
    }
}