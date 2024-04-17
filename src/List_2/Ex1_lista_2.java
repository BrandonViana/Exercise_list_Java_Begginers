package List_2;

import java.util.Scanner;

public class Ex1_lista_2 {
    public static void main(String[] args) {
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        valor = entrada.nextInt();


        if (valor > 100) {
            System.out.println("O número lido é maior que 100");
        } else {
            System.out.println("O número é menor que 100");
        }
    }
}
