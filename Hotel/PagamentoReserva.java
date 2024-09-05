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
public abstract class PagamentoReserva{
    protected String idPagamento;
    protected double valor;
    protected String status;
    protected String metodoPagamento;
    protected LocalDateTime dataPagamento;
    
    public PagamentoReserva(String idPagamento, double valor) {
        this.idPagamento = idPagamento;
        status = "pendente";
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do pagamento não pode ser negativo.");
        }
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public abstract void pagarReserva(String metodoPagamento, String info1, String info2);
}
