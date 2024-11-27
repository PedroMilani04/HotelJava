package com.mycompany.gtaseis;
 import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author danie
 */
public class CheckOut extends CheckIn{
protected StrategyStandard strategiaNegocio;
protected ArrayList <PagamentoReserva> pagamentos;
protected ArrayList <ServicoAdicional> servicos;
protected LocalDate dataAtual ;
    



 //-----------------Realizar o checkout para deixar o hotel
public void saida(Cliente c, String idPaga,String metodo,String recep, String unidade){
    
strategiaNegocio.gerarPagamento(this,c,idPaga);
int i;
 for(i = 0; i < pagamentos.size(); i++){
     if(pagamentos.get(i).getIdPagamento() == idPaga){
     pagamentos.get(i).pagarReserva( metodo, recep, unidade);
     break;
     }}
     if(pagamentos.get(i).getStatus() != "pago"){
         System.out.println("Erro no pagamento da estadia");
     }
     
        
}
//---------------------------------construtores
    public CheckOut(ArrayList<PagamentoReserva> pagamentos, ArrayList<ServicoAdicional> servicos, LocalDate dataAtual, ArrayList<Quarto> quartos) {
        super(quartos);
        this.pagamentos = pagamentos;
        this.servicos = servicos;
        this.dataAtual = dataAtual;
    }

    public CheckOut(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
         this.quartos = new ArrayList<>();
         this.pagamentos= new ArrayList<>();
         this.servicos=new ArrayList<>();
    }
//---------------------getters e setters
    public ArrayList<PagamentoReserva> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<PagamentoReserva> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ArrayList<ServicoAdicional> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<ServicoAdicional> serviços) {
        this.servicos = serviços;
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
        this.strategiaNegocio = (StrategyStandard) strategiaNegocio;
    }
}
