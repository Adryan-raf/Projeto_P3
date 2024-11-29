package entidades.entidades_restaurante;

public class GerenciadorDeVendas {
    private double totalVendas;

    public void adicionarVenda(double valor) {
        totalVendas += valor;
    }

    public void gerarRelatorio() {
        System.out.println("Total de vendas: R$ " + totalVendas);
    }
}
