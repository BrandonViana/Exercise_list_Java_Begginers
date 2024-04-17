package List_2;

import java.util.Scanner;

public class Ex3_lista_2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros, na ordem, primeiro e segundo: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        if (num1 > num2) {

            System.out.println("O primeiro número é maior que o segundo número");
        } else {
            System.out.println("O segundo número é maior que o primeiro número");
        }
    }
}
