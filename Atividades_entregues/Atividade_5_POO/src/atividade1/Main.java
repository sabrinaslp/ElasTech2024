package atividade1;

//1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
//itens ou eventos. A classe deve oferecer métodos que devem:
//a) Zerar;
//b) Incrementar;
//c) Retornar o valor do contador.

public class Main {

    public static void main(String[] args) {
        Contador contador = new Contador(5);

        System.out.printf("Valor do contador: %d \n", contador.getValor());

        contador.incremetarContador();
        System.out.printf("Valor do contador após incremento: %d \n", contador.getValor());

        contador.zerarContador();
        System.out.printf("Valor do contador após ser zerado: %d \n", contador.getValor());

        contador.setValor(10);
        System.out.printf("Valor do contador após definição de novo valor: %d \n", contador.getValor());
    }
}
