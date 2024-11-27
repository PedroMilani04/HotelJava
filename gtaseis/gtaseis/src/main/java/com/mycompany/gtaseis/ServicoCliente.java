package com.mycompany.gtaseis;

// Classe Servico especializado para o Cliente

/**
 * Classe que representa um serviço especializado para clientes.
 * Este serviço possui valores pré-definidos para tipos específicos e adiciona uma taxa de 10%.
 */
public class ServicoCliente extends Servico{

/**
     * Construtor que inicializa um serviço para um cliente com base no nome do serviço.
     * O valor do serviço é calculado automaticamente com base no tipo.
     * 
     * @param nome o nome do serviço solicitado (ex.: "spa", "cafe da manha", etc.)
     * @param cpfCliente o CPF do cliente que solicitou o serviço
     * @throws IllegalArgumentException se o tipo de serviço não for válido
     */

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

    /**
     * 
     * @param valor o valor base do serviço
     */
    public void calculaValor(double valor) {
        super.setValor(valor+valor*0.1);
    }

}
