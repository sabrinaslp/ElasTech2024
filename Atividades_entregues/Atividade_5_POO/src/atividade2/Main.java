package atividade2;
//2) Escreva em Java uma classe Continente. Um continente possui um nome e é composto
//por um conjunto de países. Forneça os membros de classe a seguir:

//a) ok! Construtor que inicialize o nome do continente;
//b) ok! Um método que permita adicionar países aos continentes;
//c) ok! Um método que retorne a dimensão total do continente;
//d) ok! Um método que retorne a população total do continente;
//e) ok! Um método que retorne a densidade populacional do continente;
//f) ok! Um método que retorne o país com maior população no continente;
//g) ok! Um método que retorne o país com menor população no continente;
//h) ok! Um método que retorne o país de maior dimensão territorial no continente;
//i) ok! Um método que retorne o país de menor dimensão territorial no continente;
//j) ok! Um método que retorne a razão territorial do maior pais em relação ao menor país.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o nome de um continente (Africa | America | Antartida | Asia | Europa | Oceania): ");
        String nomeContinente = leitura.nextLine();

        Continente continente = new Continente(nomeContinente);

        System.out.println("========================================================");
        System.out.println("Dados do continente: " + continente.getNomeContinente());
        System.out.println("========================================================");

        String paises = String.join(" - ", continente.getListaDePaises());
        System.out.println("Países que fazem parte da " + nomeContinente + ": " + paises);

        continente.mostrarDimensaoTotalContinente(nomeContinente);
        continente.mostrarPopulacaoTotalContinente(nomeContinente);
        continente.mostrarDensidadePopulacionalContinente(nomeContinente);
        continente.mostrarPaisComAMaiorPopulacaoNoContinente(nomeContinente);
        continente.mostrarPaisComAMenorPopulacaoNoContinente(nomeContinente);
        continente.mostrarPaisComAMaiorDimensaoTerritorialNoContinente(nomeContinente);
        continente.mostrarPaisComAMenorDimensaoTerritorialNoContinente(nomeContinente);
        continente.mostrarRazaoTerritorialEntreMaiorEMenorPais(nomeContinente);
    }
}
