package Hotel;

public class Cliente{
    //atributos do cliente/usuário
    protected String nome;
    protected String cpf;
    protected int idade;
    protected int telefone;
    

    //construtor
    public Cliente(String nome, String cpf, int idade, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    //getters e setters
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //cpf
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    //idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //telefone
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    // Método para mostrar as informações da pessoa
    public void exibirDados() {
        System.out.println("Nome: "+nome+"CPF: "+cpf+"Idade: "+idade+"Telefone: "+telefone);
    }
}
