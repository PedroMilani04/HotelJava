package Hotel;

import Hotel.CheckIn;

public class CheckOut extends CheckIn {
    
    public void saida(Cliente hospede){
        for(int i=0; Checkin.quartos[i]!= null; i++){
            if(quartos[i].getCliente().equals(hospede)){
                quartos[i].setCliente(null);
                quartos[i].setDisponibilidade(true);
                quartos[i].setData(null);
            }
        }
    }
}
