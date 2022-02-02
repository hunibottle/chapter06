package programers;

import java.util.Scanner;

public class star_Pyramid {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		int blank =0;
		int star = 0;
		
		for(int i = 0 ; i < n ; i++) {
			blank = n - i;
			star = 2 * i + 1;
			for(int j = 0 ; j < blank ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < star ; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
