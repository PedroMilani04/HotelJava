package POOII.HotelJava;

import Hotel;

public class Reserva {
    protected String dataEntrada;
    protected String dataSaida;
    protected Quarto quarto;
    protected double valorTotal;

    public Reserva(String dataEntrada, String dataSaida, Quarto q){
        if(q.getDisponibilidade()){
            this.dataEntrada = dataEntrada;
            this.dataSaida = dataSaida;
            this.quarto = q;
            this.valorTotal = q.getValorDiaria();
            q.setDisponibilidade(false);
        }else{
            throw new IllegalArgumentException("Quarto ocupado");
        }
        
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }

    public String getDataSaida(){
        return this.dataSaida;
    }

    public Quarto getQuarto(){
        return this.quarto;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    
}
