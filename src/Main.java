public class Main {
    public static void main(String[] args) {

        /* 1- Fazer um programa que imprima a média aritmética dos números 8, 9 e 7.
        A média dos números 4, 5 e 6.
        A soma das duas médias.
        A média das médias. */

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

        /* 2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor. */

        /* 3 - Crie um codigo que contenha 3 operações matematicas de sua escolha. */

        /* 4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final
        mostre todos os dados informados */

        /* 5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse
        usuario nasceu. */
    }
}