package com.mycompany.gtaseis;
import java.util.Scanner;
import java.util.Hashtable;

public class Cadastro {
    protected String email;
    protected String senha;
    protected String confirmacao;
    private static Hashtable<Cadastro, Usuario> ht_cad_for_usu = new Hashtable<Cadastro, Usuario>(); //Criando uma hashtable para armazenar os cadastros e os usuarios (acha o usu usando o cadas)
    private static Hashtable<String, Cadastro> ht_email_for_cad = new Hashtable<String, Cadastro>(); //Criando uma hashtable para armazenar os emails e os cadastros (acha o cadas usando o email)
  


    // Bloco de inicialização estático
    static {
        Cadastro adminMaster = new Cadastro("adm@adm.com", "adminbiblioteca", "adminbiblioteca");
        FuncionarioHotel dono = new FuncionarioHotel("ADM", "adm@adm.com", "1111111111",  "DONO", 0);
        ht_cad_for_usu.put(adminMaster, dono);
        ht_email_for_cad.put("adm@adm.com", adminMaster);
    }

    public Cadastro(String email, String senha, String confirmacao){
        this.email = email;
        if(senha.length() >= 8 && senha.equals(confirmacao)){ //Verifica se a senha tem 8 ou mais caracteres e se a senha e a confirmação são iguais
            this.senha = senha;
        }else{
            throw new IllegalArgumentException("Senhas não conferem"); //Bloqueia a criação do objeto por senha e confirmação diferentes
        }
    }

    public Cadastro(){
        //Construtor vazio 
    }

    public String getSenha(){
        return senha;
    }

    public String getEmail(){
        return email;
    }

    public void criarConta(){ //Criação de conta e verificação de dados para não bater em outro na hora de criar
        String nome;
        String CPF;
        String cargo;
        double salario;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        email = input.nextLine();

        while(ht_email_for_cad.containsKey(email)){
            System.out.println("Email já cadastrado. Por favor, escolha outro.");
            email = input.nextLine();
        }

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite seu CPF: ");
        CPF = input.nextLine();

        while(CPF.length() != 11){
            System.out.println("CPF inválido, tente novamente");
            CPF = input.nextLine();
        }

        System.out.println("O cargo: ");
        cargo = input.nextLine();

        System.out.println("Digite sua senha: ");
        senha = input.nextLine();

        while(senha.length() <= 8){
            System.out.println("Senha muito curta, tente novamente");
            senha = input.nextLine();
        }

        System.out.println("Confirme sua senha: ");
        confirmacao = input.nextLine();

        while(!senha.equals(confirmacao)){
            System.out.println("Senhas não conferem, tente novamente");
            System.out.println("Digite sua senha: ");
            senha = input.nextLine();
            System.out.println("Confirme sua senha: ");
            confirmacao = input.nextLine();
        }

        System.out.println("Digite o salário: ");
        salario = input.nextDouble();


        Cadastro cadastro = new Cadastro(email, senha, confirmacao);

        FuncionarioHotel funcNew = new FuncionarioHotel(nome, email, CPF, cargo, salario);
        ht_cad_for_usu.put(cadastro, funcNew);
        
        //tecnicamente... é pra funcionar, vamos ver.

        //Se isso funcionar eu sou um gênio
        ht_email_for_cad.put(email, cadastro);


        System.out.println("Conta criada com sucesso " +nome + "!");
    }


    public static boolean verificarEmailESenha(String email, String senha) {
        if (ht_email_for_cad.containsKey(email)) {
            Cadastro cadastro = ht_email_for_cad.get(email);
            return cadastro.getSenha().equals(senha);
        }
        return false;
    }

    public static Usuario returnUsuarioEmail(String email) {
        Cadastro cad = ht_email_for_cad.get(email);
        return ht_cad_for_usu.get(cad);
    }

}
