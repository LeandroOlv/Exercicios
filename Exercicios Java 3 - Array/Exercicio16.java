import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasDaSemana = 7;
        double[] vendasDiarias = new double[diasDaSemana];

        // Registro das vendas diárias
        for (int i = 0; i < diasDaSemana; i++) {
            System.out.print("Informe as vendas do dia " + (i + 1) + ": R$ ");
            vendasDiarias[i] = scanner.nextDouble();
        }

        // Cálculo da média de vendas
        double somaVendas = 0;
        for (double venda : vendasDiarias) {
            somaVendas += venda;
        }
        double mediaVendas = somaVendas / diasDaSemana;

        // Exibição da média de vendas
        System.out.println("Média de vendas diárias da semana: R$ " + mediaVendas);

        scanner.close();
    }
}