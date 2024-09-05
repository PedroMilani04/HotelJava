import Hotel;

import Cliente;
import java.util.ArrayList;

import com.mycompany.hotel.CheckIn;

public class Reserva {
    protected static ArrayList<Reserva> reservas = new ArrayList<Reserva>(); //verificar com o professor se isso vai dar certo
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
            reservas.add(this); //Adiciona assim que a reserva é feita
        }else{
            throw new IllegalArgumentException("Quarto ocupado"); //justificativa: não é possível reservar um quarto ocupado
        }
            reservas.add(this);
    }

     
    public static ArrayList<Reserva> getReservas() { // Método para obter todas as reservas (opcional)
        return reservas;
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

    public Cliente getCliente(){
        return this.cliente;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    
}
