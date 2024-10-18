package edu.project.main;

import java.util.Scanner;
import java.util.ArrayList;
import entidades.entidades_restaurante.*;

public class SistemaRestaurante{
    
    private static ArrayList<Mesa> mesas = new ArrayList<>(10);
    private static double totalVendas = 0.0;
    
    static{
        for(int i = 0; i < 10; i ++){
            mesas.add(new Mesa(i + 1));
        }
    }
    
    private static void mostrarCardapio(){
        System.out.println("\nCardápio do Restaurante Shaolin:");
        System.out.println("\nBebidas\n");
        System.out.println("1. Água - R$ 3.00");
        System.out.println("2. Refrigerante - R$ 5.00");
        System.out.println("3. Suco - R$ 6.00");
        System.out.println("\nPizzas\n");
        System.out.println("4. Calabresa - R$ 37.00");
        System.out.println("5. Mussarela - R$ 34.00");
        System.out.println("6. Quatro Queijos - R$35.00");
        System.out.println("7. Vegetariana - R$33.00\n");
    }
    
    private static String getPedido(int indice){
        String[] itensCardapio = {"Água", "Refrigerante", "Suco","Calabresa", "Mussarela", "Quatro Queijos", "Vegetariana"};
        return itensCardapio[indice];
    }
    
    private static double getValor(int indice){
        double[] valores = {3.00, 5.00, 6.00, 37.00, 34.00, 35.00, 33.00};
        return valores[indice];
    }
   
    
    public static void escolherUmaMesa(Scanner scanner){
        System.out.println("Selecione o número de uma mesa (1 a 10):\n");
        int numeroDaMesa = scanner.nextInt();
        if(numeroDaMesa >= 1 && numeroDaMesa <= mesas.size()){
            Mesa mesa = mesas.get(numeroDaMesa - 1);
            mesa.ocuparMesa();
        } else{
            System.out.println("ERRO: Mesa não encontrada.\n\n");    
        }
    }
    
    public static void fazerPedido(Scanner scanner){
        System.out.println("Escolha uma mesa ocupada para fazer o pedido.\n");
        int numeroDaMesa = scanner.nextInt();
        if(numeroDaMesa >= 1 && numeroDaMesa <= mesas.size()){
            Mesa mesa = mesas.get(numeroDaMesa - 1);
            if(mesa.estaOcupada() == true){
                mostrarCardapio();
                System.out.println("Faça o seu pedido:\n");
                int numeroDoPedido = scanner.nextInt();
                if(numeroDoPedido >= 1 && numeroDoPedido < 8){
                    System.out.println("Digite uma quantidade: \n");
                    int quantidade = scanner.nextInt();
                    String nomeDoPrato = getPedido(numeroDoPedido - 1);
                    double valor = getValor(numeroDoPedido - 1);
                    itensDoPedido item = new itensDoPedido(nomeDoPrato, valor, quantidade);
                    mesa.adicionarItemAoPedido(item);
                } else{
                    System.out.println("ERRO: Opção Inválida.\n");
                }
            } else{
                System.out.println("ERRO: Mesa está disponível.\n");
            }
        } else{
            System.out.println("ERRO: Mesa inválida.\n");
        }
    }
    
    public static void removerPedido(Scanner scanner) {
        System.out.println("Escolha uma mesa para remover um item do pedido:\n");
        int numeroDaMesa = scanner.nextInt();
    
        if (numeroDaMesa >= 1 && numeroDaMesa <= mesas.size()) {
            Mesa mesa = mesas.get(numeroDaMesa - 1);
            if (mesa.estaOcupada()) {
                Pedido pedido = mesa.getPedido();
                if (pedido != null && !pedido.estaVazio()) {
                    pedido.verPedido();
                    System.out.println("Digite o índice do item a ser removido (1 a " + (pedido.getItens().size()) + "): \n");
                    int indice = scanner.nextInt();
                    mesa.removerItemDoPedido(indice - 1);
                } else {
                    System.out.println("ERRO: Não há itens para remover.\n");
                }
            } else {
                System.out.println("ERRO: Mesa está disponível.\n");
            }
        } else {
            System.out.println("ERRO: Mesa inválida.");
        }
    }
    
    public static void fecharConta(){
        System.out.println("Selecione uma mesa para fechar a conta:\n");
        Scanner scanner = new Scanner(System.in);
        int numeroDaMesa = scanner.nextInt();
        
        if(numeroDaMesa >= 1 && numeroDaMesa <= mesas.size()){
            Mesa mesa = mesas.get(numeroDaMesa - 1);
            if(mesa.estaOcupada()){
                Pedido pedido = mesa.getPedido();
                if(pedido != null){
                    double total = pedido.calcularTotal();
                    System.out.println("Total da conta da mesa " + numeroDaMesa + ": R$ " + total + ".");
                    mesa.liberarMesa();
                } else{
                    System.out.println("ERRO: Não há pedidos para esta mesa.");
                }
            } else{
                System.out.println("ERRO: Mesa ainda está disponível.");
            }
        } else{
            System.out.println("ERRO: Mesa não encontrada.");
        }
    }
    
    public static void pedirRelatorio(){
        System.out.println("\nRelatório de Vendas:");
        System.out.println("Total de Vendas: R$ " + totalVendas);
        System.out.println("Pedidos por Mesa:");
        
        for(Mesa mesa : mesas){
            if(mesa.estaOcupada() && mesa.getPedido() != null){
                mesa.getPedido().verPedido();
            }
        }
    }
    
    
    


    public static void exibirOpcoes() {
    System.out.println("=======================");
    System.out.println("1. Escolher uma Mesa");
    System.out.println("2. Fazer Pedido");
    System.out.println("3. Remover Pedido");
    System.out.println("4. Fechar Conta");
    System.out.println("5. Pedir Relatório de Vendas");
    System.out.println("6. Sair");
    System.out.println("=======================");
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
    
        do {
            System.out.println("Seja bem-vindo ao Restaurante do Shaon!" + "\n" + "Escolha uma opção:");
            exibirOpcoes();
            menu = scanner.nextInt();
    
            switch (menu) {
                case 1:
                    escolherUmaMesa(scanner);
                    break;
                case 2: 
                    fazerPedido(scanner);
                    break;
                case 3:
                    removerPedido(scanner);
                    break;
                case 4:
                    fecharConta();
                    break;
                case 5:
                    pedirRelatorio();
                    break;
                    
                case 6:
                    System.out.println("Fechando sistema...\n");
                    break;
                    
                default:
                    System.out.println("Erro: Opção inválida. Tente outra opção.\n");
                    break;
            }
        } while (menu != 6);
    
        scanner.close();
    }

}
