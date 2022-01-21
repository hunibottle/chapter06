package alogorithm_study;

import java.util.Scanner;

public class min_num4 {
	
		static int min4(int a, int b, int c, int d) {
			
			int min_num = a;
			
			if(a>b) {
				if(b>c) {
					if(c>d) {
						min_num =d;
					}else min_num = c;
				}
				else if(b>d) {
					min_num = d;
				}
				else min_num = b;
			}
			else if(a>c) {
				if(c>d) {
					min_num = c;
				}else min_num = d;
			}
			else if(a>d) {
				min_num = d;
			}
			else min_num = a;
			
			return min_num;
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
		
		System.out.println("최소값은 "+min4(a,b,c,d)+"입니다.");
		}

}
