package List_1;

import java.util.Scanner;

public class Ex6_lista_1 {
    public static void main(String[] args) {
        float tempCelsius, tempFahrenheit;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em Fahrenheit: ");
        tempFahrenheit = leitor.nextFloat();


        tempCelsius = 5 * (tempFahrenheit - 32 / 9);

        System.out.printf("O valor de grau Fahrenheit convertido em Graus Celsius é: %.1f", tempCelsius);
    }
}
