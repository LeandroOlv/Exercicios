import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // Criar um objeto de classe Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Gerar um número aleatório de 0 a 100
        int number = random.nextInt(100);
        int guess;

        //Pedir ao usuário para adivinhar o número
        System.out.print("Tente adivinhar o número (0 a 100):");
        do{
            // Ler o palpite do usuário
            guess = scanner.nextInt();

            // Verificar se o palpite é igual ao número gerado
            if (guess < number) {
                System.out.print("Número errado, tente um valor maior: ");
            } else if (guess > number) {
                System.out.print("Número errado, tente um valor menor: ");
            }               
        }while(guess != number);

        // Se o loop sair, significa que o usuário acertou
        System.out.println("Parabéns, você acertou o número!");
        scanner.close();
    }
}