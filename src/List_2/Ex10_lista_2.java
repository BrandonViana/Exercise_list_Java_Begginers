package List_2;

import java.util.Scanner;

public class Ex10_lista_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à mercearia!");
        System.out.println("Por favor, escolha o produto desejado:");

        System.out.println("1. Banana");
        System.out.println("2. Laranja");
        System.out.println("3. Maçã");
        System.out.println("4. Kiwi");

        System.out.print("Digite o número correspondente ao produto: ");
        int produtoEscolhido = scanner.nextInt();

        double precoUnitario;

        switch (produtoEscolhido) {
            case 1:
                precoUnitario = calcularPrecoUnitario("Banana");
                break;
            case 2:
                precoUnitario = calcularPrecoUnitario("Laranja");
                break;
            case 3:
                precoUnitario = calcularPrecoUnitario("Maçã");
                break;
            case 4:
                precoUnitario = calcularPrecoUnitario("Kiwi");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número de 1 a 4.");
                return;
        }

        System.out.print("Quantas unidades você deseja comprar? ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Por favor, insira um número maior que zero.");
            return;
        }

        double precoTotal = precoUnitario * quantidade;
        System.out.printf("O valor total da compra é R$ %.2f%n", precoTotal);
    }

    public static double calcularPrecoUnitario(String produto) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Você escolheu %s.%n", produto);
        System.out.println("Quantidade menor que uma dúzia ou pelo menos doze? (digite 'menor' ou 'doze')");
        String quantidadeEscolhida = scanner.nextLine();

        switch (produto) {
            case "Banana":
                return (quantidadeEscolhida.equals("menor")) ? 0.30 : 0.25;
            case "Laranja":
                return (quantidadeEscolhida.equals("menor")) ? 0.40 : 0.35;
            case "Maçã":
                return (quantidadeEscolhida.equals("menor")) ? 0.50 : 0.45;
            case "Kiwi":
                return (quantidadeEscolhida.equals("menor")) ? 0.40 : 0.30;
            default:
                return 0.0;
        }
    }
}