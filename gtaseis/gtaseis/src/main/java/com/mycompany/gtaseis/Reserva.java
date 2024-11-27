package com.mycompany.gtaseis;

import java.util.ArrayList;


/**
 * Representa uma reserva de quarto em um hotel. Esta classe armazena informações sobre a
 * reserva, como o quarto reservado, a data de entrada, o valor total da estadia e o cliente
 * que realizou a reserva. Também gerencia a lista de todas as reservas realizadas.
 */
public class Reserva {
    protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    protected Quarto quarto;
    protected String dataEntrada;
    protected double valorTotal;
    protected Cliente cliente;

 /**
     * Construtor da classe Reserva. Cria uma nova reserva se o quarto estiver disponível,
     * registra a data de entrada, o quarto reservado, o cliente e o valor total da reserva.
     * Se o quarto já estiver ocupado, uma exceção será lançada.
     * 
     * @param q O quarto reservado.
     * @param c O cliente que está realizando a reserva.
     * @param dtEntrada A data de entrada para a reserva (em formato de string).
     * @throws IllegalArgumentException Se o quarto já estiver ocupado.
     */
    public Reserva(Quarto q, Cliente c, String dtEntrada){
        if(q.getDisponibilidade()){
            this.dataEntrada = dtEntrada;
            this.quarto = q;
            this.valorTotal = q.getPreco();
            this.cliente = c;
            q.setDisponibilidade(false);
            reservas.add(this); //Adiciona assim que a reserva é feita
        }else{
            throw new IllegalArgumentException("Quarto ocupado"); //justificativa: não é possível reservar um quarto ocupado
        }
            reservas.add(this);
    }

     
     /**
     * Retorna a lista de todas as reservas realizadas.
     * 
     * @return A lista de reservas.
     */
    public ArrayList<Reserva> getReservas() { // Método para obter todas as reservas (opcional)
        return this.reservas;
    }


    /**
     * Retorna a data de entrada da reserva.
     * 
     * @return A data de entrada no formato de string.
     */
    public String getDataEntrada(){
        return this.dataEntrada;
    }

/**
     * Retorna o quarto reservado para esta reserva.
     * 
     * @return O objeto Quarto reservado.
     */
    public Quarto getQuarto(){
        return this.quarto;
    }


    /**
     * Retorna o cliente que realizou a reserva.
     * 
     * @return O cliente que fez a reserva.
     */

    public Cliente getCliente(){
        return this.cliente;
    }

 /**
     * Retorna o valor total da reserva.
     * 
     * @return O valor total da reserva.
     */
    public double getValorTotal(){
        return this.valorTotal;
    }


/**
     * Altera o valor total da reserva.
     * 
     * @param valorTotal O novo valor total da reserva.
     */
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal; //Caso haja alguma alteração necessaria
    }

    
}
