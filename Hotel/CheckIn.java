/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.util.ArrayList;

/**
 *
 * @author danie
 */

    
public class CheckIn {
    protected ArrayList <Quarto> quartos;
    
     

    
    
    public int entrada(Cliente hospede, String dataCheckIn){
       // for(Departamento d : this.departamentos){
       for(Quarto q : this.quartos){
    if(q.getDisponibilidade==1){
        q.setCliente(hospede);
        q.setDisponibilidade(0);
        q.setData(dataCheckIn);
    return q.getNumero;
    }
    
    } 
      return 0; // não há vagas 
    
    }


     public int entradaQuarEmpresarial(Cliente hospede, String dataCheckIn){
       for(Quarto q: this.quartos){
    if((q.getDisponibilidade==1) && (q.getTipo==0)){
        q.setCliente(hospede);
        q.setDisponibilidade(0);
        q.setData(dataCheckIn);
    return q.getNumero;
    }
    
    } 
      return 0; // não há vagas 
    
    }
  
     public int entradaQuartoCasal(Cliente hospede, String dataCheckIn){
       for(Quarto q: this.quartos){
    if((q.getDisponibilidade) && (q.getTipo==1)){
        q.setCliente(hospede);
        q.setDisponibilidade(0);
        q.setData(dataCheckIn);
    return q.getNumero;
    }
    
    } 
      return 0; // não há vagas 
    
    }
public int entradaQuartoFamilia(Cliente hospede, String dataCheckIn){
       for(Quarto q : this.quartos){
    if((q.getDisponibilidade==1) && (q.getTipo==2)){
        q.setCliente(hospede);
        q.setDisponibilidade(0);
        q.setData(dataCheckIn);
    return q.getNumero;
    }
    
    } 
      return 0; // não há vagas 
    
    }

    public int entradaQuartopresidencial(Cliente hospede, String dataCheckIn){
       for(Quarto q : this.quartos){
    if((q.getDisponibilidade==1) && (q.getTipo==3)){
        q.setCliente(hospede);
        q.setDisponibilidade(0);
        q.setData(dataCheckIn);
    return q.getNumero;
    }
    
    } 
      return 0; // não há vagas 
    
    }
    
    public CheckIn() {
        this.quartos = new ArrayList<>();
        
    }

    public CheckIn(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    

    
    
    
    public void addQuarto(Quarto quarto){
   quartos.add(quarto);
}

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
   
    
    
}
