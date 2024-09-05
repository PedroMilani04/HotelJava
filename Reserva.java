import java.util.ArrayList;
import Cliente;

public class Reserva {
    protected static ArrayList<Reserva> reservas = new ArrayList<Reserva>(); //verificar com o professor se isso vai dar certo
    protected Quarto quarto;
    protected String dataEntrada;
    protected double valorTotal;
    protected Cliente cliente;

    public Reserva(Quarto q, Cliente c, String dtEntrada){
        if(q.getDisponibilidade()){
            this.dataEntrada = dtEntrada;
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
        this.valorTotal = valorTotal;
    }

    
}
