public class Exercicio4 {

    public static void main(String[] args) {
        // Declaração do vetor com as notas
        int[] notas = {8, 7, 6, 9, 5, 8}; // Exemplo de notas, você pode alterar os valores aqui

        // Chama o método para calcular a média e exibe o resultado
        double media = calcularmedia(notas);
        System.out.println("Média das notas: " + media);
    }

    // Método para calcular a média das notas
    public static double calcularmedia(int[] notas) {
        int soma = 0;

        // Percorre o vetor somando todas as notas
        for (int nota : notas) {
            soma += nota;
        }

        // Calcula a média e retorna o resultado
        return (double) soma / notas.length;
    }
}