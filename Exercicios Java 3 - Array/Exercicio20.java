import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o número de pessoas e dias
        int numPeople = 3; // Defina o número de pessoas aqui
        int numDays = 7;

        // Criando uma matriz para armazenar as calorias consumidas
        int[][] calories = new int[numPeople][numDays];

        // Solicitando os dados a Oppenheimer
        for (int person = 0; person < numPeople; person++) {
            for (int day = 0; day < numDays; day++) {
                System.out.print("Informe a quantidade de calorias consumidas pela pessoa " + (person + 1) + " no dia " + (day + 1) + ": ");
                calories[person][day] = scanner.nextInt();
            }
        }

        // Encontrando a maior quantidade de calorias em um único dia
        int maxCalories = 0;
        int maxCaloriesPerson = -1;
        int maxCaloriesDay = -1;

        for (int person = 0; person < numPeople; person++) {
            for (int day = 0; day < numDays; day++) {
                if (calories[person][day] > maxCalories) {
                    maxCalories = calories[person][day];
                    maxCaloriesPerson = person;
                    maxCaloriesDay = day;
                }
            }
        }

        // Exibindo os resultados
        System.out.println("\nA pessoa que consumiu a maior quantidade de calorias em um único dia é a pessoa " + (maxCaloriesPerson + 1) +", no dia " + (maxCaloriesDay + 1) + ", com um total de " + maxCalories + " calorias.");
        
        scanner.close();
    }
}