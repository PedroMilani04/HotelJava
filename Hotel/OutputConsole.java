package Hotel;

public class OutputConsole implements OutputInterface{
    @Override
    public void display(String message){
        System.out.println(message);
    }
}
