package lv1;

public class n_spaced_by_x {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		
		long[] answer = new long[n];
		
		for(int i = 0 ; i < 5 ; i++) {
			
			answer[i] += (x + x * i);
			System.out.print(answer[i]+ " ");
		}
	}
}
