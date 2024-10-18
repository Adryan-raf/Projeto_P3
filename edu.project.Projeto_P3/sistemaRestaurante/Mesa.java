import java.util.ArrayList;

public class Mesa{
    private int numero;
    private boolean disponibilidade;
    private Pedido pedido;
    
    public Mesa(int numero){
        this.numero = numero;
        this.disponibilidade = true;
    }
    
    
    public boolean estaOcupada(){
        return !disponibilidade;
    }
    
    public void ocuparMesa(){
        if(disponibilidade == true){
            this.disponibilidade = false;
            this.pedido = new Pedido(numero);
            System.out.println("Mesa " + numero + " acaba de ser ocupada.\n");
        } else {
            System.out.println("Erro: Mesa " + numero + " já está ocupada.\n");
        }
    }
    
    public void liberarMesa(){
        if(disponibilidade == false){
            this.disponibilidade = true;
            this.pedido = null;
            System.out.println("Mesa " + numero + " acaba de ser liberada.\n");
        } else{
            System.out.println("Erro: Mesa " + numero + " ja está desocupada.\n");
        }
    }
    
     public void adicionarItemAoPedido(itensDoPedido item) {
        if(disponibilidade == false && pedido != null) {
            pedido.adicionarItem(item);
            System.out.println("Item adicionado: " + item);
        } else {
            System.out.println("Erro: a mesa está livre ou não há pedido ativo!\n");
        }
    }
    
    public void removerPedido(int numero){
        if(pedido != null){
            pedido = null;
        } else{
            System.out.println("ERRO: Não há pedidos para remover.\n");
        }
    }
    
    public void removerItemDoPedido(int index) {
        if (pedido != null) {
            if (index >= 0 && index < pedido.getItens().size()) {
                pedido.removerItem(index);
                System.out.println("Item removido com sucesso.");
            } else {
                System.out.println("Erro: Índice inválido.");
            }
        } else {
            System.out.println("Erro: Não há pedido ativo.");
        }
    }   
    
    public Pedido getPedido(){
        return pedido;
    }

}