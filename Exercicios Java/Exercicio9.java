import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechando o objeto Scanner
        scanner.close();
    }
}