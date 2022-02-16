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

//Arrays import 하기
//sort 함수는 [ Arrays.sort(a) ]로 사용 할 수 있고 배열 a를 올림차순으로 정렬한다.
//만약 배열 a 가 스트링일 경우 한글 -> ㄱ,ㄴ,ㄷ 순 / 영어 -> a, b, c 순으로 정렬한다.

