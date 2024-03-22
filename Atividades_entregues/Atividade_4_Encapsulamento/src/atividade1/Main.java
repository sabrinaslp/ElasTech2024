package atividade1;

public class Main {

    public static void main(String[] args) {

        Suprimentos item1 = new Suprimentos(1, "Mouse", 1, 70.00);
        Suprimentos item2 = new Suprimentos(2, "Teclado", 3, 69.90);
        Suprimentos item3 = new Suprimentos(3, "Cabo HDMI", 1, 10.00);

        System.out.println("======* Faturamento *======");
        System.out.println("Item vendido: " + item1.getDescricao());
        System.out.println("ID do item: " + item1.getNumeroItem());
        System.out.println("Quantidade comprada: " + item1.getQuantidadeComprada());
        System.out.printf("Preço unitário R$: %.2f\n", item1.getPrecoUnitario());

        double valorTotal = item1.getInvoiceAmount(item1.getQuantidadeComprada(), item1.getPrecoUnitario());
        System.out.println("==========================");
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        System.out.println("==========================");
        System.out.println("Item vendido: " + item2.getDescricao());
        System.out.println("ID do item: " + item2.getNumeroItem());
        System.out.println("Quantidade comprada: " + item2.getQuantidadeComprada());
        System.out.printf("Preço unitário R$: %.2f\n", item2.getPrecoUnitario());

        valorTotal = item2.getInvoiceAmount(item2.getQuantidadeComprada(), item2.getPrecoUnitario());
        System.out.println("==========================");
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        System.out.println("==========================");
        System.out.println("Item vendido: " + item3.getDescricao());
        System.out.println("ID do item: " + item3.getNumeroItem());
        System.out.println("Quantidade comprada: " + item3.getQuantidadeComprada());
        System.out.printf("Preço unitário R$: %.2f\n", item3.getPrecoUnitario());

        valorTotal = item3.getInvoiceAmount(item3.getQuantidadeComprada(), item3.getPrecoUnitario());
        System.out.println("==========================");
        System.out.printf("Valor total: R$ %.2f", valorTotal);
    }

}
