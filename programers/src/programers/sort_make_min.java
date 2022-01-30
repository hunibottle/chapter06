package programers;

import java.util.Arrays;

public class sort_make_min {
	
	public static void main(String[] args) {
		int a[] = {5, 1, 9};		
		int b[] = {3, 6, 2};
		Arrays.sort(a);
		Arrays.sort(b);
		int total = 0;
		int sum;
		for(int i = 0, j = b.length - 1 ; i < a.length ; i++, j--) {
			sum = a[i] * b[j];
			total += sum;
			System.out.println(a[i]+" "+b[j]);
		}
		System.out.println(total);
	}
}
