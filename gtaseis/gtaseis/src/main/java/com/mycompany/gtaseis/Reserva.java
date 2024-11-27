package com.mycompany.gtaseis;

import java.util.ArrayList;

//quem vai fazer essa reserva???

public class Reserva {
    protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    protected Quarto quarto;
    protected String dataEntrada;
    protected double valorTotal;
    protected Cliente cliente;

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

     
    public ArrayList<Reserva> getReservas() { // Método para obter todas as reservas (opcional)
        return this.reservas;
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }


    public Quarto getQuarto(){
        return this.quarto;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal; //Caso haja alguma alteração necessaria
    }

    
}
