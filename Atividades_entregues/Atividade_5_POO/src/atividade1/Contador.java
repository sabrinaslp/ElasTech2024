package atividade1;

public class Contador {

    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public void zerarContador() {
        this.valor = 0;
    }

    public void incremetarContador() {
        this.valor++;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valorNovo) {
        this.valor = valorNovo;
    }

}
