import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* ------------------------------------------------------------------------------------------------------
        1 - Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 1 -------------------------");
        System.out.println("----------------------------------------------------------------");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        /* ------------------------------------------------------------------------------------------------------
        2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 2 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Escreva um número: ");
        int numeroEx2 = scanner.nextInt();

        System.out.printf("A tabuada do número %d é: \n", numeroEx2);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroEx2 + " * " + i + " = " + (numeroEx2 * i));
        }

        /* ------------------------------------------------------------------------------------------------------
        3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 3 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int soma = 0;

        for (int i = 0; i <= 100; i += 2) { // vai iterando de 2 em 2
            soma += i;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);

        /* ------------------------------------------------------------------------------------------------------
        4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 4 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Escreva um número: ");
        int numeroEx4 = scanner.nextInt();

        boolean primo = true;

        if (numeroEx4 <= 1) { // se for 0 ou 1, não são primos
            primo = false;
        } else { // verifica em cada iteração se o número é divisível por i, se encontrar um divisor (resto da divisão igual a 0, o número NÃO é primo
            for (int i = 2; i <= Math.sqrt(numeroEx4); i++) { // se um número não é primo, ele terá pelo menos um divisor menor ou igual à sua raiz quadrada
                if (numeroEx4 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        System.out.println((primo) ? "Esse número É PRIMO!" : "O número NÃO é primo."); // condição simplificada para verificar se primo == true

        /* ------------------------------------------------------------------------------------------------------
        5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 5 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int primeiroNumero = 0, segundoNumero = 1;
        System.out.println("Os 20 primeiros números da sequência de Fibonacci são:");
        System.out.print(primeiroNumero + " - " + segundoNumero);

        for (int i = 2; i < 20; i++) { // já temos os 2 primeiros termos 0 e 1, por isso i = 2
            int proximoNumero = primeiroNumero + segundoNumero;
            System.out.print(" - " + proximoNumero);
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }

        /* ------------------------------------------------------------------------------------------------------
        6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar um número
        negativo, o programa deve exibir a média dos números inseridos até aquele momento.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 6 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int numeroEx6, quantidadeDeNumeros = 0, somaDosNumeros = 0;

        do {
            System.out.println("Digite um número inteiro positivo. " +
                    "\nInforme um número negativo para calcular a média dos números positivos digitados: ");
            numeroEx6 = scanner.nextInt();

            if (numeroEx6 > 0) {
                somaDosNumeros += numeroEx6;
                quantidadeDeNumeros++;
            }

        } while (numeroEx6 >= 0);

        double media = (double) somaDosNumeros / quantidadeDeNumeros;

        if (quantidadeDeNumeros > 0) {
            System.out.printf("A média dos números digitados é igual a: %.2f\n", media);
        } else {
            System.out.println("Não foi digitado nenhum número inteiro positivo!");
        }

        /* ------------------------------------------------------------------------------------------------------
        7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, multiplicação e
        divisão entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 7 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int opcao;

        do {
            System.out.println("\nInforme o número da operação deseja realizar: ");
            System.out.println("[1] - Soma");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Sair da calculadora");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe os dois números que deseja SOMAR:");
                    int primeiroNumSoma = scanner.nextInt();
                    int segundoNumSoma = scanner.nextInt();
                    double somaEx7 = (double) primeiroNumSoma + segundoNumSoma;

                    System.out.printf("Resultado: %d + %d = %.1f\n", primeiroNumSoma, segundoNumSoma, somaEx7);
                    break;

                case 2:
                    System.out.println("Informe os dois números que deseja SUBTRAIR:");
                    int primeiroNumSub = scanner.nextInt();
                    int segundoNumSub = scanner.nextInt();
                    double sub = (double) primeiroNumSub - segundoNumSub;

                    System.out.printf("Resultado: %d - %d = %.1f\n", primeiroNumSub, segundoNumSub, sub);
                    break;

                case 3:
                    System.out.println("Informe os dois números que deseja MULTIPLICAR:");
                    int primeiroNumMult = scanner.nextInt();
                    int segundoNumMult = scanner.nextInt();
                    double mult = (double) primeiroNumMult * segundoNumMult;

                    System.out.printf("Resultado: %d * %d = %.2f\n", primeiroNumMult, segundoNumMult, mult);
                    break;

                case 4:
                    System.out.println("Informe os dois números que deseja DIVIDIR:");
                    int primeiroNumDiv = scanner.nextInt();
                    int segundoNumDiv = scanner.nextInt();
                    double div = (double) primeiroNumDiv / segundoNumDiv;

                    System.out.printf("Resultado: %d / %d = %.2f\n", primeiroNumDiv, segundoNumDiv, div);
                    break;

                case 5:
                    System.out.println("Obrigada por utilizar nossa calculadora! <3");
                    break;

                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }

        } while (opcao != 5);

        /* ------------------------------------------------------------------------------------------------------
        8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar
        adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 8 -------------------------");
        System.out.println("----------------------------------------------------------------");

        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(100) + 1; // adiciona +1 para ficar no intervalo de 1 a 100

        System.out.println("============== * Vamos iniciar o jogo! * ==============");
        System.out.println("Você deve acertar o numero que o robô esta pensando!");
        System.out.println("=======================================================");

        while (palpite != numerodasorte) {
            System.out.println("Informe um palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("Parabéns!! Você acertou!");
            } else {
                System.out.println("Tente novamente!");
                System.out.println(palpite > numerodasorte ? "Acho que você deveria colocar um valor MENOR..." :
                        "Acho que você deveria colocar um valor MAIOR...");
            }
        }

        /* ------------------------------------------------------------------------------------------------------
        9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao
        usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 9 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int opcaoEx9;
        double tempCelsius, tempFahrenheit;

        do {
            System.out.println("\nInforme a operação da conversão que deseja realizar: ");
            System.out.println("[1] - Conversão de Celsius (ºC) para Fahrenheit (ºF)");
            System.out.println("[2] - Conversão de Fahrenheit (ºF) para Celsius (ºC)");
            System.out.println("[3] - Sair do menu");

            opcaoEx9 = scanner.nextInt();

            switch (opcaoEx9) {
                case 1:
                    System.out.println("Informe a temperatura em graus Celsius (ºC): ");
                    tempCelsius = scanner.nextDouble();
                    tempFahrenheit = (tempCelsius * 9.0/5.0) + 32;
                    System.out.printf("Conversão realizada! A temperatura %.1f (ºC) é igual a %.1f (ºF)\n", tempCelsius, tempFahrenheit);
                    break;

                case 2:
                    System.out.println("Informe a temperatura em Fahrenheit (ºF): ");
                    tempFahrenheit = scanner.nextDouble();
                    tempCelsius = (tempFahrenheit - 32.0) * 5.0/9.0;
                    System.out.printf("Conversão realizada! A temperatura %.1f (ºF) é igual a %.1f (ºC)\n", tempFahrenheit, tempCelsius);
                    break;

                case 3:
                    System.out.println("Obrigada por utilizar nosso conversor!\n");
                    break;

                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }
        } while (opcaoEx9 != 3);

        /* ------------------------------------------------------------------------------------------------------
        10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve
        exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
        O programa deve continuar executando até que o usuário decida sair.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 10 ------------------------");
        System.out.println("----------------------------------------------------------------");

        ArrayList<String> listaDeCompras = new ArrayList<>();
        String item;
        char opcaoLista = 'S';

        System.out.println("*** Está na hora de fazer sua lista de compras! ***");

        do {
            System.out.println("\nDigite 'S' para adicionar itens ou 'N' para sair:");
            opcaoLista = scanner.next().charAt(0);
            scanner.nextLine(); // consumo da quebra de linha

            if (opcaoLista == 'S') {
                System.out.println("Qual item deseja adicionar?");
                item = scanner.nextLine();
                listaDeCompras.add(item);

                System.out.println("Lista de compras atualizada: " + listaDeCompras);
            }
        } while (opcaoLista == 'S');

        System.out.println("Saindo...");
        if (listaDeCompras.isEmpty()) {
            System.out.println("Não foi adicionado nenhum item na sua lista de compras!");
        } else {
            System.out.println("Lista atualizada: " + listaDeCompras);
        }
    }
}