import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* ------------------------------------------------------------------------------------------------------
        1. Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 1 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer para consumir o espaço

        System.out.printf("Seu nome é %s e você tem %d anos. \n", nome, idade);

        /* ------------------------------------------------------------------------------------------------------
        2. Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão.
        Exiba os resultados.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 2 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Informe dois números: ");
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer para consumir o espaço

        double adicao = primeiroNumero + segundoNumero,
                sub = primeiroNumero - segundoNumero,
                multi = primeiroNumero * segundoNumero,
                div = (double) primeiroNumero / segundoNumero;

        System.out.printf("A ADIÇÃO entre o número %d e o número %d é igual a: %.2f \n", primeiroNumero, segundoNumero, adicao);
        System.out.printf("A SUBTRAÇÃO entre o número %d e o número %d é igual a: %.2f \n", primeiroNumero, segundoNumero, sub);
        System.out.printf("A MULTIPLICAÇÃO entre o número %d e o número %d é igual a: %.2f \n", primeiroNumero, segundoNumero, multi);
        System.out.printf("A DIVISÃO entre o número %d e o número %d é igual a: %.2f \n", primeiroNumero, segundoNumero, div);

        /* ------------------------------------------------------------------------------------------------------
        3. Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 3 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Informe um número: ");
        int numeroDigitado = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer para consumir o espaço

        if (numeroDigitado == 0) {
            System.out.println("O número informado é 0 (zero).");
        } else if (numeroDigitado > 0){
            System.out.println("O número é POSITIVO.");
        } else {
            System.out.println("O número é NEGATIVO.");
        }

        /* ------------------------------------------------------------------------------------------------------
        4. Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 4 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Informe um dia da semana (em formato numérico de 1 a 7): ");
        int diaDaSemana = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer para consumir o espaço

        switch (diaDaSemana) {
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda!");
                break;
            case 3:
                System.out.println("Hoje é terça!");
                break;
            case 4:
                System.out.println("Hoje é quarta!");
                break;
            case 5:
                System.out.println("Hoje é quinta!");
                break;
            case 6:
                System.out.println("Hoje é sexta!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;
            default:
                System.out.println("Insira um dia válido.");
        }

        /* ------------------------------------------------------------------------------------------------------
        5. Escreva um programa em Java que solicita ao usuário um número inteiro. Com base nesse número, o programa
        deve realizar as seguintes ações:

        1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
        2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
        3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 5 -------------------------");
        System.out.println("----------------------------------------------------------------");

        int positivo, negativo;

        System.out.println("Informe um número inteiro:");
        int num = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer para consumir o espaço

        if (num > 0) {
            positivo = num;
            System.out.printf("O número %d é positivo.\n", positivo);
        } else if (num < 0) {
            negativo = num;
            System.out.printf("O número %d é negativo.\n", negativo);
        } else {
            System.out.println("O número é 0, digite outro!");
        }

        switch (num % 2) {
            case 0:
                System.out.printf("O número %d é par.\n", num);
                break;
            case 1:
            case -1:
                System.out.printf("O número %d é impar.\n", num);
                break;
        }

        /* ------------------------------------------------------------------------------------------------------
        6- Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:

        1. Solicitar ao usuário que insira o valor total de sua compra.
        2. Com base nesse valor, aplicar descontos conforme as seguintes regras:

        Se o valor for maior que R$ 200, aplique um desconto de 10%.
        Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
        Caso contrário, não aplique desconto.
        3. Exiba o valor final a ser pago pelo usuário após o desconto.

        Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:

        Opção 1: Cartão de crédito
        Opção 2: Boleto bancário
        Opção 3: Transferência bancária
        ------------------------------------------------------------------------------------------------------ */
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- Exercício 6 -------------------------");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Insira o valor total de sua compra: ");
        double valorTotal = scanner.nextDouble();
        double desconto;

        if (valorTotal > 200) {
            desconto = valorTotal * 0.10;
        } else if (valorTotal >= 100) {
            desconto = valorTotal * 0.05;
        } else {
            desconto = 0;
        }

        double valorTotalComDesconto = valorTotal - desconto;

        System.out.printf("Valor total após o desconto: R$ %.2f\n", valorTotalComDesconto);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Informe o método de pagamento: " +
                "\n[1] Cartão de Crédito " +
                "\n[2] Boleto bancário" +
                "\n[3] Transferência Bancária");
        int opcaoPagamento = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoPagamento) {
            case 1:
                System.out.println("Método de pagamento selecionado: CARTÃO DE CRÉDITO.");
                break;
            case 2:
                System.out.println("Método de pagamento selecionado: BOLETO BANCÁRIO");
                break;
            case 3:
                System.out.println("Método de pagamento selecionado: TRANSFERÊNCIA BANCÁRIA");
                break;
        }

    }
}