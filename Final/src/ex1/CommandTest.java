package ex1;

public class CommandTest {
    public static void main(String[] args) {

        RemoteControl control = new RemoteControl(null);
        Character kazuya = new Character("kazuya");
        
        PungshinCommand PC = new PungshinCommand(kazuya);
        NarakCommand NC = new NarakCommand(kazuya);
        
       
        
        control.setCommand(PC);
        control.onButtonClick(PC);
        /*
        control.setCommand(NC);
        control.onButtonClick(NC);
        */
        
        
    }
}