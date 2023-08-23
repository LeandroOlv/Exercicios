import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoComplexo {

    public static void main(String[] args) {
        String[] listaDePalavras = {"JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = listaDePalavras[random.nextInt(listaDePalavras.length)];
        int vidas = 6;
        char[] letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        boolean jogoTerminado = false;
        while (!jogoTerminado) {
            System.out.print("Palavra: ");
            for (char c : letrasDescobertas) {
                System.out.print(c + " ");
            }
            System.out.println("\nVidas restantes: " + vidas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);
            
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    letrasDescobertas[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                vidas--;
                System.out.println("Letra não encontrada. Você perdeu uma vida.");
            }

            boolean todasLetrasDescobertas = true;
            for (char c : letrasDescobertas) {
                if (c == '_') {
                    todasLetrasDescobertas = false;
                    break;
                }
            }

            if (todasLetrasDescobertas) {
                System.out.println("Parabéns! Você acertou a palavra secreta: " + palavraSecreta);
                jogoTerminado = true;
            }

            if (vidas == 0) {
                System.out.println("Você esgotou suas vidas. A palavra secreta era: " + palavraSecreta);
                jogoTerminado = true;
            }
        }

        System.out.print("Deseja jogar novamente? (S/N): ");
        char resposta = scanner.next().toUpperCase().charAt(0);
        if (resposta == 'S') {
            main(null); // Reiniciar o jogo
        } else {
            System.out.println("Obrigado por jogar!");
        }

        scanner.close();
    }
}