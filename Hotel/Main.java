package Hotel;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static final String outputMode = "console";
    static final OutputInterface output = OutputFactory.getTipoOutput(outputMode);

    static String nome;
    static String cpf;
    static int idade;
    static int telefone;
    static boolean dispo;
    static String cliente;
    static int numero;
    static int andar;
    static int tipo;
    static boolean disponibilidade;
    static String id;
    

    public static void boasVindas() {
        final String nomeHotel;

        output.display("Nome do hotel: ");
        nomeHotel = input.nextLine();

        Controlador controlador = new Controlador(nomeHotel);

        output.display("Bem-vindo ao Sistema de Gerenciamento do Hotel " + controlador.getNomeHotel() + "!\n");
    }

    public static void menuAdicionar(Controlador controlador) {
        int menu = -1;

        Cliente cliente = null;
        Quarto quarto = null;
        Reserva reserva = null;
        PagamentoReserva pagamento = null;
        Servico servico = null;
        ServicoAdicional servicoAdicional = null;

        switch(menu) {
            output.display("O que deseja adicionar?");
            output.display("1 - Cliente");
            output.display("2 - Quarto");
            output.display("3 - Reserva");
            output.display("4 - Pagamento");
            output.display("5 - Serviço");
            output.display("6 - Serviço Adicional");
            output.display("0 - Voltar");
            menu = input.nextInt();

            switch(menu) {
                case 1:
                    output.display("Nome do cliente: ");
                    nome = input.nextLine();
                    output.display("CPF do cliente: ");
                    cpf = input.nextLine();
                    output.display("Idade do cliente: ");
                    idade = input.nextInt();
                    output.display("Telefone do cliente: ");
                    telefone = input.nextInt();

                    cliente = new Cliente(nome, cpf, idade, telefone);

                    controlador.adicionarCliente(cliente);
                    break;
                case 2:
                    output.display("Número do quarto: ");
                    numero = input.nextInt();

                    for(Quarto q : controlador.getQuartos()) {
                        if(controlador.getQuarto(numero).getNumeroDoQuarto() == numero) {
                            output.display("Quarto já cadastrado! Informe outro número: ");
                            numero = input.nextInt();
                        }   
                    }
                    
                    output.display("Nome do cliente: ");
                    nome = input.nextLine();
                    disponibilidade = controlador.getQuarto(numero).getDisponibilidade();
                    output.display("Andar do quarto: ");
                    andar = input.nextInt();

                    tipo = -1;
                    while(tipo < 0 || tipo > 3) {
                        output.display("Tipo do quarto: ");
                        output.display("0 - Empresarial");
                        output.display("1 - Casal");
                        output.display("2 - Família");
                        output.display("3 - Presidencial");
                        tipo = input.nextInt();
                    }
                    tipo = input.nextInt();

                    quarto = new Quarto(disponibilidade, nome, numero, andar, tipo);

                    controlador.adicionarQuarto(quarto);
                    break;
                case 3:
                    
                    adicionarReserva();
                    break;
                case 4:
                    adicionarPagamento();
                    break;
                case 5:
                    adicionarServico();
                    break;
                case 6:
                    adicionarServicoAdicional();
                    break;
                case 0:
                    output.display("Saindo do sistema...");
                    break;
                default:
                    output.display("Opção inválida!\n");
                    break;
            }
        }
    }

    public static void menuRemover(Controlador controlador) {
        int menu = -1;
        int opcao = -1;

        Cliente cliente = null;
        Quarto quarto = null;
        Reserva reserva = null;
        PagamentoReserva pagamento = null;
        Servico servico = null;
        ServicoAdicional servicoAdicional = null;

        while(menu != 0) {
            output.display("O que deseja remover?");
            output.display("1 - Cliente");
            output.display("2 - Quarto");
            output.display("3 - Reserva");
            output.display("4 - Pagamento");
            output.display("5 - Serviço");
            output.display("6 - Serviço Adicional");
            output.display("0 - Voltar");
            menu = input.nextInt();

            switch(menu) {
                case 1:
                    while(opcao != 0 && opcao != 1) {
                        output.display("Deseja remover todos os clientes? (1 - Sim, 0 - Não)");
                        opcao = input.nextInt();

                        if(opcao == 1) {
                            controlador.removerClientes();
                        } else if(opcao == 0) {
                            output.display("Digite o CPF do cliente que deseja remover: ");
                            cpf = input.nextLine();
                            cliente = controlador.getCliente(cpf);
                            controlador.removerCliente(cliente);
                        } else {
                            output.display("Opção inválida!\n");
                        }
                    }
                    break;
                case 2:
                    while(opcao != 0 && opcao != 1) {
                        output.display("Deseja remover todos os quartos? (1 - Sim, 0 - Não)");
                        opcao = input.nextInt();

                        if(opcao == 1) {
                            controlador.removerQuartos();
                        } else if(opcao == 0) {
                            output.display("Digite o número do quarto que deseja remover: ");
                            numero = input.nextInt();
                            quarto = controlador.getQuarto(numero);
                            controlador.removerQuarto(quarto);
                        } else {
                            output.display("Opção inválida!\n");
                        }
                    }
                    break;
                case 3:
                    while(opcao != 0 && opcao != 1) {
                        output.display("Deseja remover todos as reservas? (1 - Sim, 0 - Não)");
                        opcao = input.nextInt();

                        if(opcao == 1) {
                            controlador.removerReservas();
                        } else if(opcao == 0) {
                            output.display("Digite o número do quarto da reserva que deseja remover: ");
                            numero = input.nextInt();

                            for(Reserva r : controlador.getReservas()) {
                                if(numero == r.getQuarto().getNumeroDoQuarto()) {
                                    reserva = controlador.getReserva(controlador.getReservas(), controlador.getQuarto(numero));
                                    controlador.removerReserva(reserva);
                                }
                            }
                        } else {
                            output.display("Opção inválida!\n");
                        }
                    }
                    break;
                case 4:
                    while(opcao != 0 && opcao != 1) {
                        output.display("Deseja remover todos os pagamentos? (1 - Sim, 0 - Não)");
                        opcao = input.nextInt();

                        if(opcao == 1) {
                            controlador.removerPagamentos();
                        } else if(opcao == 0) {
                            output.display("Digite o número do ID do pagamento da reserva que deseja remover: ");
                            id = input.nextLine();

                            for(PagamentoReserva p : controlador.getPagamentos()) {
                                if(id.equals(p.getIdPagamento())) {
                                    pagamento = p;
                                    controlador.removerPagamento(pagamento);
                                }
                            }
                        } else {
                            output.display("Opção inválida!\n");
                        }
                    }
                    break;
                case 5:
                    removerServico();
                    break;
                case 6:
                    removerServicoAdicional();
                    break;
                case 0:
                    output.display("Saindo do sistema...");
                    break;
                default:
                    output.display("Opção inválida!\n");
                    break;
            }
        }
    }

    public static void menuExibir(Controlador controlador) {
        int menu = -1;

        while(menu != 0) {
            output.display("O que deseja exibir?");
            output.display("1 - Clientes");
            output.display("2 - Quartos");
            output.display("3 - Reservas");
            output.display("4 - Pagamentos");
            output.display("5 - Serviços");
            output.display("6 - Serviços Adicionais");
            output.display("0 - Voltar");
            menu = input.nextInt();

            switch(menu) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                        
                    break;
                case 5:
                        
                    break;
                case 6:
                            
                    break;
                case 0:
                    output.display("Saindo do sistema...");
                    break;
                default:
                    output.display("Opção inválida!\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        
        int menu;

        boasVindas();
        
        while(menu != 0) {
            output.display("O que deseja fazer?");
            output.display("1 - Adicionar");
            output.display("2 - Remover");
            output.display("3 - Exibir");
            output.display("0 - Sair do sistema");
            menu = input.nextInt();

            switch(menu) {
                    menuAdicionar(controlador);
                    break;
                case 2:
                    menuRemover(controlador);
                    break;
                case 3:
                    menuExibir(controlador);
                    break;
                case 0:
                    output.display("Saindo do sistema...");
                    break;
                default:
                    output.display("Opção inválida!\n");
                    break;
            }
        }
        

        //Testes
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "12345678901", 30, 99887766);
        Cliente cliente2 = new Cliente("Maria Oliveira", "98765432101", 25, 99112233);

        // Criando quartos
        Quarto quarto1 = new Quarto(true, "", 101, 1, 0); // Empresarial
        Quarto quarto2 = new Quarto(true, "", 102, 1, 1); // Casal

        // Usando a fábrica para criar reservas
        Reserva reserva1 = ReservaFactory.criarReserva(quarto1, cliente1, "2024-10-20");
        Reserva reserva2 = ReservaFactory.criarReserva(quarto2, cliente2, "2024-10-21");

        // Exibindo informações das reservas criadas
        System.out.println("Reserva 1: Quarto " + reserva1.getQuarto().getNumeroDoQuarto() + " para " + reserva1.getCliente().getNome());
        System.out.println("Reserva 2: Quarto " + reserva2.getQuarto().getNumeroDoQuarto() + " para " + reserva2.getCliente().getNome());

        // Exemplo de pagamento online
        PagamentoReserva pagamento1 = new PagamentoReservaOnline("001", reserva1.getValorTotal(), reserva1);
        pagamento1.pagarReserva("Cartão de Crédito", "Desktop", "Chrome");
        System.out.println("Pagamento 1: " + pagamento1.getStatus() + " via " + pagamento1.getMetodoPagamento());

        // Exemplo de pagamento presencial
        PagamentoReserva pagamento2 = new PagamentoReservaPresencial("002", reserva2.getValorTotal(), reserva2);
        pagamento2.pagarReserva("Dinheiro", "Ana Recepcionista", "Unidade Central");
        System.out.println("Pagamento 2: " + pagamento2.getStatus() + " via " + pagamento2.getMetodoPagamento());

        // Exemplo de uso da Fachada para simplificar serviços adicionais
        HotelFacade fachada = new HotelFacade(cliente1);
        fachada.adicionarServico("spa");
        fachada.adicionarServico("almoco");
        fachada.exibirServicosAdicionais();
    }
}
