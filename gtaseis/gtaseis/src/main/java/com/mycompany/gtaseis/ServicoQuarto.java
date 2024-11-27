package com.mycompany.gtaseis;

// Classe Servico especializado para o Quarto


/**
 * Classe que representa um serviço adicional oferecido no quarto.
 * Os serviços possuem valores pré-definidos e um desconto de 30%.
 */
public class ServicoQuarto extends Servico{
    

    /**
     * Construtor que inicializa um serviço no quarto com base no nome do serviço.
     * O valor do serviço é calculado automaticamente com base no tipo.
     * 
     * @param nome o nome do serviço solicitado (ex.: "lavanderia", "limpeza", "minibar")
     * @throws IllegalArgumentException se o tipo de serviço não for válido
     */

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
    /**
     * 
     * @param valor o valor base do serviço
     */
    public void calculaValor(double valor) {
        super.setValor(valor-valor*0.3);
    }

}
