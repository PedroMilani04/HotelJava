package Hotel;

public class Proxy {
    protected Cadastro cad = new Cadastro();

    public Proxy(){
        //Construtor vazio
    }

    public Usuario verificacaoEmail(String email, String senha){
        if(Cadastro.verificarEmailESenha(email, senha)){
            Usuario usu = Cadastro.returnUsuarioEmail(email); //Pego o usuário com o email
            return usu; //Retorno o usuário caso a senha e email estejam corretos
        }
        System.out.println("Email ou senha incorretos"); //Não posso falar qual está incorreto para não dar brecha para hackers
        return null;
    }

}
