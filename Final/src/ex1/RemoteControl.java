package ex1;

public class RemoteControl {

    private Command onCommand;
    
    public RemoteControl(Command onCommand) { //생성
       setCommand(onCommand);
    }

    public void setCommand(Command newCommand) {
        this.onCommand = newCommand;
    }

    public void onButtonClick(Command onCommand) {
        System.out.println("--------------------------------");
        onCommand.execute();
        System.out.println();
    }

  

  
}