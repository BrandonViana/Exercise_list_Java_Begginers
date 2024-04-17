package List_1;

import java.util.Scanner;

public class Ex7_lista_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float compPolegadas, compMilimetros, tamanhoPolegada = 25.4f;
        compPolegadas = leitor.nextFloat();

        compMilimetros = compPolegadas + tamanhoPolegada;

        System.out.printf("O comprimento em milímetros é: %.2f", compMilimetros);
    }
}
