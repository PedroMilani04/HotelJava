/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;
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
 
private ArrayList <PagamentoReserva> pagamentos;
private ArrayList <ServiçoAdicional> serviços;
private LocalDate dataAtual ;
    


public void gerarPagamento(Cliente c, String idPaga,String metodo,String recep, String unidade){
    
    double total=0;
for(Quarto q: this.quartos){
    if(q.getCliente==c){
        LocalDate checkIn= LocalDate.parse(q.getDataCheckIn, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
       // Period estadia = Period.between(checkIn, dataAtual);
        long estadia = ChronoUnit.DAYS.between(checkIn, dataAtual);
        total=q.getPreco()*estadia;
        q.setDisponibilidade(true);
        
    
    break;
    }}
     for(int i = 0; i < serviços.size(); i++){
        if(serviços.get(i).getCliente==c){
            total=total + serviços.get(i).getValorTotal;
            break;
        }
    
     }
     PagamentoReserva paga= new PagamentoReserva(idPaga, total);
     pagamentos.add(paga);
  
     //--------------------------------------------------------------------------------
     
}
public void saida(Cliente c, String idPaga,String metodo,String recep, String unidade){
    
gerarPagamento(c,idPaga);
 for(int i = 0; i < pagamentos.size(); i++){
     if(pagamentos.get(i).getIdpagamento == idPaga){
     pagamentos.get(i).pagarReserva( metodo, recep, unidade);
     break;
     }}
     if(pagamentos.getStatus!= "pago"){
         System.out.println("Erro no pagamento da estadia");
     }
     
        
}
}
