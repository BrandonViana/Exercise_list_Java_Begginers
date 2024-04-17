package List_1;

import java.util.Scanner;

public class Ex3_2_0_lista_1 {
    public static void main(String[] args) {
        float num1, num2, num3, num4, mediaAritmetica;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Cálculo de média Aritmética!!!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(("Digite 4 números inteiros em sequência, n1, n2, n3 e n4: "));
        num1 = leitor.nextFloat();
        num2 = leitor.nextFloat();
        num3 = leitor.nextFloat();
        num4 = leitor.nextFloat();

        mediaAritmetica = (num1 + num2 + num3 + num4) / 4;

        System.out.printf("A soma da média Aritimétioca desses 4 números é: %.2f ", mediaAritmetica);
    }
}

