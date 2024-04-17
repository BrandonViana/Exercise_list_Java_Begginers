package List_1;

import java.util.Scanner;

public class Ex4_lista_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(("Digite um número inteiro: "));
        int x = leitor.nextInt();
        int quadrado_de_X = x * x;
        int resto_da_div_3 = x % 3;
        int metade_de_x = x / 2;
        int produto_de_x_metade = x * metade_de_x;


        System.out.println("Conteúdo de x: " + x);
        System.out.println("Quadrado de x: " + quadrado_de_X);
        System.out.println("Resto da divisão de x por 3: " + resto_da_div_3);
        System.out.println("Metade de x" + metade_de_x);
        System.out.println("Produto de x pela metade de x: " + produto_de_x_metade);
    }
}
