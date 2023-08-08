import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os preços da ação em cada dia:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        double maiorVariacao = 0;

        for (int i = 0; i < precos.length - 1; i++) {
            double variacao = Math.abs(precos[i + 1] - precos[i]);
            if (variacao > maiorVariacao) {
                maiorVariacao = variacao;
            }
        }

        System.out.println("Maior variação de preço entre dois dias consecutivos: " + maiorVariacao);

        scanner.close();
    }
}