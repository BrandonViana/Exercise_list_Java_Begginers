package List_1;

import java.util.Scanner;

public class Ex9_lista_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numHomens, numMulheres, numCriancas;

        float mediaHomensGrama = 0.650f, mediaMulherG = 0.420f, mediaC = 0.290f,
                qntdCN, totalGramas;
        System.out.println("Digite o núemero de convidados na ordem, Homens, Mulheres e Crianças: ");

        numHomens = leitor.nextInt();
        numMulheres = leitor.nextInt();
        numCriancas = leitor.nextInt();

        totalGramas = (mediaHomensGrama * numHomens) + (mediaMulherG * numMulheres) + (mediaC + numCriancas);
        qntdCN = totalGramas / 1000;

        System.out.printf("A quantidade de carne necessária em Kg é: %.2f", qntdCN);
    }
}
