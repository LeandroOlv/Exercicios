public class Exercicio8 {

    public static void main(String[] args) {
        int n = 10; // Número de termos que queremos exibir
        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + "");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}