package alogorithm_study;

import java.util.Scanner;

public class mid_num {
	
	static int mid3(int a, int b, int c) {
		int mid_num = 0;
		
		mid_num = a;
		
		if(a>b) {
			if(b>c) {
				mid_num = b;
			}else mid_num  = a;
		}
		else if(a>c) {
			if(c>b) {
				mid_num = c;
			}else mid_num = a;
		}
		else {
			if(b>c) {
				mid_num = c;
			}else mid_num = b;
		}
		return mid_num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		

		int a, b, c;
		int max_num=0 ;
		System.out.println("세 정수의 중간값을 구합니다.");
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		
		System.out.print("b의 값 : ");
		b = scan.nextInt();
		
		System.out.print("c의 값 : ");
		c = scan.nextInt();
		
		
		System.out.println("중간값은 "+mid3(a,b,c)+"입니다.");
		
	}
	
}
