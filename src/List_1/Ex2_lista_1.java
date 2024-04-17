package List_1;

import java.util.Scanner;

public class Ex2_lista_1 {
    public static void main(String[] args) {
        int num1, num2, num3, soma;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Cálculo de soma!");
        System.out.println("Digite o número 1: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o número 2:");
        num2 = leitor.nextInt();
        System.out.println("Digite o número 3:");
        num3 = leitor.nextInt();

        soma = num1 + num2 + num3;

        System.out.printf("O resxultado da soma dos três números é: %d", soma);


    }
}
