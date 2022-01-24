package Transportation_Design;

public abstract class Transportation {
	
	SpeedLevel speedLevel;
	MovePossible movePossible;
	
	public Transportation() {
		
	}
	
	public abstract void display();
	
	public void performSpeed() {
		speedLevel.speed();
	}
	
	public void performMove() {
		movePossible.move();
	}
	
	public void drive() {
		System.out.println("All Transportation can Drive ! ");
	}

}
