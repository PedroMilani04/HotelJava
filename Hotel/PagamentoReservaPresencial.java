/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.time.LocalDateTime;

/**
 *
 * @author Daniel Servejeira
 */
public class PagamentoReservaPresencial extends PagamentoReserva{
    private String recepcionista;
    private String unidadeHotel;
    
    public PagamentoReservaPresencial(String idPagamento, double valor) {
        super(idPagamento, valor);
    }

    public String getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(String recepcionista) {
        this.recepcionista = recepcionista;
    }

    public String getUnidadeHotel() {
        return unidadeHotel;
    }

    public void setUnidadeHotel(String unidadeHotel) {
        this.unidadeHotel = unidadeHotel;
    }

    @Override
    public void pagarReserva(String metodoPagamento, String recepcionista, String unidadeHotel) {
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = LocalDateTime.now();
        this.recepcionista = recepcionista;
        this.unidadeHotel = unidadeHotel;
        status = "pago";
    }
}
