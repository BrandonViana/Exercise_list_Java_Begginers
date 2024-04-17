package List_2;

import java.util.Scanner;

public class Ex5_lista_2 {
    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para verificar se ele está no intervalo entre 100 e 200: ");
        valor = entrada.nextInt();

        if (valor < 100 || valor > 200) {
            System.out.println("Não está no intervalo");
        } else {
            System.out.println("Está no intervalo");
        }
    }
}
