import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor por hora trabalhada:");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas:");
        int qtdHoras = scanner.nextInt();

        double salarioBruto = qtdHoras * valorPorHora,
                descontoIR = 0,
                descontoINSS = salarioBruto * 0.10,
                descontoSindicato = salarioBruto * 0.03,
                valorFGTS = salarioBruto * 0.11;

        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500){
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        double somaDescontos = descontoIR + descontoINSS + descontoSindicato,
                salarioLiquido = salarioBruto - somaDescontos;

        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("IR: R$ %.2f\n", descontoIR);
        System.out.printf("INSS: R$ %.2f\n", descontoINSS);
        System.out.printf("FGTS: R$ %.2f\n", valorFGTS);
        System.out.printf("Sindicato: R$ %.2f\n", descontoSindicato);
        System.out.printf("Total de descontos: R$ %.2f\n", somaDescontos);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
    }
}