package lv1;

public class n_spaced_by_x {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		
		long temp = x;
		//주어진 문제에서 x의 범위가 int의 범위를 초과함으로 temp 매개변수를 통한 정수형 변환이 필요하다.
		
		long[] answer = new long[n];
		
		for(int i = 0 ; i < 5 ; i++) {
			
			answer[i] += (x + x * i);
			System.out.print(answer[i]+ " ");
		}
	}
}
