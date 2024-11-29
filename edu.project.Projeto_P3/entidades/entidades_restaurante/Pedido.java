package entidades.entidades_restaurante;

import java.util.ArrayList;

public class Pedido {
    private int numeroMesa;
    private ArrayList<itensDoPedido> itens;

    public Pedido(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(itensDoPedido item) {
        itens.add(item);
    }

    public void limparPedido() {
        itens.clear();
        System.out.println("Pedido limpo.");
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(itensDoPedido::calcularTotal).sum();
    }
}
