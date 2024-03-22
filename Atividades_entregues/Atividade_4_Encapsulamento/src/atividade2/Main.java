package atividade2;

public class Main {

    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Caroline", "Silva", 3590.00);
        Colaborador colaborador2 = new Colaborador("Jorge", "Santos", 2720.00);

        double salarioAnual = colaborador1.calculeSalarioAnual(colaborador1.getSalarioMensal());
        System.out.printf("O salário anual d(a) %s %s é R$ %.2f \n", colaborador1.getPrimeiroNome(), colaborador1.getSobrenome(), salarioAnual);

        salarioAnual = colaborador1.calculeSalarioAnual(colaborador2.getSalarioMensal());
        System.out.printf("O salário anual d(a) %s %s é R$ %.2f \n", colaborador2.getPrimeiroNome(), colaborador2.getSobrenome(), salarioAnual);

        System.out.println("\n====== Notícia boa!! Todo mundo recebeu 10% de aumento! ======\n");

        colaborador1.calculeAumentoSalarial(colaborador1.getSalarioMensal());
        salarioAnual = colaborador1.calculeSalarioAnual(colaborador1.getSalarioMensal());

        System.out.printf("O NOVO salário anual d(a) %s %s é R$ %.2f \n", colaborador1.getPrimeiroNome(), colaborador1.getSobrenome(), salarioAnual);

        colaborador2.calculeAumentoSalarial(colaborador2.getSalarioMensal());
        salarioAnual = colaborador2.calculeSalarioAnual(colaborador2.getSalarioMensal());

        System.out.printf("O NOVO salário anual d(a) %s %s é R$ %.2f \n", colaborador2.getPrimeiroNome(), colaborador2.getSobrenome(), salarioAnual);
    }

}
