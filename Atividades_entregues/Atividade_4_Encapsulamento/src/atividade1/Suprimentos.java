package atividade1;

public class Suprimentos {
    private int numeroItem;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Suprimentos(int numeroItem, String descricao, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;

        if (quantidadeComprada < 0) {
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }

        if (precoUnitario < 0.0) {
            this.precoUnitario = 0.0;
        } else {
            this.precoUnitario = precoUnitario;
        }

    }

    public double getInvoiceAmount(int quantidadeComprada, double precoUnitario) {
        return quantidadeComprada * precoUnitario;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = Math.max(quantidadeComprada, 0);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = Math.max(precoUnitario, 0.0);
    }
}
