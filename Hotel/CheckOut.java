/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
 import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author danie
 */
public class CheckOut extends CheckIn{
 private Strategy strategiaNegocio;
private ArrayList <PagamentoReserva> pagamentos;
private ArrayList <ServiçoAdicional> serviços;
private LocalDate dataAtual ;
    



 //-----------------Realizar o checkout para deixar o hotel
public void saida(Cliente c, String idPaga,String metodo,String recep, String unidade){
    
strategiaNegocio.gerarPagamento(this,c,idPaga);
 for(int i = 0; i < pagamentos.size(); i++){
     if(pagamentos.get(i).getIdpagamento() == idPaga){
     pagamentos.get(i).pagarReserva( metodo, recep, unidade);
     break;
     }}
     if(pagamentos.getStatus!= "pago"){
         System.out.println("Erro no pagamento da estadia");
     }
     
        
}
//---------------------------------construtores
    public CheckOut(ArrayList<PagamentoReserva> pagamentos, ArrayList<ServiçoAdicional> serviços, LocalDate dataAtual, ArrayList<Quarto> quartos) {
        super(quartos);
        this.pagamentos = pagamentos;
        this.serviços = serviços;
        this.dataAtual = dataAtual;
    }

    public CheckOut(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
         this.quartos = new ArrayList<>();
         this.pagamentos= new ArrayList<>();
         this.serviços=new ArrayList<>();
    }
//---------------------getters e setters
    public ArrayList<PagamentoReserva> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<PagamentoReserva> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ArrayList<ServiçoAdicional> getServiços() {
        return serviços;
    }

    public void setServiços(ArrayList<ServiçoAdicional> serviços) {
        this.serviços = serviços;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    
 public void setStrategiaNegocio(Strategy strategiaNegocio) {
        this.strategiaNegocio = strategiaNegocio;
    }
}
