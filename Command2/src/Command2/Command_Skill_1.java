package Command2;


import java.util.ArrayList;

public class Command_Skill_1 extends Command{
  private Character character = new Character();
  private Upercut up = new Upercut();
  private ArrayList<Command> commands = new ArrayList<Command>();
  
  public void addCommand (Command command) {
    commands.add(command);
  }
  
  public void start () {
    for (Command command : commands) {
    
      command.setRobot(character);
      command.execute();
      
    }
    up.uppercut();
    new MainFrame();
  }


@Override
public void execute() {
	// TODO Auto-generated method stub
	
}
}