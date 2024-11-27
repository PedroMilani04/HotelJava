package com.mycompany.gtaseis;


/**
 * Classe que representa um usuário no sistema.
 * Cada usuário possui um identificador único gerado automaticamente,
 * além de informações como nome, email e CPF.
 */
public class Usuario {
    protected static int nextID = 1;
    protected String nome;
    protected String email;
    protected String CPF;
    protected int ID; //ID n segnifica o numero de usuarios cadastrados, mas sim o numero de usuarios criados, pode haver eliminacao de usuarios


/**
     * Construtor que inicializa um usuário com os dados fornecidos.
     * O ID é gerado automaticamente e incrementado com base no número de usuários criados.
     * 
     * @param nome o nome do usuário
     * @param email o email do usuário
     * @param CPF o CPF do usuário (deve ter 11 dígitos)
     */
    public Usuario(String nome, String email, String CPF) {
        this.nome = nome;
        this.email = email;
        // if(CPF.length() != 11){
        //     throw new IllegalArgumentException("CPF inválido"); //Bloqueia a criação do objeto por invalidez de CPF
        // }
        this.CPF = CPF;
        this.ID = nextID++;
    }


    /**
     * Construtor vazio
     */
    public Usuario(){

    }
/**
     * Retorna o CPF do usuário.
     * 
     * @return o CPF do usuário
     */
    public String getCpf(){
        return CPF;
    }

/**
     * Retorna o nome do usuário.
     * 
     * @return o nome do usuário
     */
    public String getNome(){
        return nome;
    }

/**
     * Retorna o email do usuário.
     * 
     * @return o email do usuário
     */
    public String getEmail(){
        return email;
    }

/**
     * Retorna o ID único do usuário.
     * 
     * @return o ID do usuário
     */
    public int getID(){
        return ID;
    }

/**
     * Define o CPF do usuário.
     * 
     * @param CPF o CPF do usuário (deve ter 11 dígitos)
     * @throws IllegalArgumentException se o CPF não tiver 11 dígitos
     */
    public void setCpf(String CPF){
        if(CPF.length() != 11){
            throw new IllegalArgumentException("CPF inválido"); //Bloqueia a modificação, caso seja necessario, por invalidez de CPF
        }
        this.CPF = CPF;
    }

/**
     * Define o nome do usuário.
     * 
     * @param nome o nome do usuário
     */
    public void setNome(String nome){
        this.nome = nome;
    }

/**
     * Define o email do usuário.
     * 
     * @param email o email do usuário
     */
    public void setEmail(String email){
        this.email = email;
    }

/**
     * Define manualmente o ID do usuário.
     * 
     * @param ID o novo ID do usuário
     */
    public void setId(int ID){ //Usar somente para teste, provavelmente dará 
        this.ID = ID;           //erro caso seja usado em produção
    }

}
