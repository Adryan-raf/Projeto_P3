package entidades.entidades_restaurante;

public class itensDoPedido {
    private String nome;
    private double preco;
    private int quantidade;

    public itensDoPedido(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + nome + " (R$ " + preco + " cada) - Total: R$ " + calcularTotal();
    }
}
