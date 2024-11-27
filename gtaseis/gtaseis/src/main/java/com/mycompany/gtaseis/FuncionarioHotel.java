package com.mycompany.gtaseis;

public class FuncionarioHotel extends Usuario {
    private String cargo;
    private double salario;

    public FuncionarioHotel(String nome, String email, String cpf, String cargo, double salario) {
        super(nome, email, cpf);  // construtor da superclasse (Usuario)
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInformacoes() {
        //
    }

}
