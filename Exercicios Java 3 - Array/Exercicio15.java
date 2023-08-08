import java.util.Random;
import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        // Criando objetos de classe
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
        nomes[i] = scanner.nextLine();
        }

        // Sortear 3 nomes
        System.out.println("\nNomes sorteados:");
        for (int i = 0; i < 3; i++) {
            int indiceSorteado = random.nextInt(5);
            System.out.println(nomes[indiceSorteado]);
        }

        scanner.close();
    }
}        