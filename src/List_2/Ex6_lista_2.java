package List_2;

import java.util.Scanner;

public class Ex6_lista_2 {
    public static void main(String[] args) {
        int A, B, C;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 valores para formar um triângulo - A, B e C: ");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os lados formam um triângulo");
        } else {
            System.out.println("Os lados não formam um triângulo");
        }
    }
}
