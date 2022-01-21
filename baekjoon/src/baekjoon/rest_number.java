package baekjoon;

import java.util.Scanner;

public class rest_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] number =new int[10];
		int[] rest_number = new int[10];
		int s1=0;
		int s2=10;
		
		for(int i = 0 ; i < number.length ; i++) {
			number[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < number.length ; i++) {
			rest_number[i] = number[i] % 42;
		}
		
		for(int i = 0 ; i < rest_number.length ; i++) {
			for(int j =i+1 ; j < rest_number.length ; j++) {
				if(rest_number[i] == rest_number[j]) {
					s1++;
				}
			}
			if(s1> 0) {
				s2--;
				s1=0;
			}
		}
		System.out.println(s2);
	}
	
}
