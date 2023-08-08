import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Preencher o vetor com valores fictícios (pode ser alterado para valores desejados)
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        // Solicitar ao usuário para digitar um número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();
        scanner.close();

        // Verificar se o número digitado está presente no vetor
        boolean encontrado = false;
        for (int elemento : vetor) {
            if (elemento == numeroDigitado) {
                encontrado = true;
                break;
            }
        }

        // Exibir o resultado
        if (encontrado) {
            System.out.println("O número " + numeroDigitado + " está presente no vetor.");
        }
    }
}