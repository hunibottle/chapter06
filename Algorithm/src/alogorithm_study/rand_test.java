package alogorithm_study;

import java.util.Random;

public class rand_test {
	
	public static int max(int[] a) {
		int max = a[0];
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]>max)max = a[i];		
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] height = new int[5];
		for(int i = 0 ; i < height.length ; i++) {
			height[i] = rand.nextInt(90);
			System.out.println(height[i]);
		}
		System.out.println("최댓값은 : " + max(height));
	}
}

//배운점은 배열의 요소값을 함수에 대입할 때 메소드를 어떻게 작성해야 하는지 알 수 있었다.
//Random 사용방법에 대해 알 수 있었다. 또한 rand.nextInt(x)에서 x에 의미에 대해서 알 수 있었고 이후 활용할 수 있는 분야
//에 대해서 알 수 있었다.
