package Hotel;

public class Main {
    public static void main(String[] args) {
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
        PagamentoReserva pagamento1 = new PagamentoReservaOnline("001", reserva1.getValorTotal());
        pagamento1.pagarReserva("Cartão de Crédito", "Desktop", "Chrome");
        System.out.println("Pagamento 1: " + pagamento1.getStatus() + " via " + pagamento1.getMetodoPagamento());

        // Exemplo de pagamento presencial
        PagamentoReserva pagamento2 = new PagamentoReservaPresencial("002", reserva2.getValorTotal());
        pagamento2.pagarReserva("Dinheiro", "Ana Recepcionista", "Unidade Central");
        System.out.println("Pagamento 2: " + pagamento2.getStatus() + " via " + pagamento2.getMetodoPagamento());

        // Exemplo de uso da Fachada para simplificar serviços adicionais
        HotelFacade fachada = new HotelFacade(cliente1);
        fachada.adicionarServico("spa");
        fachada.adicionarServico("almoco");
        fachada.exibirServicosAdicionais();
    }
}
