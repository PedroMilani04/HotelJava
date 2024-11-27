package com.mycompany.gtaseis;

/**
 * A fábrica de pagamentos, responsável pela criação de objetos de pagamento do tipo {@link PagamentoReserva}.
 * Esta classe utiliza o padrão de projeto Factory para instanciar diferentes tipos de pagamentos conforme o tipo especificado.
 */
public class PagamentoFactory {

   /**
     * Cria um pagamento de reserva com base no tipo especificado.
     * 
     * @param tipo o tipo de pagamento. Aceita "online" ou "presencial".
     * @param idPagamento o identificador único do pagamento.
     * @param valor o valor da reserva a ser pago.
     * @return um objeto do tipo {@link PagamentoReserva}, que pode ser {@link PagamentoReservaOnline} ou {@link PagamentoReservaPresencial}.
     * @throws IllegalArgumentException caso o tipo fornecido não seja válido.
     */
  public static PagamentoReserva criarPagamento (String tipo, String idPagamento, double valor) {
    switch (tipo.toLowerCase()) {
      case "online":
        return new PagamentoReservaOnline(idPagamento, valor);
      case "presencial":
        return new PagamentoReservaPresencial(idPagamento, valor);
      default:
        throw new IllegalArgumentException("Tipo de pagamento inválido");
    }
  }
}
