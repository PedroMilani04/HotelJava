package com.mycompany.gtaseis;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
/**
 * Classe responsável por gerenciar o processo de check-in de hóspedes em quartos.
 * Permite a entrada de hóspedes em diferentes tipos de quartos, verifica disponibilidade
 * e associa o cliente ao quarto reservado.
 */
public class CheckIn {
    protected ArrayList <Quarto> quartos;
    protected LocalDateTime dataHora;
     

    
    /**
     * Realiza o check-in de um cliente em qualquer quarto disponível.
     * 
     * @param hospede o cliente que deseja realizar o check-in
     * @param dataCheckIn a data e hora do check-in
     * @return o número do quarto atribuído ou 0 se não houver quartos disponíveis
     */
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

/**
     * Realiza o check-in de um cliente em um quarto empresarial.
     * 
     * @param hospede o cliente que deseja realizar o check-in
     * @param dataCheckIn a data e hora do check-in
     * @return o número do quarto atribuído ou 0 se não houver quartos disponíveis
     */
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
  
   /**
     * Realiza o check-in de um cliente em um quarto de casal.
     * 
     * @param hospede o cliente que deseja realizar o check-in
     * @param dataCheckIn a data e hora do check-in
     * @return o número do quarto atribuído ou 0 se não houver quartos disponíveis
     */
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

     /**
     * Realiza o check-in de um cliente em um quarto família.
     * 
     * @param hospede o cliente que deseja realizar o check-in
     * @param dataCheckIn a data e hora do check-in
     * @return o número do quarto atribuído ou 0 se não houver quartos disponíveis
     */
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

/**
     * Realiza o check-in de um cliente em um quarto presidencial.
     * 
     * @param hospede o cliente que deseja realizar o check-in
     * @param dataCheckIn a data e hora do check-in
     * @return o número do quarto atribuído ou 0 se não houver quartos disponíveis
     */
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
    /**
     * Construtor padrão que inicializa a lista de quartos.
     */
    public CheckIn() {
        this.quartos = new ArrayList<>();
        
    }

    /**
     * Construtor que inicializa o `CheckIn` com uma lista específica de quartos.
     * 
     * @param quartos a lista de quartos disponíveis
     */
    public CheckIn(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    

    
    
    /**
     * Adiciona um novo quarto à lista de quartos.
     * 
     * @param quarto o quarto a ser adicionado
     */

    public void addQuarto(Quarto quarto){
   quartos.add(quarto);
}
/**
     * Adiciona um novo quarto à lista de quartos.
     * 
     * @param quarto o quarto a ser adicionado
     */

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

/**
     * Define a lista de quartos disponíveis.
     * 
     * @param quartos a nova lista de quartos
     */
    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
   
    
    
}
