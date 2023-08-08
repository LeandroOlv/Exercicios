import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNadadores = 5;
        String[] nomes = new String[numNadadores];
        double[] tempos = new double[numNadadores];

        // Solicitar os dados à Barbie
        for (int i = 0; i < numNadadores; i++) {
            System.out.print("Digite o nome do nadador " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite o tempo do nadador " + (i + 1) + " (em segundos): ");
            tempos[i] = Double.parseDouble(scanner.nextLine());
        }

        // Encontrar o vencedor
        int indiceVencedor = 0;
        for (int i = 1; i < numNadadores; i++) {
            if (tempos[i] < tempos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }

        // Exibir o nome do nadador vencedor
        System.out.println("O nadador vencedor é: " + nomes[indiceVencedor]);

        scanner.close();
    }
}