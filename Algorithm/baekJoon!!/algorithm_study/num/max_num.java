package algorithm_study;

import java.util.Scanner;

public class max_num {
		
	static int max_num3(int a, int b, int c) {
		
		int max_num = a;
		if(a < b) {
			max_num = b;
			if(b < c) {
				max_num = c;
			}
		}
		return max_num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		

		int a, b, c;
		int max_num=0 ;
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		
		System.out.print("b의 값 : ");
		b = scan.nextInt();
		
		System.out.print("c의 값 : ");
		c = scan.nextInt();
		
		
		System.out.println("최대값은 "+max_num3(a,b,c)+"입니다.");
		
	}

}
