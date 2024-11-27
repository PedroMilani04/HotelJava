package com.mycompany.gtaseis;


/**
 * Representa um cliente do sistema, com informações básicas como nome, CPF, idade e telefone.
 * Esta classe é utilizada para gerenciar os dados dos clientes e fornecer métodos para manipulação.
 */
public class Cliente{
    //atributos do cliente/usuário
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String telefone;
    

    /**
     * Construtor que inicializa o cliente com os dados fornecidos.
     * 
     * @param nome o nome do cliente
     * @param cpf o CPF do cliente
     * @param idade a idade do cliente
     * @param telefone o número de telefone do cliente
     */
    public Cliente(String nome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    //getters e setters
    /**
     * Retorna o nome do cliente.
     * 
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    }

     /**
     * Define o nome do cliente.
     * 
     * @param nome o novo nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna o CPF do cliente.
     * 
     * @return o CPF do cliente
     */
    public String getCpf(){
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     * 
     * @param cpf o novo CPF do cliente
     */
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
     /**
     * Retorna a idade do cliente.
     * 
     * @return a idade do cliente
     */
    public int getIdade() {
        return idade;
    }
    /**
     * Define a idade do cliente.
     * 
     * @param idade a nova idade do cliente
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * Retorna o telefone do cliente.
     * 
     * @return o telefone do cliente
     */
    public String getTelefone(){
        return telefone;
    }
     /**
     * Define o telefone do cliente.
     * 
     * @param telefone o novo telefone do cliente
     */
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
      /**
     * Exibe as informações do cliente no formato de texto.
     * Inclui nome, CPF, idade e telefone.
     */
    public void exibirDados() {
        System.out.println("Nome: "+nome+"CPF: "+cpf+"Idade: "+idade+"Telefone: "+telefone);
    }
}
