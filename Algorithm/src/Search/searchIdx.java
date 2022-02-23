package Search;

import java.util.Scanner;

public class searchIdx {
	
	static int searchidx(int[] a, int n, int key) {
		
		int k = 0;
		int count = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == key) {
				count++;
			}
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1, 9, 2, 9, 4, 6, 7, 9};
		int num = 8;
		
		int key = scan.nextInt();
		System.out.println(key+ " 값은 몇 개가 있을까요?");
		
		int idx = searchidx(arr, num, key);
		System.out.println(idx);
	}
	
}
