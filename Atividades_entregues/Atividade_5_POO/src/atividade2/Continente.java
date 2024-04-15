package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nomeContinente;
    List<String> listaDePaises = new ArrayList<String>();

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public List<String> getListaDePaises() {
        adicionaPaisesNoContinente();
        return listaDePaises;
    }

    public void adicionaPaisesNoContinente() {
        if (nomeContinente.equalsIgnoreCase("Africa")) {
            listaDePaises.add("Angola");
            listaDePaises.add("Moçambique");
            listaDePaises.add("África do Sul");

        } else if (nomeContinente.equalsIgnoreCase("America")) {
            listaDePaises.add("México");
            listaDePaises.add("Brasil");
            listaDePaises.add("Uruguai");

        } else if (nomeContinente.equalsIgnoreCase("Antartida")) {
            listaDePaises.add("A Antártica não possui nenhum país!");

        } else if (nomeContinente.equalsIgnoreCase("Asia")) {
            listaDePaises.add("China");
            listaDePaises.add("Japão");
            listaDePaises.add("Tailândia");

        } else if (nomeContinente.equalsIgnoreCase("Europa")) {
            listaDePaises.add("Irlanda");
            listaDePaises.add("Bélgica");
            listaDePaises.add("Holanda");

        } else if (nomeContinente.equalsIgnoreCase("Oceania")){
            listaDePaises.add("Austrália");
            listaDePaises.add("Nova Zelândia");
            listaDePaises.add("Ilhas Salomão");

        } else {
            listaDePaises.add("Informe o nome de um continente existente!");

        }
    }

    public void mostrarDimensaoTotalContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Dimensão total: 30 milhões de km²");
            case "America" -> System.out.println("Dimensão total: 42 milhões de km²");
            case "Antartida" -> System.out.println("Dimensão total: 14 milhões de km²");
            case "Asia" -> System.out.println("Dimensão total: 45 milhões de km²");
            case "Europa" -> System.out.println("Dimensão total: 10 milhões de km²");
            case "Oceania" -> System.out.println("Dimensão total: 8 milhões de km²");
        }
    }

    public void mostrarPopulacaoTotalContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("População total: 1,2 bilhões de habitantes");
            case "America" -> System.out.println("População total: 1 bilhão de habitantes");
            case "Antartida" -> System.out.println("Não possui habitantes.");
            case "Asia" -> System.out.println("População total: 4,5 bilhões de habitantes");
            case "Europa" -> System.out.println("População total: 740 milhões de habitantes");
            case "Oceania" -> System.out.println("População total: 37 milhões de habitantes");
        }
    }

    public void mostrarDensidadePopulacionalContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Densidade populacional: 40,5 hab/km²");
            case "America" -> System.out.println("Densidade populacional: 21,40 hab/km²");
            case "Antartida" -> System.out.println("Não possui densidade populacional.");
            case "Asia" -> System.out.println("Densidade populacional: 101,86 hab/km²");
            case "Europa" -> System.out.println("Densidade populacional: 72,8 hab/km²");
            case "Oceania" -> System.out.println("Densidade populacional: 4,45 hab/km²");
        }
    }

    public void mostrarPaisComAMaiorPopulacaoNoContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Nigéria é o país mais populoso (aprox. 173 milhões de habitantes)");
            case "America" -> System.out.println("Estados Unidos é o país mais populoso (aprox. 328 milhões de habitantes)");
            case "Antartida" -> System.out.println("Não é possível mostrar o país com a maior população nesse continente.");
            case "Asia" -> System.out.println("China é o país mais populoso (aprox. 1,4 bilhões de habitantes)");
            case "Europa" -> System.out.println("Rússia é o país mais populoso (aprox. 143 milhões de habitantes)");
            case "Oceania" -> System.out.println("Austrália é o país mais populoso (aprox. 23 milhões de habitantes)");
        }
    }

    public void mostrarPaisComAMenorPopulacaoNoContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Seicheles é o país menos populoso (aprox. 98 mil habitantes)");
            case "America" -> System.out.println("São Cristóvão e Névis é o país menos populoso (aprox. 53 mil habitantes)");
            case "Antartida" -> System.out.println("Não é possível mostrar o país com a menor população nesse continente.");
            case "Asia" -> System.out.println("Maldivas é o país menos populoso (aprox. 521 mil habitantes)");
            case "Europa" -> System.out.println("Vaticano é o país menos populoso (aprox. 1 mil habitantes)");
            case "Oceania" -> System.out.println("Tuvalu é o país menos populoso (aprox. 11 mil habitantes)");
        }
    }

    public void mostrarPaisComAMaiorDimensaoTerritorialNoContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Argélia é o país com maior dimensão territorial (aprox. 2.381.741 km²)");
            case "America" -> System.out.println("Canadá é o país com maior dimensão territorial (aprox. 9.984.670 km²)");
            case "Antartida" -> System.out.println("Não é possível mostrar o país com a maior dimensão territorial nesse continente.");
            case "Asia" -> System.out.println("Rússia é o país com maior dimensão territorial (aprox. 17.098.242 km²)");
            case "Europa" -> System.out.println("Rússia (parte europeia) é o país com maior dimensão territorial (aprox. 3.995.200 km²)");
            case "Oceania" -> System.out.println("Austrália é o país com maior dimensão territorial (aprox. 7.692.024 km²)");
        }
    }

    public void mostrarPaisComAMenorDimensaoTerritorialNoContinente(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Seicheles é o país com menor dimensão territorial (aprox.  459 km²)");
            case "America" -> System.out.println("São Cristóvão e Neves é o país com menor dimensão territorial (aprox. 261 km²)");
            case "Antartida" -> System.out.println("Não é possível mostrar o país com a menor dimensão territorial nesse continente.");
            case "Asia" -> System.out.println("Maldivas é o país com menor dimensão territorial (aprox. 298 km²)");
            case "Europa" -> System.out.println("Vaticano é o país com menor dimensão territorial (aprox. 0,44 km²)");
            case "Oceania" -> System.out.println("Nauru é o país com menor dimensão territorial (aprox. 21 km²)");
        }
    }

    public void mostrarRazaoTerritorialEntreMaiorEMenorPais(String nomeContinente) {
        switch (nomeContinente) {
            case "Africa" -> System.out.println("Razão Territorial: Argélia (2.381.741 km²) / Seicheles (459 km²) ≈ 5.193:1.");
            case "America" -> System.out.println("Razão Territorial: Canadá (9.984.670 km²) / São Cristóvão e Neves (261 km²) ≈ 38.317:1");
            case "Antartida" -> System.out.println("Não é possível calcular a razão territorial.");
            case "Asia" -> System.out.println("Razão Territorial: Rússia (17.098.242 km²) / Maldivas (298 km²) ≈ 57.425:1");
            case "Europa" -> System.out.println("Razão Territorial: Rússia (parte europeia) (3.995.200 km²) / Vaticano (0,44 km²) ≈ 9.079.090:1");
            case "Oceania" -> System.out.println("Razão Territorial: Austrália (7.692.024 km²) / Nauru (21 km²) ≈ 366.000:1");
        }
    }
}
