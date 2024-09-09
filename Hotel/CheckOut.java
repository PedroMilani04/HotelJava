package Hotel;

import Hotel.ServicoAdicional;

public class CheckOut {
    private Cliente cliente;
    private Quarto quarto;
    private PagamentoReserva pagamento;
    private ServicoAdicional servicosAdicionais;

    public CheckOut(Cliente cliente, Quarto quarto, PagamentoReserva pagamento, ServicoAdicional servicosAdicionais) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.pagamento = pagamento;
        this.servicosAdicionais = servicosAdicionais;
    }

    // Calcula o total que o cliente deve pagar (quarto + serviços adicionais)
    public double calcularTotal() {
        return quarto.getPreco() + servicosAdicionais.getValorTotal();
    }

    // Processa o checkout do cliente
    public void realizarCheckout() {
        double totalAPagar = calcularTotal();

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Número do Quarto: " + quarto.getNumeroDoQuarto());
        System.out.println("Valor do Quarto: R$ " + quarto.getPreco());
        System.out.println("Total Serviços Adicionais: R$ " + servicosAdicionais.getValorTotal());
        System.out.println("Total a Pagar: R$ " + totalAPagar);

        // Marca o pagamento como "pago" e libera o quarto
        pagamento.setStatus("pago");
        System.out.println("Pagamento efetuado. Status: " + pagamento.getStatus());

        quarto.setDisponibilidade(true);
        System.out.println("Quarto " + quarto.getNumeroDoQuarto() + " liberado.");
    }

    // Getters e setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public PagamentoReserva getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoReserva pagamento) {
        this.pagamento = pagamento;
    }

    public ServicoAdicional getServicosAdicionais() {
        return servicosAdicionais;
    }

    public void setServicosAdicionais(ServicoAdicional servicosAdicionais) {
        this.servicosAdicionais = servicosAdicionais;
    }
}