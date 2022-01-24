package programers;

import java.util.Scanner;

public class prime_number {
	
	public static void main(String[] args) {
		int count = 0 ;
		int sum = 0;
		int a ;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 3; i < n+1 ; i++) {
			for(int j = 2 ; j < i-1 ; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count > 0) {
				sum++;
			}
			count=0;
		}
		a = n - 1 - sum;
		System.out.println(a);

	}
}
