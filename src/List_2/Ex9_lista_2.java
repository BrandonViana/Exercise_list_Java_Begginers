package List_2;

import java.util.Scanner;

public class Ex9_lista_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas laranjas você comprou?");
        int quantidadeLaranjas = scanner.nextInt();

        if (quantidadeLaranjas <= 0) {
            System.out.println("Quantidade inválida. Por favor, insira um número maior que zero.");
        } else {
            double precoTotal;
            if (quantidadeLaranjas < 12) {
                precoTotal = quantidadeLaranjas * 0.30;
            } else {
                precoTotal = quantidadeLaranjas * 0.25;
            }
            System.out.printf("O valor total da compra é R$ %.2f%n", precoTotal);
        }
    }
}

