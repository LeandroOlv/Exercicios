import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        int diasSemana = 7;
        double[] temperaturas = new double[diasSemana];

        Scanner scanner = new Scanner(System.in);

        // Registro das temperaturas
        for (int i = 0; i < diasSemana; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        scanner.close();

        // Cálculo da temperatura média da semana
        double somaTemperaturas = 0;
        for (int i = 0; i < diasSemana; i++) {
            somaTemperaturas += temperaturas[i];
        }

        double temperaturaMedia = somaTemperaturas / diasSemana;

        System.out.println("A temperatura média da semana foi: " + temperaturaMedia + " graus Celsius.");
    }
}