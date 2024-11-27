package com.mycompany.gtaseis;

// Classe Servico especializado para o Quarto
public class ServicoQuarto extends Servico{

    public ServicoQuarto(String nome) {
        super(nome);
        switch (nome.toLowerCase()) {
            case "lavanderia":
                calculaValor(55);
                break;
            case "limpeza":
                calculaValor(35);
                break;
            case "minibar":
                calculaValor(60);
                break;
            default:
                throw new IllegalArgumentException("Tipo de servico invalido");
        }
    }

    // Metodo para calcular valor total de forma individual
    public void calculaValor(double valor) {
        super.setValor(valor-valor*0.3);
    }

}
