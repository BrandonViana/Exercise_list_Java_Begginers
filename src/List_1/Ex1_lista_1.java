package List_1;

import java.util.Scanner;

public class Ex1_lista_1 {
    public static void main(String[] args) {
        int num1, num2, soma;

        Scanner leitor = new Scanner((System.in));

        System.out.println("Cálculo de soma!");
        System.out.println("Digite o número 1: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o número 2:");
        num2 = leitor.nextInt();

        soma = num1 + num2;

        System.out.printf("O resultado da soma dos dois números é: %d", soma);
    }
}
