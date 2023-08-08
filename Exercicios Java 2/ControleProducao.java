import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleProducao {
// Variáveis de instância privadas (encapsulamento)
private String nomeProduto; // Nome do produto
private int codigoIdentificacao; // Código de identificação do produto
private int quantidadeMeta; // Quantidade que deve ser produzida do produto
private int quantidadeProduzida; // Quantidade já produzida do produto
private LocalDate prazoEntrega; // Data de prazo de entrega do produto

// Método para cadastrar novo produto
public void cadastrarProduto() {
Scanner scanner = new Scanner(System.in);

// Solicita informações do produto ao usuário
System.out.println("Digite o nome do produto:");
nomeProduto = scanner.nextLine();

System.out.println("Digite o código de identificação:");
codigoIdentificacao = scanner.nextInt();

System.out.println("Digite a quantidade a ser produzida:");
quantidadeMeta = scanner.nextInt();

System.out.println("Digite a data de prazo de entrega (formato: dd/MM/yyyy):");
String dataPrazoEntrega = scanner.next();
prazoEntrega = LocalDate.parse(dataPrazoEntrega, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

// Inicializa a quantidade produzida como 0
quantidadeProduzida = 0;
}

// Método para exibir o status de produção do produto
public void exibirStatusProducao() {
System.out.println("Status de Produção do Produto " + nomeProduto + ":");
System.out.println("Código de Identificação: " + codigoIdentificacao);
System.out.println("Quantidade Meta: " + quantidadeMeta);
System.out.println("Quantidade Produzida: " + quantidadeProduzida);
System.out.println("Quantidade Restante: " + (quantidadeMeta - quantidadeProduzida));
System.out.println("Prazo de Entrega: " + prazoEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
}

// Método para verificar o prazo de entrega do produto
public void verificarPrazoEntrega() {
LocalDate dataAtual = LocalDate.now();

// Verifica se a data atual é posterior à data de prazo de entrega
if (dataAtual.isAfter(prazoEntrega)) {
System.out.println("O prazo de entrega para o produto " + nomeProduto + " foi atingido.");
} else {
System.out.println("O prazo de entrega para o produto " + nomeProduto + " ainda não foi atingido.");
}
}

// Método para realizar a contagem regressiva para o prazo de entrega
public void contagemRegressivaPrazoEntrega() {
LocalDate dataAtual = LocalDate.now();
int diasRestantes = (int) dataAtual.until(prazoEntrega).getDays();

System.out.println("Contagem regressiva para o prazo de entrega do produto " + nomeProduto + ":");
// Loop para exibir a contagem regressiva
for (int i = diasRestantes; i >= 0; i--) {
System.out.println("Faltam " + i + " dias para o prazo de entrega.");
}
System.out.println("Produto " + nomeProduto + " pronto para entrega!");
}

public static void main(String[] args) {
ControleProducao sistema = new ControleProducao();
Scanner scanner = new Scanner(System.in);

int opcao;

do {
// Exibindo o menu de opções ao usuário
System.out.println("\n====== MENU ======");
System.out.println("1. Cadastrar novo produto");
System.out.println("2. Exibir status de produção de um produto");
System.out.println("3. Verificar prazo de entrega de um produto");
System.out.println("4. Contagem regressiva para o prazo de entrega de um produto");
System.out.println("0. Sair");
System.out.println("==================");
System.out.println("Digite a opção desejada:");

opcao = scanner.nextInt();

switch (opcao) {
case 1:
sistema.cadastrarProduto();
break;
case 2:
sistema.exibirStatusProducao();
break;
case 3:
sistema.verificarPrazoEntrega();
break;
case 4:
sistema.contagemRegressivaPrazoEntrega();
break;
case 0:
System.out.println("Saindo do sistema...");
break;
default:
System.out.println("Opção inválida. Tente novamente.");
}
} while (opcao != 0);

scanner.close();
}
}