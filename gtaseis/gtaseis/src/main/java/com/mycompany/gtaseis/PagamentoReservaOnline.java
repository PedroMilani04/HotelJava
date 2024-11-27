package com.mycompany.gtaseis;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Servejeira
 */


/**
 * Classe que representa um pagamento de reserva realizado de forma online.
 * Estende a classe abstrata PagamentoReserva e adiciona informações sobre o dispositivo
 * e o navegador utilizados para o pagamento.
 */
public class PagamentoReservaOnline extends PagamentoReserva{
    private String dispositivo;
    private String navegador;
    
    /**
     * Construtor da classe PagamentoReservaOnline.
     * Inicializa a instância com o ID do pagamento e o valor.
     *
     * @param idPagamento O identificador único do pagamento.
     * @param valor O valor do pagamento.
     */
    public PagamentoReservaOnline(String idPagamento, double valor) {
        super(idPagamento, valor);
    }

/**
     * Retorna o dispositivo utilizado para realizar o pagamento.
     * 
     * @return O dispositivo utilizado.
     */
    public String getDispositivo() {
        return dispositivo;
    }

 /**
     * Define o dispositivo utilizado para realizar o pagamento.
     * 
     * @param dispositivo O dispositivo a ser definido.
     */
    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

/**
     * Retorna o navegador utilizado para realizar o pagamento.
     * 
     * @return O navegador utilizado.
     */
    public String getNavegador() {
        return navegador;
    }

/**
     * Define o navegador utilizado para realizar o pagamento.
     * 
     * @param navegador O navegador a ser definido.
     */
    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }
    
     /**
     * Realiza o pagamento da reserva. Este método registra o método de pagamento,
     * a data e hora do pagamento, o dispositivo e o navegador utilizados,
     * e altera o status do pagamento para "pago".
     *
     * @param metodoPagamento O método de pagamento utilizado .
     * @param dispositivo O dispositivo utilizado para realizar o pagamento.
     * @param navegador O navegador utilizado para realizar o pagamento.
     */
    @Override
    public void pagarReserva(String metodoPagamento, String dispositivo, String navegador) {
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = LocalDateTime.now();
        this.dispositivo = dispositivo;
        this.navegador = navegador;
        status = "pago";
    }
}
