package Classe7;

public class FuncionarioHotel extends Usuario {
    private String cargo;
    private double salario;

    public FuncionarioHotel(String nome, String cpf, String email, String cargo, double salario) {
        super(nome, cpf, email);  // construtor da superclasse (Usuario)
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
