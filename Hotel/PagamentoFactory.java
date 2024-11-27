package Hotel;

public class PagamentoFactory {
  public static PagamentoReserva criarPagamento (String tipo, String idPagamento, double valor, Reserva reserva) {
    switch (tipo.toLowerCase()) {
      case "online":
        return new PagamentoReservaOnline(idPagamento, valor, reserva);
      case "presencial":
        return new PagamentoReservaPresencial(idPagamento, valor, reserva);
      default:
        throw new IllegalArgumentException("Tipo de pagamento inválido");
    }
  }
}
