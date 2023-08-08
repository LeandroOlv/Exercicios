import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int[] vetor3 = new int[3];

        // Soma os elementos dos vetores 1 e 2 e preenche o vetor 3
        for (int i = 0; i < 3; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        // Exibe o vetor 3
        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor 3 (soma dos vetores 1 e 2): " + Arrays.toString(vetor3));
    }
}