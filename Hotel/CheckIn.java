/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author danie
 */

    
public class CheckIn {
    protected Quarto quartos [];
    protected int cont;
     

    
    
    public int entrada(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if(quartos[i].getDisponibilidade==1){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }

   /* public int entradaQuartoLuxo(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i] instanceof QuartoLuxo )){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }*/
     public int entradaQuarEmpresarial(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i].getTipo==0)){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }
    /*
public int entradaQuartoEmpresarial(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i] instanceof QuartoEmpresarial )){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }
*/
     public int entradaQuartoCasal(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i].getTipo==1)){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }
public int entradaQuartoFamilia(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i].getTipo==2)){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }

    public int entradaQuartopresidencial(Cliente hospede, String dataCheckIn){
       for(int i=0; (this.quartos[i]!= null)  ;i++){
    if((quartos[i].getDisponibilidade==1) && (quartos[i].getTipo==3)){
        quartos[i].setCliente(hospede);
        quartos[i].setDisponibilidade(0);
        quartos[i].setData(dataCheckIn);
    return i;
    }
    
    } 
      return 0; // não há vagas 
    
    }
    
    public CheckIn() {
        cont=0;
    }

    
    
    
    public void addQuarto(Quarto quarto){
    quartos [cont]=quarto;
    cont++;
    quarto.setNumero(cont+1);
}
    public int getCont() {
        return cont;
    }
    
    
 public Quarto[] getQuartos() {
        Quarto quartos[] = new Quarto[60];
        
        for(int i=0; this.quartos[i]!= null;i++){
    
    quartos[i]= this.quartos[i];
    }
      
        
        return quartos;
    }    
    


public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
int contagem=0;
 for(int i=0; this.quartos[i]!= null;i++){
    contagem++;
    quartos[i].setNumero(contagem);
    
    }
 this.cont=contagem;
    }
}
