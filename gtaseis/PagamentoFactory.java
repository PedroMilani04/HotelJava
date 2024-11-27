package com.mycompany.gtaseis;

public class PagamentoFactory {
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
