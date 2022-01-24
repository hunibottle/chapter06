package Transportation_Design;

public class Car extends Transportation {

	public Car() {
		speedLevel = new MiddleSpeed();
		movePossible = new BackPossible();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Car !");
		
	}
	

}
