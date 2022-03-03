package algorithm_study.Recursive;

import java.util.Scanner;

public class EuclidGCD {
	
	static int euclidGcd(int a, int b) {
		
		if(a % b != 0) {
			return euclidGcd(b, a % b);
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println(x+"와"+y+"의 최대공약수는 : "+euclidGcd(x,y));
		
	}

}
