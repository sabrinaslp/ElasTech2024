import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Você foi contratado para desenvolver um programa que irá gerenciar uma lista de tarefas diárias de um usuário.
//        O programa deve permitir ao usuário adicionar novas tarefas, remover tarefas existentes, listar todas as tarefas pendentes.
//
//        1 - O programa deve usar um array para armazenar as tarefas do usuário.
//        2 - O usuário deve ser capaz de adicionar uma nova tarefa à lista
//        3 - O usuário deve ser capaz de remover uma tarefa existente da lista.
//        4 - O programa deve exibir todas as tarefas na lista

        Scanner leitura = new Scanner(System.in);

        ArrayList<String> listaDeTarefas = new ArrayList<>();

        int opcao;
        String tarefa;

        System.out.println("===========================================");
        System.out.println("===========* LISTA DE TAREFAS *===========*");
        System.out.println("===========================================");

        do {
            System.out.println("Informe o número do que você gostaria de fazer:");
            System.out.println("[1] - Adicionar uma tarefa");
            System.out.println("[2] - Remover uma tarefa");
            System.out.println("[3] - Listar tarefas da lista");
            System.out.println("[4] - Sair");

            opcao = leitura.nextInt();

            leitura.nextLine(); // limpar o espaço do nextInt

            switch (opcao) {
                case 1:
                    System.out.println("Que tarefa você gostaria de adicionar?");
                    tarefa = leitura.nextLine();
                    listaDeTarefas.add(tarefa);
                    System.out.println("===========================================");
                    System.out.println("TAREFA: " + tarefa + " - foi adicionada com sucesso!");
                    System.out.println("===========================================");
                    break;

                case 2:
                    System.out.println("Qual tarefa você gostaria de remover? Informe o número correspondente: ");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        System.out.println("[" + i + "] - " + listaDeTarefas.get(i));
                    }
                    int tarefaRemovida = leitura.nextInt();

                    if (tarefaRemovida < 0 || tarefaRemovida > listaDeTarefas.size()) {
                        System.out.println("===========================================");
                        System.out.println("Informe um número de tarefa válido!");
                        System.out.println("===========================================");
                    } else {
                        listaDeTarefas.remove(tarefaRemovida);
                        System.out.println("A tarefa: " + listaDeTarefas.get(tarefaRemovida) + " - foi removida com sucesso!");
                    }
                    break;

                case 3:
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("Ainda não há nenhuma tarefa adicionada na sua lista!");
                    }
                    System.out.println("==== * Lista de tarefas atualizada: * ====");
                    for (String tarefaAdicionada : listaDeTarefas) {
                        System.out.println("-> " + tarefaAdicionada);
                    }
                    System.out.println("===========================================");
                    break;

                case 4:
                    System.out.println("Obrigada por utilizar nosso gerenciador!");
                    break;

                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }

        } while (opcao != 4);
















    }
}