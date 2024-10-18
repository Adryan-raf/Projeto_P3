package entidades.entidades_restaurante;


import java.util.ArrayList;

public class Pedido{
    private int numeroDaMesa;
    private ArrayList<itensDoPedido> itens;
    
    public Pedido(int numeroDaMesa){
        this.numeroDaMesa = numeroDaMesa;
        this.itens = new ArrayList<>();
    }
    
    public int getNumeroDaMesa(){
        return numeroDaMesa; 
    }
    
    public void adicionarItem(itensDoPedido item){
        itens.add(item);
    }
    
    public double calcularTotal(){
        double totalidade = 0;
        for(itensDoPedido item : itens){
            totalidade += item.calcularTotal();
        }
        return totalidade;
    }
    
    public void verPedido(){
        if (estaVazio() == true) {
            System.out.println("O pedido da mesa " + numeroDaMesa + " está vazio.\n");
        } else {
            System.out.println("Pedido da mesa " + numeroDaMesa + ":");
            for (itensDoPedido item : itens) {
                System.out.println(item);
            }
        }
    }
    
    public void removerItem(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
            System.out.println("Item removido da mesa " + numeroDaMesa + ".");
        } else {
            System.out.println("Erro: Índice inválido para remoção.");
        }
    }
    
    public ArrayList<itensDoPedido> getItens() {
            return itens;
    }
    
    public boolean estaVazio(){
        return itens.isEmpty();
    }
    
}