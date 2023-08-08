import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declaração e inicialização de um ArrayList de Strings
        List<String> fruits = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Acessando elementos do ArrayList
        System.out.println("Primeiro elemento: " + fruits.get(0));
        System.out.println("Tamanho do ArrayList: " + fruits.size());

        // Percorrendo e imprimindo todos os elementos do ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}