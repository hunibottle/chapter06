package algorithm_study.Recursive;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1,x,6-x-y);
		}
		System.out.println("원반["+no+"]을 " + x + "기둥 에서 " +y+"기둥으로 이동한다.");
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}//재귀 함수 순서 파악 다시 하기
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원반의 갯수 : ");
		int no = scan.nextInt();
		move(no,1,3);
		
	}

}
