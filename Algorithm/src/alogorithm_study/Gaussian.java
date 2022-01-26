package alogorithm_study;

public class Gaussian {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		for(int i = a ; i <= b ; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println(sumof(a,b));
	}

}
