package com.mycompany.gtaseis;

/**
 *
 * @author danie
 */

/**
 * Classe abstrata que define a estratégia calculo de pagamento (abre para promoções).
 * Esta classe pode ser estendida para implementar diferentes tipos de estratégias de pagamento.
 */
public abstract class Strategy {

/**
     * Método abstrato que deve ser implementado pelas subclasses
     * para gerar o pagamento.
     */

    public abstract void gerarPagamento();

 /**
     * Método que pode ser sobrescrito para implementar a lógica de geração
     * de pagamento com base no check-out e informações do cliente.
     * Por padrão, lança uma exceção de operação não suportada.
     * 
     * @param checkOut o objeto que contém as informações do check-out
     * @param clientePagamento o cliente que está efetuando o pagamento
     * @param idPaga o identificador da transação ou do pagamento
     * @throws UnsupportedOperationException se o método não for sobrescrito
     */
    void gerarPagamento(CheckOut checkOut, Cliente clientePagamento, String idPaga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
