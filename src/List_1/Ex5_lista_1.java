package List_1;

import java.util.Scanner;

public class Ex5_lista_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final float PI = 3.141592f;

        System.out.println("Digite o raio do círculo: ");
        float raio = leitor.nextFloat();

        float area = PI * (raio * raio);


        System.out.printf("A Área do círculo é: %.2f\n", area);

    }
}
