package com.mycompany.gtaseis;

/**
 * Representa um funcionário do hotel, estendendo a classe {@link Usuario}.
 * Um funcionário possui informações como cargo e salário, além dos atributos herdados de {@link Usuario}.
 */
public class FuncionarioHotel extends Usuario {
    private String cargo;
    private double salario;


  /**
     * Construtor que inicializa um novo funcionário com as informações fornecidas.
     * 
     * @param nome o nome do funcionário
     * @param email o email do funcionário
     * @param cpf o CPF do funcionário
     * @param cargo o cargo do funcionário no hotel
     * @param salario o salário do funcionário
     */
    public FuncionarioHotel(String nome, String email, String cpf, String cargo, double salario) {
        super(nome, email, cpf);  // construtor da superclasse (Usuario)
        this.cargo = cargo;
        this.salario = salario;
    }
/**
     * Retorna o cargo do funcionário.
     * 
     * @return o cargo do funcionário
     */
    public String getCargo() {
        return cargo;
    }

/**
     * Define o cargo do funcionário.
     * 
     * @param cargo o novo cargo do funcionário
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
/**
     * Retorna o salário do funcionário.
     * 
     * @return o salário do funcionário
     */
    public double getSalario() {
        return salario;
    }
/**
     * Define o salário do funcionário.
     * 
     * @param salario o novo salário do funcionário
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
/**
     * Exibe as informações completas do funcionário, incluindo nome, email, CPF, cargo e salário.
     */
    public void exibirInformacoes() {
        //
    }

}
