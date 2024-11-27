package Hotel;

public class OutputFactory {
    private static OutputFactory instance;
    
    private OutputFactory(){

    }
    
    public static OutputFactory getInstance(){
        if(instance == null)
            instance = new OutputFactory();

        return instance;
    }
    
    public static OutputInterface getTipoOutput(String tipoOutput){
        if(tipoOutput.equals("console"))
            return new OutputConsole();

        return null;
    }
}
