import Hotel;

import Cliente;

public class Reserva {
    protected CheckIn dataEntrada;
    protected CheckOut dataSaida;
    protected Quarto quarto;
    protected double valorTotal;
    protected Cliente cliente;

    public Reserva(CheckIn dtEntrada, CheckOut dtSaida, Quarto q, Cliente c){
        if(q.getDisponibilidade()){
            this.dataEntrada = dtEntrada.getData; //verificar entrada seria dataEntrada.getData
            this.dataSaida = dtSaida.getSaida; //assim como aq
            this.quarto = q;
            this.valorTotal = q.getValorDiaria();
            this.cliente = c;
            q.setDisponibilidade(false);
        }else{
            throw new IllegalArgumentException("Quarto ocupado"); //justificativa: não é possível reservar um quarto ocupado
        }
        
    }

    public CheckIn getDataEntrada(){
        return this.dataEntrada;
    }

    public CheckOut getDataSaida(){
        return this.dataSaida;
    }

    public Quarto getQuarto(){
        return this.quarto;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public void setDataEntrada(CheckIn dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(CheckOut dataSaida){
        this.dataSaida = dataSaida;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    
}
