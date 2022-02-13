package ex1;

public class PungshinCommand implements Command {
	
	private Character character;
    public PungshinCommand(Character character) {
        this.character =character;
    }

	@Override
	public void execute() {
		character.moveForward();
		character.diagonal();
		character.uppercut();
		new MainFrame();
	}


}
