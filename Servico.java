package Classes;

//  Classe Servico que é gerenciada por ServicoAdicional, definindo cada servico individualmente.

import java.time.LocalDateTime;


public class Servico {
    //atributos
    private String nome;        // qual servico sera feito como spa, restaurante, etc...
    private float preco;       // preco do servico
    private LocalDateTime data;     // data do servico
    
    //construtores
    public Servico() {
    }

    public Servico(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.data = LocalDateTime.now();
    }
    
    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //metodo que exibe os dados do servico no console
    public void exibir() {
        System.out.println("\n Nome: "+nome+" Preco: "+preco+" Data: "+data);
    }
}

