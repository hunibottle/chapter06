package algorithm_study.Recursive;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n){
		
		if(n>0) {
			return n * factorial(n-1);
		}else{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(factorial(num));
		
	}

}
