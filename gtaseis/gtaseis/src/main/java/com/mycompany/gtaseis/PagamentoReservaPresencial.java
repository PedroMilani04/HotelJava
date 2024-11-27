package com.mycompany.gtaseis;

import java.time.LocalDateTime;

/**
 *
 * @author Daniel Servejeira
 */
/**
 * Classe que representa um pagamento de reserva realizado presencialmente.
 * Estende a classe abstrata PagamentoReserva e adiciona informações sobre o recepcionista
 * e a unidade do hotel onde o pagamento foi efetuado.
 */
public class PagamentoReservaPresencial extends PagamentoReserva{
    private String recepcionista;
    private String unidadeHotel;
    
    /**
     * Construtor da classe PagamentoReservaPresencial.
     * Inicializa a instância com o ID do pagamento e o valor.
     *
     * @param idPagamento O identificador único do pagamento.
     * @param valor O valor do pagamento.
     */

    public PagamentoReservaPresencial(String idPagamento, double valor) {
        super(idPagamento, valor);
    }
    /**
     * Construtor da classe PagamentoReservaPresencial.
     * Inicializa a instância com o ID do pagamento e o valor.
     *
     * @param idPagamento O identificador único do pagamento.
     * @param valor O valor do pagamento.
     */

    public String getRecepcionista() {
        return recepcionista;
    }
/**
     * Define o nome do recepcionista que realizou o pagamento.
     * 
     * @param recepcionista O nome do recepcionista.
     */
    public void setRecepcionista(String recepcionista) {
        this.recepcionista = recepcionista;
    }
/**
     * Retorna o nome da unidade do hotel onde o pagamento foi realizado.
     * 
     * @return O nome da unidade do hotel.
     */
    public String getUnidadeHotel() {
        return unidadeHotel;
    }

/**
     * Define o nome da unidade do hotel onde o pagamento foi realizado.
     * 
     * @param unidadeHotel O nome da unidade do hotel.
     */
    public void setUnidadeHotel(String unidadeHotel) {
        this.unidadeHotel = unidadeHotel;
    }

 /**
     * Realiza o pagamento da reserva. Este método registra o método de pagamento,
     * a data e hora do pagamento, o recepcionista e a unidade do hotel onde o pagamento
     * foi realizado, e altera o status do pagamento para "pago".
     *
     * @param metodoPagamento O método de pagamento utilizado.
     * @param recepcionista O nome do recepcionista que processou o pagamento.
     * @param unidadeHotel O nome da unidade do hotel onde o pagamento foi realizado.
     */
    @Override
    public void pagarReserva(String metodoPagamento, String recepcionista, String unidadeHotel) {
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = LocalDateTime.now();
        this.recepcionista = recepcionista;
        this.unidadeHotel = unidadeHotel;
        status = "pago";
    }
}
