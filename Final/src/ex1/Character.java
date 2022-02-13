package ex1;

/*
 * 
 * Receiver
   요구 사항을 수행하기 위해 어떤 일을 처리해야 하는지 알고 있는 객체이다.
   ConcreteCommand에서 Receiver를 가지고 있으며 ConcreteCommand는 명령에 따라 Receiver의 기능을 수행한다.
   현재는 카즈야의 동작을 정의함 

 */
public class Character {

	private String name;

    public Character(String name) {
        this.name = name;
        System.out.println(name+"캐릭터가 생성됩니다.");
    }
    public void moveForward () {
		// space 값을 던져주게 되면 n칸 전진된다 .
	    System.out.println("앞으로 전진합니다 ");
	  }
	public void diagonal () {	
	    System.out.println("대각선 아래로 움직입니다."); 
	  }
    public void uppercut () {  
		 System.out.println("풍신어퍼컷!!!!! ");
	  }
    public void  narak () {  
		 System.out.println("나락쓸기!!!!!! ");
	  }
}
