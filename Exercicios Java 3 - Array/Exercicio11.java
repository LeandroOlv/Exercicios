import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do vetor para armazenar os itens da lista de compras
        String[] listaDeCompras = new String[5];

        System.out.println("Olá, Barbie! Vamos criar a lista de compras para a sua festa!");

        // Loop para solicitar os itens à Barbie
        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.print("Digite o item " + (i + 1) + " (ou digite 'sair' para encerrar): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("sair")) {
                break;
            }

            listaDeCompras[i] = item;
        }

        System.out.println("\nLista de compras da Barbie:");
        // Exibição da lista completa
        for (String item : listaDeCompras) {
            if (item != null) {
                System.out.println("- " + item);
            }
        }

        scanner.close();
    }
}