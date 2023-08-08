public class ArrayExample {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Acessando elementos do array
        System.out.println("Primeiro elemento: " + numbers[0]);
        System.out.println("Tamanho do array: " + numbers.length);

        // Percorrendo e imprimindo todos os elementos do array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}