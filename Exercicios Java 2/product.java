import java.time.LocalDate;

public class product {
    private String nome;
    private int codigoIdentificacao;
    private int quantidadeMeta;
    private int quantidadeProduzida;
    private LocalDate prazoEntrega;

    public product(String nome, int codigoIdentificacao, int quantidadeMeta, LocalDate prazoEntrega) {
        this.nome = nome;
        this.codigoIdentificacao = codigoIdentificacao;
        this.quantidadeMeta = quantidadeMeta;
        this.quantidadeProduzida = 0; // Inicializa a quantidade produzida como zero
        this.prazoEntrega = prazoEntrega;
    }

    // Getters e Setters (modificadores de acesso public)

    public String getNome() {
        return nome;
    }

    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public int getQuantidadeMeta() {
        return quantidadeMeta;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    // Método para verificar se o prazo de entrega foi cumprido
    public boolean isPrazoEntregaCumprido() {
        return LocalDate.now().isAfter(prazoEntrega) || LocalDate.now().isEqual(prazoEntrega);
    }

    // Método para calcular a quantidade restante a ser produzida para atingir a meta
    public int calcularQuantidadeRestante() {
        return quantidadeMeta - quantidadeProduzida;
    }
}
