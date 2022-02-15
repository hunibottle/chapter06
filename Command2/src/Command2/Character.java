package Command2;

/*
로봇의 동작을 정의하는 클래스
1.로봇의 움직임
2.로봇의 방향전환
3.로봇의 기술  
*/
public class Character {
	
	private Command command;

	public void setCommand(Command command){
        this.command = command;
    }
	
  public enum Direction { LEFT, RIGHT, DIAGONAL}; // 허용가능한 값이 제한되기 때문에 신입개발자가 실수할 확률이 훨씬 줄어들게 된다. 
 

  public void moveForward (int space) {
	// space 값을 던져주게 되면 n칸 전진된다 .
    System.out.println(space + " 칸 전진");
  }
  
  public void diagonal () {	
	    System.out.println("대각선 아래로 움직입니다.");
	  }






/*
  public void turn (Direction _direction) {
    System.out.println(
      (_direction == Direction.LEFT ? "왼쪽" : "오른쪽") + "으로 방향전환"
    );
  }

  public void pickup () {
    System.out.println("앞의 물건 집어들기");
  }
*/  
 }