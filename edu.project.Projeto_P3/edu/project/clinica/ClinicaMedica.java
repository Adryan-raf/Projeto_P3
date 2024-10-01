package edu.project.clinica;

import entidades.*;


import java.util.Scanner;

public class ClinicaMedica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando Paciente e Medico
        Paciente paciente = new Paciente("João", "123456789", "joao@gmail.com", "senha123", "999999999", "Hipertensão", "Unimed");
        Medico medico = new Medico("Dra. Silva", "987654321", "dra.silva@gmail.com", "senha456", "888888888", "Cardiologista", "9h - 17h");

        int opcao;
        do {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1. Marcar Consulta");
            System.out.println("2. Ações sobre Consulta (Submenu)");
            System.out.println("3. Exibir Prontuário do Paciente");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n' deixado pelo nextInt()

            switch (opcao) {
                case 1:
                    // Marcar consulta
                    System.out.print("Informe a data da consulta (formato: AAAA-MM-DD): ");
                    String data = scanner.nextLine();

                    if (medico.disponibilidade(data)) {
                        Consulta novaConsulta = new Consulta(paciente, medico, data);
                        medico.adicionarConsultaAgenda(novaConsulta); // Adiciona à agenda do médico
                        paciente.adicionarConsultaProntuario(novaConsulta); // Adiciona ao prontuário do paciente
                        System.out.println("Consulta marcada com sucesso!");
                    } else {
                        System.out.println("O médico já tem uma consulta nesse horário.");
                    }
                    break;

                case 2:
                    // Submenu de Ações sobre a Consulta
                    if (paciente.getProntuario().isEmpty()) {
                        System.out.println("Nenhuma consulta para realizar ações.");
                    } else {
                        Consulta consultaAtual = paciente.getProntuario().getLast(); // Última consulta realizada
                        exibirSubmenuConsulta(scanner, consultaAtual);
                    }
                    break;

                case 3:
                    // Exibir prontuário do paciente
                    paciente.exibirProntuario();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

    // Submenu de Ações sobre a Consulta
    public static void exibirSubmenuConsulta(Scanner scanner, Consulta consulta) {
        int opcao;
        do {
            System.out.println("\nAÇÕES SOBRE A CONSULTA:");
            System.out.println("1. Exibir Detalhes da Consulta");
            System.out.println("2. Cancelar Consulta");
            System.out.println("3. Concluir Consulta");
            System.out.println("4. Voltar ao Menu Principal");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n' deixado pelo nextInt()

            switch (opcao) {
                case 1:
                    consulta.StatusConsulta();
                    break;

                case 2:
                    consulta.cancelarConsulta();
                    break;

                case 3:
                    System.out.print("Digite o resultado da consulta: ");
                    String resultado = scanner.nextLine();
                    consulta.concluirConsulta(resultado);
                    break;

                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}
