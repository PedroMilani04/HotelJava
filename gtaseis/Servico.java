package com.mycompany.gtaseis;

//  Classe Servico que é gerenciada por ServicoAdicional, definindo cada servico individualmente.
import java.time.LocalDateTime;

public class Servico {

    //atributos
    private String nome;        // qual servico sera feito como spa, restaurante, etc...
    private double valor;       // preco do servico
    private LocalDateTime data;     // data do servico

    //construtores
    public Servico() {
    }

    public Servico(String nome) {
        this.nome = nome;
        this.data = LocalDateTime.now();
        switch (nome) {
            case "lavanderia":
                this.valor = 25;
                break;
            case "spa":
                this.valor = 100;
                break;
            case "cafe da manha":
                this.valor = 20;
                break;
            case "cafe da tarde":
                this.valor = 15;
                break;
            case "almoco":
                this.valor = 30;
                break;
            case "janta":
                this.valor = 30;
                break;
            case "limpeza":
                this.valor = 60;
                break;
        }
    }

    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    //retorna somente o dia do servico como int
    public int getDia() {
        return this.data.getDayOfMonth();
    }

    //metodo que exibe os dados do servico no console
    public void exibir() {
        System.out.println("\n Nome: " + nome + " Valor: " + valor + " Data: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear());
    }
}
