public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = { 10, 20, 30, 40, 50 };
        int soma = 0;

        // Loop for para percorrer o vetor e somar os elementos
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("O resultado da soma dos elementos do vetor é: " + soma);
    }
}