package List_2;

import java.util.Scanner;

public class Ex8_lista_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado A do triângulo:");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o valor do lado B do triângulo:");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o valor do lado C do triângulo:");
        double ladoC = scanner.nextDouble();

        if (verificarTriangulo(ladoA, ladoB, ladoC)) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é equilátero.");
            } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                System.out.println("O triângulo é escaleno.");
            } else {
                System.out.println("O triângulo é isósceles.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }
    }

    public static boolean verificarTriangulo(double ladoA, double ladoB, double ladoC) {
        return (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
    }
}

