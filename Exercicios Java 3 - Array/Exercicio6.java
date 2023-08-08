import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor de palavras com tamanho 4
        String[] palavras = new String[4];

        // Preenchendo o vetor com palavras digitadas pelo usuário
        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Digite a palavra " + (i + 1) + "; ");
            palavras[i] = scanner.next();
        }

        // Exibindo as palavras na ordem em que foram digitadas
        System.out.println("Palavras digitadas:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }
}