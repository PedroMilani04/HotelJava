package com.mycompany.gtaseis;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Servejeira
 */
/**
 * Classe abstrata que representa um pagamento de reserva.
 * Contém informações gerais sobre o pagamento, como o ID, valor, status e data.
 * A classe também define o comportamento básico para realizar o pagamento.
 */
public abstract class PagamentoReserva{
    protected String idPagamento;
    protected double valor;
    protected String status;
    protected String metodoPagamento;
    protected LocalDateTime dataPagamento;
    
     /**
     * Constrói uma instância de PagamentoReserva com o ID de pagamento e o valor.
     * Inicializa o status do pagamento como "pendente".
     *
     * @param idPagamento O identificador único do pagamento.
     * @param valor O valor do pagamento.
     * @throws IllegalArgumentException Se o valor for negativo.
     */
    public PagamentoReserva(String idPagamento, double valor) {
        this.idPagamento = idPagamento;
        status = "pendente";
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do pagamento não pode ser negativo.");
        }
    }

/**
     * Retorna o identificador do pagamento.
     * 
     * @return O identificador único do pagamento.
     */
    public String getIdPagamento() {
        return idPagamento;
    }


    /**
     * Define o identificador do pagamento.
     * 
     * @param idPagamento O identificador do pagamento a ser definido.
     */
    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

/**
     * Retorna o valor do pagamento.
     * 
     * @return O valor do pagamento.
     */
    public double getValor() {
        return valor;
    }

/**
     * Define o valor do pagamento.
     * 
     * @param valor O valor a ser definido.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
 /**
     * Retorna o status do pagamento (ex: "pendente", "pago").
     * 
     * @return O status atual do pagamento.
     */
    public String getStatus() {
        return status;
    }

/**
     * Define o status do pagamento.
     * 
     * @param status O status a ser definido.
     */
    public void setStatus(String status) {
        this.status = status;
    }

 /**
     * Retorna o método de pagamento utilizado.
     * 
     * @return O método de pagamento utilizado (ex: "cartão de crédito", "PayPal").
     */
    public String getMetodoPagamento() {
        return metodoPagamento;
    }

/**
     * Define o método de pagamento utilizado.
     * 
     * @param metodoPagamento O método de pagamento a ser definido (ex: "cartão de crédito").
     */
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

/**
     * Retorna a data e hora do pagamento.
     * 
     * @return A data e hora do pagamento.
     */
    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

/**
     * Define a data e hora do pagamento.
     * 
     * @param dataPagamento A data e hora do pagamento a ser definida.
     */
    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
      /**
     * Método abstrato que realiza o pagamento da reserva. 
     * Este método deve ser implementado pelas subclasses para 
     * definir o comportamento específico do pagamento.
     * 
     * @param metodoPagamento O método de pagamento utilizado.
     * @param info1 Informações adicionais para o pagamento.
     * @param info2 Informações adicionais para o pagamento, dependendo da implementação.
     */
    public abstract void pagarReserva(String metodoPagamento, String info1, String info2);
}
