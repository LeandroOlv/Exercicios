public class Exercicio7 {
    public static void main(String[] args) {
        // Declare um vetor com 5 números inteiros
        int[] vetor = { 1, 2, 3, 4, 5 };

        // Calcule a soma do primeiro e último elemento
        int soma = vetor[0] + vetor[vetor.length - 1];

        // Exiba o resultado da soma
        System.out.println("A soma do primeiro e último elemento é: " + soma);
    }
}