package programers;

import java.lang.Math;

public class minimun_multiple {
	
	public static int gcd(int a, int b) {
		
		int x = Math.max(a,b);
		int y = Math.min(a,b);
		
		while(x % y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return y;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 6, 8, 14};
		
		int answer = arr[0];
		
		for(int i = 1; i < arr.length ; i++) {
			
			int gcd = gcd(answer, arr[i]);
			
			answer = answer * arr[i] / gcd;
			
		}
		System.out.println(answer);
	}
	
}

//최소공배수 문제는 유클리드 호제법 이라는 알고리즘을 숙지하고 있을때 쉽게 풀 수 있다.
//ex) 198 x 120 인 직사각형의 바닥을, 정사각형의 타일로 채우려고 한다. 
//    최소의 타일을 사용하려면, 정사각형 한변의 길이를 얼마로 해야 하는가?

