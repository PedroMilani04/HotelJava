package com.mycompany.gtaseis;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Gtaseis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<FuncionarioHotel> funcionarios = new ArrayList<>();
        ArrayList<Quarto> quartos = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        ArrayList<ServicoAdicional> servicos = new ArrayList<>();
        ArrayList<PagamentoReserva> pagamentos = new ArrayList<>();
        LocalDate dataAtual = null;

        // Criando alguns quartos de exemplo
        for (int i = 1; i <= 5; i++) {
            quartos.add(new Quarto(true, "", i, 1, 0)); //QuartoEmpresarial
        }
        for (int i = 6; i <= 10; i++) {
            quartos.add(new Quarto(true, "", i, 2, 1)); //QuartoCasal
        }

        System.out.println("============================================");
        System.out.println(" ##  ##    ####    ######   ######   ##     ");
        System.out.println(" ##  ##   ##  ##     ##     ##       ##     ");
        System.out.println(" ##  ##   ##  ##     ##     ##       ##     ");
        System.out.println(" ######   ##  ##     ##     #####    ##     ");
        System.out.println(" ##  ##   ##  ##     ##     ##       ##     ");
        System.out.println(" ##  ##   ##  ##     ##     ##       ##     ");
        System.out.println(" ##  ##    ####      ##     ######   ###### ");
        System.out.println("============================================\n");

        int opcao;
        do {
            System.out.println("\n======================================");
            System.out.println("#           HOTEL TRIVAGO            #");
            System.out.println("# [1] CADASTRAR CLIENTE              #");
            System.out.println("# [2] LISTAR CLIENTES                #");
            System.out.println("# [3] RESERVAR QUARTO                #");
            System.out.println("# [4] ADICIONAR SERVICO              #");
            System.out.println("# [5] EXIBIR SERVICOS DE UM CLIENTE  #");
            System.out.println("# [6] FINALIZAR PAGAMENTO            #");
            System.out.println("# [7] SOBRE O PROJETO                #");
            System.out.println("# [8] CADASTRAR FUNCIONARIO          #");
            System.out.println("# [9] LISTAR FUNCIONARIOS            #");
            System.out.println("# [0] SAIR                           #");
            System.out.println("# ESCOLHA UMA OPCAO PARA PROSSEGUIR: #");
            System.out.println("======================================");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Para cadastrar confirme seu cargo:");
                    System.out.println("CPF do funcionario (11 digitos): ");
                    String verificacao = scanner.nextLine();
                    for (FuncionarioHotel funcionario : funcionarios) {
                        if (funcionario.getCpf().equals(verificacao)) {
                            System.out.print("Nome do cliente: ");
                            String nome = scanner.nextLine();
                            System.out.print("CPF do cliente (11 digitos): ");
                            String cpf = scanner.nextLine();
                            System.out.print("Telefone do cliente (apenas numeros): ");
                            String telefone = scanner.nextLine();
                            System.out.print("Idade do cliente: ");
                            int idade = scanner.nextInt();

                            try {
                                clientes.add(new Cliente(nome, cpf, idade, telefone));
                                System.out.println("Cliente cadastrado com sucesso!");
                            } catch (Exception e) {
                                System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
                            }
                            break;
                        }
                    }
                    System.out.println("Nao e funcionario!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Clientes ---");
                    for (Cliente cliente : clientes) {
                        System.out.println(" Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
                    }
                    break;

                case 3:
                    System.out.println("Para cadastrar confirme seu cargo:");
                    System.out.println("CPF do funcionario (11 digitos): ");
                    verificacao = scanner.nextLine();
                    for (FuncionarioHotel funcionario : funcionarios) {
                        if (funcionario.getCpf().equals(verificacao)) {
                            System.out.println("\n--- Reservar Quarto ---");
                            System.out.print("Digite o CPF do cliente: ");
                            String cpfReserva = scanner.nextLine();
                            Cliente clienteReserva = clientes.stream().filter(c -> c.getCpf().equals(cpfReserva)).findFirst().orElse(null);

                            if (clienteReserva == null) {
                                System.out.println("Cliente nao encontrado!");
                                break;
                            }

                            System.out.println("Quartos disponiveis:");
                            for (Quarto quarto : quartos) {
                                if (quarto.getDisponibilidade()) {
                                    System.out.println("Numero: " + quarto.getNumeroDoQuarto() + ", Tipo: " + quarto.getTipo() + ", Preco: R$" + quarto.getPreco());
                                }
                            }

                            System.out.print("Escolha o numero do quarto: ");
                            int numeroQuarto = scanner.nextInt();
                            Quarto quartoEscolhido = quartos.stream().filter(q -> q.getNumeroDoQuarto() == numeroQuarto && q.getDisponibilidade()).findFirst().orElse(null);

                            if (quartoEscolhido == null) {
                                System.out.println("Quarto invalido ou indisponivel!");
                                break;
                            }

                            System.out.print("Data de entrada (dd/MM/yyyy): ");
                            scanner.nextLine(); // Consumir o newline
                            String dataEntrada = scanner.nextLine();

                            try {
                                reservas.add(new Reserva(quartoEscolhido, clienteReserva, dataEntrada));
                                System.out.println("Reserva realizada com sucesso!");
                            } catch (Exception e) {
                                System.out.println("Erro ao realizar reserva: " + e.getMessage());
                            }
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Adicionar Servico ---");
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfServico = scanner.nextLine();
                    Cliente clienteServico = clientes.stream().filter(c -> c.getCpf().equals(cpfServico)).findFirst().orElse(null);

                    if (clienteServico == null) {
                        System.out.println("Cliente nao encontrado!");
                        break;
                    }

                    System.out.print("Digite a categoria de servico (Quarto ou Cliente)");
                    String servicoCategoria = scanner.nextLine();

                    ServicoAdicional servicoAdicional = servicos.stream().filter(s -> s.getCliente().equals(clienteServico)).findFirst().orElse(null);
                    if (servicoAdicional == null) {
                        servicoAdicional = new ServicoAdicional(clienteServico);
                        servicos.add(servicoAdicional);
                    }
                    
                    System.out.print("Digite o servico (lavanderia, spa, cafe da manha, etc.)");
                    String tipoServico = scanner.nextLine();
                    
                    if(servicoCategoria.equals("Quarto")){
                        ServicoQuarto novoServicoQuarto = new ServicoQuarto(tipoServico);
                        servicoAdicional.adicionarServico(novoServicoQuarto);
                    }else{
                        ServicoCliente novoServicoCliente = new ServicoCliente(tipoServico, cpfServico);
                        servicoAdicional.adicionarServico(novoServicoCliente);
                    }
                    System.out.println("Servico adicionado com sucesso!");
                    break;

                case 5:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfExibir = scanner.nextLine();
                    ServicoAdicional servicosCliente = servicos.stream().filter(s -> s.getCliente().getCpf().equals(cpfExibir)).findFirst().orElse(null);

                    if (servicosCliente == null) {
                        System.out.println("Nenhum servico encontrado para este cliente.");
                        break;
                    }

                    servicosCliente.exibirServicos();
                    break;

                case 6:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfPagamento = scanner.nextLine();
                    Cliente clientePagamento = clientes.stream().filter(c -> c.getCpf().equals(cpfPagamento)).findFirst().orElse(null);

                    if (clientePagamento == null) {
                        System.out.println("Cliente nao encontrado!");
                        break;
                    }

                    String idPaga = "PG" + System.currentTimeMillis();
                    Strategy strategy = new StrategyStandard();
                    CheckOut checkOut = new CheckOut(pagamentos, servicos, dataAtual, quartos);
                    strategy.gerarPagamento(checkOut, clientePagamento, idPaga);
                    System.out.println("Pagamento finalizado com sucesso!");
                    break;

                case 7:
                    System.out.println("========================================================");
                    System.out.println("#             PROJETO DA DISCIPLINA POOII              #");
                    System.out.println("#              Prof. Dr. Danillo Roberto               #");
                    System.out.println("#                                                      #");
                    System.out.println("#                 MEMBROS DO PROJETO:                  #");
                    System.out.println("#  -Daniel Amorim                                      #");
                    System.out.println("#  -Daniel Henrique                                    #");
                    System.out.println("#  -Fernando Kendi                                     #");
                    System.out.println("#  -Gustavo Ribeiro                                    #");
                    System.out.println("#  -Henrique Finco                                     #");
                    System.out.println("#  -Pedro Henrique                                     #");
                    System.out.println("#  -Nicolas dos Santos                                 #");
                    System.out.println("#                                                      #");
                    System.out.println("# 'Ser zica e facil, zica mesmo e ser zica do pantano' #");
                    System.out.println("========================================================");
                    break;

                case 8:

                    System.out.print("Nome do funcionario: ");
                    String nomef = scanner.nextLine();
                    System.out.print("Email do funcionario: ");
                    String emailf = scanner.nextLine();
                    System.out.print("CPF do funcionario (11 digitos): ");
                    String cpff = scanner.nextLine();
                    System.out.print("Cargo do funcionario: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salario do funcionario: ");
                    double salariof = scanner.nextDouble();

                    try {
                        funcionarios.add(new FuncionarioHotel(nomef, emailf, cpff, cargo, salariof));
                        System.out.println("Funcionario cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar funcionario: " + e.getMessage());
                    }
                    break;

                case 9:
                    System.out.println("\n--- Lista de Funcionarios ---");
                    for (FuncionarioHotel funcionario : funcionarios) {
                        System.out.println(" Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", Cargo: " + funcionario.getCargo());
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}