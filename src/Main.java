public class Main {


    public static void main(String[] args) {
        double valorCompra = 499.99;
        double desconto = 0;


        if (valorCompra >= 100.00 && valorCompra < 500.00) {
            desconto = valorCompra * 0.10;


        } else if (valorCompra >= 500.00) {
            desconto = valorCompra * 0.20;


        } else {
            System.out.println("Valores abaixo de R$100.00 não recebe desconto");
        }

        double total = valorCompra - desconto;

        System.out.printf("O total da compra é: %.2f%n", total);
    }
}
