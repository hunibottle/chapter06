package Command2;


import java.util.ArrayList;

public class Command_Skill_2 extends Command{
  private Character character = new Character();
  private Narak narak = new Narak();
  private ArrayList<Command> commands = new ArrayList<Command>();
 


  public void addCommand (Command command) {
    commands.add(command);
  }
  
  public void start () {
    for (Command command : commands) {
      command.setRobot(character);
      command.execute();
      
    }
    narak.narak();
    new MainFrame2();
  }

@Override
public void execute() {
	// TODO Auto-generated method stub
	
}
}