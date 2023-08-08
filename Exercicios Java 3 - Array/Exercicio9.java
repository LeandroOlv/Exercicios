public class Exercicio9 {
    public static void main(String[] args) {
        // Declarando o vetor com 5 números inteiros
        int[] vetor = {1, 2, 3, 4, 5};

        // Multiplicando cada elemento do vetor por 2
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * 2;
        }

        // Exibindo o vetor resultante
        System.out.print("Vetor resultante: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}