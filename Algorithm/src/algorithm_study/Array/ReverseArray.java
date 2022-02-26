package algorithm_study.Array;

public class ReverseArray {

	
	public static void Reverse(int[] a) {
		for(int i = 0 ; i < a.length/2 ; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {	
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void main(String[] args) {
		
		int[] x = {1, 3, 5, 7, 9};
		
		Reverse(x);
		
		for(int i = 0 ; i < x.length ; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
