package atividade2;

public class Colaborador {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;

        if (salarioMensal < 0.0) {
            this.salarioMensal = 0.0;
        } else {
            this.salarioMensal = salarioMensal;
        }

    }

    public double calculeSalarioAnual(double salarioMensal) {
        return salarioMensal * 12;
    }

    public double calculeAumentoSalarial(double salarioMensal) {
        double aumento = salarioMensal * 0.10;
        this.salarioMensal = salarioMensal + aumento;
        return this.salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0.0) {
            this.salarioMensal = 0.0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }
}
