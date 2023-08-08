public class Exercicio5 {
    public static void main(String[] args) {
        int[] numeros = { 10, 3, 7, 8, 20, 15, 6 };
        int quantidadePares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
    }
}