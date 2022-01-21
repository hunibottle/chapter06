package alogorithm_study;

import java.util.Scanner;

public class max_num4 {
	
	static int max4(int a, int b, int c, int d) {
		
		int max_num;
		
		max_num = a;
		
		if(a<b) {
			max_num = b;
			if(b<c) {
				max_num = c;
				if(c<d) {
					max_num = d;
				}
			}
		}
		else if(a<c) {
			max_num = c;
			if(c<d) {
				max_num = d;
			}
		}
		else max_num = d;
		
		return max_num;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("4가지 수를 입력 !");
		
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		
		System.out.print("b의 값 : ");
		b = scan.nextInt();
		
		System.out.print("c의 값 : ");
		c = scan.nextInt();
		
		System.out.print("d의 값 : ");
		d = scan.nextInt();
		
		System.out.println("최대값은 "+max4(a,b,c,d)+"입니다.");
	}

}
