package Command2;


public class MyProgram {

  public static void main(String[] args) {
    Command_Skill_1 skill1 = new Command_Skill_1 ();
    Command_Skill_2 skill2 = new Command_Skill_2 ();
    
    
    skill1.addCommand(new MoveForwardCommand(1));
    skill1.addCommand(new DiagonalCommand());
    
    skill2.addCommand(new MoveForwardCommand(2));
    skill2.addCommand(new DiagonalCommand());
    

    skill1.start();
    System.out.println("\n");
    skill2.start();
    

    // 2 칸 전진
    // 왼쪽으로 방향전환
    // 1 칸 전진
    // 오른쪽으로 방향전환
    // 앞의 물건 집어들기
  }
}