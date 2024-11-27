package Hotel;

import java.util.ArrayList;

public class Controlador {
    private String nomeHotel;
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;
    private ArrayList<Cliente> clientes;
    private ArrayList<FuncionarioHotel> funcionarios;
    private ArrayList<CheckIn> checkIns;
    private ArrayList<CheckOut> checkOuts;
    private ArrayList<Servico> servicos;
    private ArrayList<ServicoAdicional> servicosAdicionais;
    private ArrayList<PagamentoReserva> pagamentos;

  /**
  * Construtor da classe Controlador
  * @Parameter outputFactory Fábrica de saída para gerenciar o formato de exportação de dados
  * @Parameter outputMode Tipo de saída a ser utilizada
  */
    public Controlador(String nomeHotel){
        this.nomeHotel = nomeHotel;
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.checkIns = new ArrayList<>();
        this.checkOuts = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.servicosAdicionais = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<FuncionarioHotel> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<CheckIn> getCheckIns() {
        return checkIns;
    }

    public ArrayList<CheckOut> getCheckOuts() {
        return checkOuts;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public ArrayList<ServicoAdicional> getServicosAdicionais() {
        return servicosAdicionais;
    }

    public ArrayList<PagamentoReserva> getPagamentos() {
        return pagamentos;
    }

    public Quarto getQuarto(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumeroDoQuarto() == numero) {
                return quarto;
            }
        }
        return null;
    }

    public Reserva getReserva(ArrayList<Reserva> reservas, Quarto quarto) {
        if(reservas.size() > 0) {
            for(Reserva reserva : reservas) {
                if(reserva.getQuarto().getNumeroDoQuarto() == quarto.getNumeroDoQuarto()) {
                    return reserva;
                }
            }
        }
        return null;
    }

    public Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public FuncionarioHotel getFuncionario(String cpf) {
        for (FuncionarioHotel funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarFuncionario(FuncionarioHotel funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarCheckIn(CheckIn checkIn) {
        checkIns.add(checkIn);
    }

    public void adicionarCheckOut(CheckOut checkOut) {
        checkOuts.add(checkOut);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void adicionarServicoAdicional(ServicoAdicional servicoAdicional) {
        servicosAdicionais.add(servicoAdicional);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public void removerFuncionario(FuncionarioHotel funcionario) {
        funcionarios.remove(funcionario);
    }
    
    public void removerCheckIn(CheckIn checkIn) {
        checkIns.remove(checkIn);
    }

    public void removerPagamento(PagamentoReserva pagamento) {
        pagamentos.remove(pagamento);
    }
    
    public void removerCheckOut(CheckOut checkOut) {
        checkOuts.remove(checkOut);
    }

    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    public void removerServicoAdicional(ServicoAdicional servicoAdicional) {
        servicosAdicionais.remove(servicoAdicional);
    }

    public void removerQuartos() {
        quartos.clear();
    }

    public void removerReservas() {
        reservas.clear();
    }

    public void removerClientes() {
        clientes.clear();
    }

    public void removerFuncionarios() {
        funcionarios.clear();
    }

    public void removerCheckIns() {
        checkIns.clear();
    }

    public void removerCheckOuts() {
        checkOuts.clear();
    }

    public void removerServicos() {
        servicos.clear();
    }

    public void removerServicosAdicionais() {
        servicosAdicionais.clear();
    }
    
    public void removerPagamentos() {
        pagamentos.clear();
    }

    public PagamentoReserva pagarReservaOnline(String idPagamento, double valor, Reserva reserva) {
        PagamentoReserva pagamento = PagamentoFactory.criarPagamento("online", idPagamento, valor, reserva);
        pagamentos.add(pagamento);
        return pagamento;
    }

    public PagamentoReserva pagarReservaPresencial(String idPagamento, double valor, Reserva reserva) {
        PagamentoReserva pagamento = PagamentoFactory.criarPagamento("presencial", idPagamento, valor, reserva);
        pagamentos.add(pagamento);
        return pagamento;
    }
}
