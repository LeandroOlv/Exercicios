import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxAmigos = 5;
        String[] nomesAmigos = new String[maxAmigos];
        int[] quebraCabecasResolvidos = new int[maxAmigos];

        System.out.println("Bem-vinda ao Torneio de Quebra-Cabeças da Barbie!");
        System.out.println("Insira os dados dos amigos:");

        for (int i = 0; i < maxAmigos; i++) {
            System.out.print("Nome do amigo " + (i + 1) + "; ");
            nomesAmigos[i] = scanner.nextLine();

            System.out.print("Quantidade de quebra-cabeças resolvidos por " + nomesAmigos[i] + "; ");
            quebraCabecasResolvidos[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada numérica
        }

        System.out.println("\nResultados do Torneio:");
        for (int i = 0; i < maxAmigos; i++) {
            System.out.println(nomesAmigos[i] + " resolveu " + quebraCabecasResolvidos[i] + " quebra-cabeças.");
        }

        scanner.close();
    }
}