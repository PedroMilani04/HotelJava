package com.mycompany.gtaseis;

// Superclasse Servico que serve como modelo para suas subclasses
import java.time.LocalDateTime;

public abstract class Servico {
    private String nome;
    private double valor;
    private LocalDateTime data;

    public Servico(String nome){
        this.nome = nome;
        this.data = LocalDateTime.now();
    }

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

    public int getDia() {
        return this.data.getDayOfMonth();
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void exibir() {
        System.out.println("\n Nome: " + nome + " Valor: " + valor + " Data: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear());
    }
}
