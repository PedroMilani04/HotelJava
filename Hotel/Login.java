package Hotel;

public class Login {
    protected Proxy proxy = new Proxy();

    public Login(){
        //Construtor vazio
    }

    public Usuario loginEmail(String email, String senha){
        Usuario usu = proxy.verificacaoEmail(email, senha);
        if(usu != null){
            System.out.println("Login efetuado com sucesso");
            return (FuncionarioHotel)usu;
        }
        else{
            System.out.println("Email ou senha incorretos");
            return null;
        }
    }

    
}
