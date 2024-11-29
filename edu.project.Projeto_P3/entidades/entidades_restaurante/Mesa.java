package entidades.entidades_restaurante;

public class Mesa {
    private int numero;
    private boolean disponibilidade;
    private Pedido pedido;

    public Mesa(int numero) {
        this.numero = numero;
        this.disponibilidade = true;
    }

    public boolean estaOcupada() {
        return !disponibilidade;
    }

    public void ocuparMesa() {
        if (disponibilidade) {
            disponibilidade = false;
            pedido = new Pedido(numero);
            System.out.println("Mesa " + numero + " ocupada.");
        } else {
            System.out.println("Mesa já está ocupada.");
        }
    }

    public void liberarMesa() {
        disponibilidade = true;
        pedido = null;
    }

    public void adicionarItemAoPedido(itensDoPedido item) {
        if (pedido != null) {
            pedido.adicionarItem(item);
        }
    }

    public void removerPedido() {
        if (pedido != null) {
            pedido.limparPedido();
        }
    }

    public double fecharConta() {
        double total = pedido.calcularTotal();
        liberarMesa();
        return total;
    }
}
