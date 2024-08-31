/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Fernando
 */
public class ServicoAdicional {
    // atributos
    private String descricao; //podendo ser spa, restaurante, limpeza diária
    private float valor; //valor do serviço adicional em si
    private Cliente cliente; //Cliente que solicitou o servico adicional
    
    // construtor
    public ServicoAdicional(String descricao, float valor, Cliente c) {
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = c;
    }

    // getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } 
}
