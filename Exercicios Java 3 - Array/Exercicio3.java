public class Exercicio3 {

    public static void main(String[] args) {
        // Criando o vetor com 8 números inteiros
        int[] vetor = {5, 12, 8, 23, 6, 10, 15, 3};

        // Inicializando a variável para armazenar o maior valor
        int maiorValor = vetor[0]; // Iniciando com o primeiro elemento do vetor

        // Percorrendo o vetor para encontrar o maior valor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        // Exibindo o maior valor encontrado
        System.out.println("O maior valor no vetor é: " + maiorValor);
    }
}