import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Declaração do vetor de frutas
        String[] frutas = {"Maça", "Banana", "Morango"};

        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para digitar um número de 0 a 2
        System.out.println("Digite um número de 0 a 2 para escolher uma fruta: ");

        // Ler o número digitado pelo usuário
        int numeroEscolhido = scanner.nextInt();

        // Verificar se o número está dentro do intervalo válido (0 a 2)
        if (numeroEscolhido >= 0 && numeroEscolhido <= 2) {
            // Acessar o vetor usando o número digitado pelo usuário como índice
            String frutaEscolhida = frutas[numeroEscolhido];

            // Mostrar o nome da fruta correspondente
            System.out.println("A fruta correspondente ao número " + numeroEscolhido + " é: " + frutaEscolhida);
        } else {
            System.out.println("Número inválido. Digite um número de 0 a 2.");
        }

        // Fechar o objeto Scanner
        scanner.close();
    }
}