package com.mycompany.gtaseis;

// Classe Servico especializado para o Cliente
public class ServicoCliente extends Servico{

    public ServicoCliente(String nome, String cpfCliente) {
        super(nome);
        switch (nome.toLowerCase()) {
            case "spa":
                calculaValor(100);
                break;
            case "cafe da manha":
                calculaValor(20);
                break;
            case "cafe da tarde":
                calculaValor(20);
                break;
            case "almoco":
                calculaValor(35);
                break;
            case "janta":
                calculaValor(35);
                break;
            default:
                throw new IllegalArgumentException("Tipo de servico invalido");
        }
    }

    // Metodo para calcular valor total de forma individual
    public void calculaValor(double valor) {
        super.setValor(valor+valor*0.1);
    }

}
