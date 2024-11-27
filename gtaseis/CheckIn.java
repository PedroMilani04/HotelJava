package com.mycompany.gtaseis;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author danie
 */

    
public class CheckIn {
    protected ArrayList <Quarto> quartos;
    protected LocalDateTime dataHora;
     

    
    
    public int entrada(Cliente hospede, LocalDateTime dataCheckIn){
       // for(Departamento d : this.departamentos){
       for(Quarto q : this.quartos){
    if(q.getDisponibilidade()){
        q.setCpfCliente(hospede.getCpf());
        q.setDisponibilidade(false);
        q.dataHora = dataCheckIn; 
    return q.getNumeroDoQuarto(); // Retornando o numero do quarto
    }
    
    } 
      return 0; // não há vagas 
    
    }


     public int entradaQuarEmpresarial(Cliente hospede, LocalDateTime dataCheckIn){
       for(Quarto q: this.quartos){
    if((q.getDisponibilidade()) && (q.getTipo() == 0)){
        q.setCpfCliente(hospede.getCpf());
        q.setDisponibilidade(false);
        q.dataHora = dataCheckIn;
    return q.getNumeroDoQuarto(); //retornando o numero do quarto
    }
    
    } 
      return 0; // não há vagas 
    
    }
  
     public int entradaQuartoCasal(Cliente hospede, LocalDateTime dataCheckIn){
       for(Quarto q: this.quartos){
    if((q.getDisponibilidade()) && (q.getTipo() == 1)){
        q.setCpfCliente(hospede.getCpf());
        q.setDisponibilidade(false);
        q.dataHora = dataCheckIn;
    return q.getNumeroDoQuarto(); //retornando o numero do quarto
    }
    
    } 
      return 0; // não há vagas 
    
    }
public int entradaQuartoFamilia(Cliente hospede, LocalDateTime dataCheckIn){
       for(Quarto q : this.quartos){
    if((q.getDisponibilidade()) && (q.getTipo() == 2)){
        q.setCpfCliente(hospede.getCpf());
        q.setDisponibilidade(false);
        q.dataHora = dataCheckIn;
    return q.getNumeroDoQuarto(); //retornando o numero do quarto
    }
    
    } 
      return 0; // não há vagas 
    
    }

    public int entradaQuartopresidencial(Cliente hospede, LocalDateTime dataCheckIn){
       for(Quarto q : this.quartos){
    if((q.getDisponibilidade()) && (q.getTipo() == 3)){
        q.setCpfCliente(hospede.getCpf());
        q.setDisponibilidade(false);
        q.dataHora = dataCheckIn;
    return q.getNumeroDoQuarto(); //retornando o numero do quarto
    }
    
    } 
      return 0; // não há vagas 
    
    }
    //---------------CONSTRTUTORES-----------------
    public CheckIn() {
        this.quartos = new ArrayList<>();
        
    }
//---------------Função para adicionar mais um quarto
    public CheckIn(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    

    
    
    
    public void addQuarto(Quarto quarto){
   quartos.add(quarto);
}
//--------------------Get e set
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
   
    
    
}
