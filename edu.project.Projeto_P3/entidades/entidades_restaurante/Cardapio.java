package entidades.entidades_restaurante;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<itensDoPedido> itens;

    public Cardapio() {
        itens = new ArrayList<>();
        itens.add(new itensDoPedido("Água", 3.00, 0));
        itens.add(new itensDoPedido("Refrigerante", 5.00, 0));
        itens.add(new itensDoPedido("Suco", 6.00, 0));
        itens.add(new itensDoPedido("Calabresa", 37.00, 0));
        itens.add(new itensDoPedido("Mussarela", 34.00, 0));
        itens.add(new itensDoPedido("Quatro Queijos", 35.00, 0));
        itens.add(new itensDoPedido("Vegetariana", 33.00, 0));
    }

    public void mostrarCardapio() {
        System.out.println("\nCardápio:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ". " + itens.get(i).getNome() + " - R$ " + itens.get(i).getPreco());
        }
    }

    public itensDoPedido criarItemDoPedido(int numero, int quantidade) {
        if (numero >= 1 && numero <= itens.size()) {
            itensDoPedido itemBase = itens.get(numero - 1);
            return new itensDoPedido(itemBase.getNome(), itemBase.getPreco(), quantidade);
        }
        System.out.println("Item inválido.");
        return null;
    }
}
