package com.mycompany.gtaseis;
 import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author danie
 */
/**
 * Classe responsável pelo processo de check-out, estendendo a funcionalidade da classe {@link CheckIn}.
 * Gerencia o pagamento das estadias e serviços adicionais associados a um cliente.
 */
public class CheckOut extends CheckIn{
protected Strategy strategiaNegocio;
protected ArrayList <PagamentoReserva> pagamentos;
protected ArrayList <ServicoAdicional> servicos;
protected LocalDate dataAtual ;
    



 /**
     * Realiza o processo de check-out para um cliente específico, incluindo o pagamento
     * da estadia e serviços adicionais.
     * 
     * @param c o cliente que está realizando o check-out
     * @param idPaga o identificador do pagamento
     * @param metodo o método de pagamento utilizado
     * @param recep o nome do recepcionista que realizou o check-out
     * @param unidade a unidade do hotel onde o check-out foi realizado
     */
public void saida(Cliente c, String idPaga,String metodo,String recep, String unidade){
    
strategiaNegocio.gerarPagamento(this,c,idPaga);
int i;
 for(i = 0; i < pagamentos.size(); i++){
     if(pagamentos.get(i).getIdPagamento() == idPaga){
     pagamentos.get(i).pagarReserva( metodo, recep, unidade);
     break;
     }}
     if(pagamentos.get(i).getStatus() != "pago"){
         System.out.println("Erro no pagamento da estadia");
     }
     
        
}
 // --------------------- Construtores ---------------------

    /**
     * Construtor que inicializa todos os campos do check-out.
     * 
     * @param pagamentos a lista de pagamentos realizados
     * @param servicos a lista de serviços adicionais consumidos
     * @param dataAtual a data do check-out
     * @param quartos a lista de quartos do hotel
     */
    public CheckOut(ArrayList<PagamentoReserva> pagamentos, ArrayList<ServicoAdicional> servicos, LocalDate dataAtual, ArrayList<Quarto> quartos) {
        super(quartos);
        this.pagamentos = pagamentos;
        this.servicos = servicos;
        this.dataAtual = dataAtual;
    }
 /**
     * Construtor que inicializa o check-out apenas com a data atual.
     * Inicializa as listas de quartos, pagamentos e serviços vazias.
     * 
     * @param dataAtual a data do check-out
     */
    public CheckOut(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
         this.quartos = new ArrayList<>();
         this.pagamentos= new ArrayList<>();
         this.servicos=new ArrayList<>();
    }
// --------------------- Getters e Setters ---------------------

    /**
     * Retorna a lista de pagamentos realizados.
     * 
     * @return a lista de pagamentos
     */
    public ArrayList<PagamentoReserva> getPagamentos() {
        return pagamentos;
    }

 /**
     * Define a lista de pagamentos realizados.
     * 
     * @param pagamentos a nova lista de pagamentos
     */
    public void setPagamentos(ArrayList<PagamentoReserva> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ArrayList<ServicoAdicional> getServicos() {
        return servicos;
    }

/**
     * Retorna a lista de serviços adicionais consumidos.
     * 
     * @return a lista de serviços adicionais
     */
    public void setServicos(ArrayList<ServicoAdicional> serviços) {
        this.servicos = serviços;
    }
/**
     * Retorna a data atual do check-out.
     * 
     * @return a data atual
     */
    public LocalDate getDataAtual() {
        return dataAtual;
    }

/**
     * Define a data atual do check-out.
     * 
     * @param dataAtual a nova data atual
     */
    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

 /**
     * Retorna a lista de quartos do hotel.
     * 
     * @return a lista de quartos
     */
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

/**
     * Define a lista de quartos do hotel.
     * 
     * @param quartos a nova lista de quartos
     */
    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    

    /**
     * Define a estratégia de pagamento para o check-out.
     * 
     * @param strategiaNegocio a estratégia de pagamento
     */
 public void setStrategiaNegocio(Strategy strategiaNegocio) {
        this.strategiaNegocio =  strategiaNegocio;
    }
}
