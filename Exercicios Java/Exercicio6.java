import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser maior ou igual a zero.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i =2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}