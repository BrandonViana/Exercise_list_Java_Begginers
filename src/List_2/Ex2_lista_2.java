package List_2;

import java.util.Scanner;

public class Ex2_lista_2 {
    public static void main(String[] args) {
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        valor = entrada.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número lido é par");
        } else {
            System.out.println("O número lido é ímpar");
        }

    }
}
