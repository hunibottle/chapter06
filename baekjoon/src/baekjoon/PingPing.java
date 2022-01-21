package baekjoon;

import java.util.Scanner;

public class PingPing {
	
	public static void main(String[] args) {
		
		int A, B, V;
		int day=0;
		int count = 0;
		int ping = 0;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		V = scan.nextInt();
		
		while(ping < V) {
		if( ping < V) {
			count = A - B;
			ping = ping + count;
			if(ping != V) {
				day++;
				}
			}
		}
		System.out.println(day);
	}

}
