package com.mycompany.gtaseis;

// Superclasse Servico que serve como modelo para suas subclasses
import java.time.LocalDateTime;


/**
 * Representa um serviço oferecido por um hotel. A classe armazena informações sobre o nome
 * do serviço, seu valor e a data em que o serviço foi realizado ou solicitado. 
 * Esta é uma classe abstrata não fazendo distinção entre serviços exclusivos de hospedes
 */
public abstract class Servico {
    private String nome;
    private double valor;
    private LocalDateTime data;


  /**
     * Construtor da classe Servico, inicializa o nome do serviço e registra a data atual
     * como a data de solicitação ou realização do serviço.
     * 
     * @param nome O nome do serviço.
     */
    public Servico(String nome){
        this.nome = nome;
        this.data = LocalDateTime.now();
    }

/**
     * Retorna o nome do serviço.
     * 
     * @return O nome do serviço.
     */
    public String getNome() {
        return nome;
    }


   /**
     * Define o nome do serviço.
     * 
     * @param nome O novo nome do serviço.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
     * Retorna o valor do serviço.
     * 
     * @return O valor do serviço.
     */
    public double getValor() {
        return valor;
    }


    /**
     * Define o valor do serviço.
     * 
     * @param valor O novo valor do serviço.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Retorna o dia do mês em que o serviço foi realizado ou solicitado.
     * 
     * @return O dia do mês da data do serviço.
     */
    public int getDia() {
        return this.data.getDayOfMonth();
    }

/**
     * Define a data em que o serviço foi realizado ou solicitado.
     * 
     * @param data A data do serviço.
     */
    public void setData(LocalDateTime data) {
        this.data = data;
    }

/**
     * Exibe as informações do serviço, incluindo seu nome, valor e a data em que foi realizado ou solicitado.
     * A data é exibida no formato dia/mês/ano.
     */
    public void exibir() {
        System.out.println("\n Nome: " + nome + " Valor: " + valor + " Data: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear());
    }
}
