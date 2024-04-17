package List_1;

import java.util.Scanner;

public class Ex8_lista_1 {
    public static void main(String[] args) {

        float horas, minutos, segundos, totalSegundos;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as horas, minutos e segundos de um dia: ");
        horas = leitor.nextInt();
        minutos = leitor.nextInt();
        segundos = leitor.nextInt();

        totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.printf("O total de segundos transcorridos em um dia: %.2f", totalSegundos);
    }
}
