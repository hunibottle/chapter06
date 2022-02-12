package Command2;


abstract class Command {
  protected Character character;

  public void setRobot (Character character) {
    this.character =  character;
  }
  public abstract void execute ();
}

class MoveForwardCommand extends Command {
  int space;
  public MoveForwardCommand (int _space) { 
    space = _space; 
  }
  public void execute () {
	character.moveForward(space);
  }
}


class DiagonalCommand extends Command {
	  public void execute () {
		 character.diagonal();
	  }
}




/*
class TurnCommand extends Command {
  Robot.Direction direction;
  public TurnCommand (Robot.Direction _direction) {
    direction = _direction;
  }
  public void execute () {
    robot.turn(direction);
  }
}

class PickupCommand extends Command {
  public void execute () {
    robot.pickup();
  }
 */

