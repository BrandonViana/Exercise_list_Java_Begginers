package List_2;

import java.util.Scanner;

public class Ex7_lista_2 {
    public static void main(String[] args) {
        int eleitores, vB, vN, vV;
        double pB, pN, pV;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com número de eleitores, votos brancos, votos nulos e votos válidos:");
        eleitores = entrada.nextInt();
        vB = entrada.nextInt();
        vN = entrada.nextInt();
        vV = entrada.nextInt();

        pB = (double) vB * 100 / eleitores;
        pN = (double) vN * 100 / eleitores;
        pV = (double) vV * 100 / eleitores;

        System.out.printf("Resultado: %.0f%%\n", pB);
        System.out.printf("Resultado: %.0f%%\n", pN);
        System.out.printf("Resultado: %.0f%%\n", pV);
    }
}
