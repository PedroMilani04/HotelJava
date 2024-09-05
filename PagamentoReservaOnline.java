/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasdereservadehotel;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Servejeira
 */
public class PagamentoReservaOnline extends PagamentoReserva{
    private String dispositivo;
    private String navegador;
    
    public PagamentoReservaOnline(String idPagamento, double valor) {
        super(idPagamento, valor);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }
    
    @Override
    public void pagarReserva(String metodoPagamento, String dispositivo, String navegador) {
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = LocalDateTime.now();
        this.dispositivo = dispositivo;
        this.navegador = navegador;
        status = "pago";
    }
}
