package entidades.entidades_restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeMesas {
    private ArrayList<Mesa> mesas;

    public GerenciadorDeMesas(int quantidadeMesas) {
        mesas = new ArrayList<>();
        for (int i = 1; i <= quantidadeMesas; i++) {
            mesas.add(new Mesa(i));
        }
    }

    public void escolherMesa(Scanner scanner) {
        System.out.println("Selecione o número de uma mesa (1 a " + mesas.size() + "):");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= mesas.size()) {
            mesas.get(numero - 1).ocuparMesa();
        } else {
            System.out.println("Mesa inválida.");
        }
    }

    public void fazerPedido(Scanner scanner, Cardapio cardapio) {
        System.out.println("Escolha uma mesa ocupada para fazer o pedido:");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= mesas.size()) {
            Mesa mesa = mesas.get(numero - 1);
            if (mesa.estaOcupada()) {
                cardapio.mostrarCardapio();
                System.out.println("Escolha um item do cardápio:");
                int item = scanner.nextInt();
                System.out.println("Digite a quantidade:");
                int quantidade = scanner.nextInt();
                itensDoPedido novoItem = cardapio.criarItemDoPedido(item, quantidade);
                if (novoItem != null) {
                    mesa.adicionarItemAoPedido(novoItem);
                }
            } else {
                System.out.println("Mesa não está ocupada.");
            }
        } else {
            System.out.println("Mesa inválida.");
        }
    }

    public void removerPedido(Scanner scanner) {
        System.out.println("Escolha uma mesa para remover um pedido:");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= mesas.size()) {
            Mesa mesa = mesas.get(numero - 1);
            mesa.removerPedido();
        } else {
            System.out.println("Mesa inválida.");
        }
    }

    public void fecharConta(Scanner scanner, GerenciadorDeVendas gerenciadorDeVendas) {
        System.out.println("Escolha uma mesa para fechar a conta:");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= mesas.size()) {
            Mesa mesa = mesas.get(numero - 1);
            if (mesa.estaOcupada()) {
                double total = mesa.fecharConta();
                gerenciadorDeVendas.adicionarVenda(total);
                System.out.println("Conta fechada. Total: R$ " + total);
            } else {
                System.out.println("Mesa não está ocupada.");
            }
        } else {
            System.out.println("Mesa inválida.");
        }
    }
}
