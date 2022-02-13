package ex1;

public class NarakCommand implements Command {
	
    private Character character;

	public NarakCommand(Character character) {
		 this.character =character;
	}

	@Override
	public void execute() {
		character.moveForward();
		character.diagonal();
		character.narak();
		new MainFrame2();
	}

	

}
