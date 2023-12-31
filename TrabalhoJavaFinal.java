import java.util.Random;
import java.util.Scanner;

public class TrabalhoJavaFinal {

    private static final String[] PALAVRAS = { "JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP" };
    private static final int MAX_VIDAS = 5;
    private static boolean jogoIniciado = false;
    private static int opcao = 0;
    static int[] contador = new int[3];
    static String[] nome = new String[3];

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        Scanner scanner = new Scanner(System.in);
        // Criando Menu com Opções de Escolhas
        while (opcao != 3) {

            System.out.println("\n----------Menu de Opções---------");
            System.out.println("|-------------------------------|");
            System.out.println("| Opção 1 - Iniciar Novo Jogo   |");
            System.out.println("| Opção 2 - Verificar Pontuações|");
            System.out.println("| Opção 3 - Sair Do Jogo        |");
            System.out.println("|-------------------------------|");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            // Escolhendo Opção

            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    // System.out.println("\nOpção Verificar Pontuações");
                    Pontuacao();
                    jogoIniciado = true;
                    break;
                default:
                    System.out.println("\nSaindo Do Jogo.");
                    break;
            }

        }

        scanner.close();
    }

    // Declarando Váriaveis do Jogo da Força
    private static void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int indexPalavra = random.nextInt(PALAVRAS.length);
        String palavraSelecionada = PALAVRAS[indexPalavra].toUpperCase();
        StringBuilder palavraSecreta = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            System.out.println("Digite seu nome:");
            nome[i] = scanner.nextLine();
        }

        for (int i = 0; i < palavraSelecionada.length(); i++) {
            palavraSecreta.append("_");
        }

        int vidas = MAX_VIDAS;

        // Sistema do Jogo da Força
        System.out.println("\nIniciando Jogo da Força");
        while (vidas > 0 && palavraSecreta.toString().contains("_")) {
            System.out.println("\nPalavra: " + palavraSecreta);
            System.out.println("Vidas restantes: " + vidas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            // Verificar se a letra está na palavra
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraSelecionada.length(); i++) {
                if (palavraSelecionada.charAt(i) == letra) {
                    palavraSecreta.setCharAt(i, letra);
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                vidas--;
                System.out.println("Letra não encontrada. Você perdeu uma vida.");
            }
        }

        if (vidas == 0) {
            System.out.println("Fim do Jogo! Você perdeu. A palavra era: " + palavraSelecionada);
        } else {
            System.out.println("Parabéns! Você venceu. A palavra era: " + palavraSelecionada);
            for (int i = 0; i < nome.length; i++) {
                contador[i] = contador[i] + 1;
            }
            for (int i = 0; i < 1; i++) {
                System.out.printf("\nA pontuação do jogador %s é: %d.\n", nome[i], contador[i]);
            }
        }
    }

    private static void Pontuacao() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < nome.length; i++) {
            if (nome[0] == null || nome[0] == "") {
                System.out.println("\nNão há pontuações para serem exibidas.");
                Menu();
            }
            if (nome[1] == null || nome[1] == "" || nome[2] == null || nome[2] == "") {
                System.out.printf("\nPontuação do jogador %s: %d.\n", nome[i], contador[i]);
                System.out.println("Não há pontuação do jogador 2.");
                System.out.println("Não há pontuação do jogador 3.");
                Menu();
            } else {
                System.out.printf("\nPontuação do jogador %s: %d.", nome[i], contador[i]);
            }
        }
    }
}