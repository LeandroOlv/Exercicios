import java.util.Scanner;
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
        int numero = 4; // Quantidade de vetores
        int vetor[] = new int[numero]; // Declarando vetor
        System.out.print("Informe as horas" + (i + 1) + ": ");
        int horas = scanner.nextInt();
        soma += horas;
        }

        System.out.println("A soma das horas inseridas é: " + soma);
        // Fechando scanner
        scanner.close();
    }
}