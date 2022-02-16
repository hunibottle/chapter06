package programers;

public class make_min_number {
	
	public static void main(String[] args) {
		int a[] = {5, 1, 9};		
		int b[] = {3, 6, 2};
		int temp_a;
		int temp_b;
		int min_max = 0;
		int total = 0;
		
		for(int j = 0 ; j < a.length - 1 ; j++) {
			for(int i = 0 ; i < a.length -1 ; i++) {
				if(a[i] > a[i+1]) {
					temp_a = a[i];
					a[i] = a[i+1];
					a[i+1] = temp_a;
				}
			}
			for(int i = 0 ; i < b.length -1 ; i++) {
				if(b[i] > b[i+1]) {
					temp_b = b[i];
					b[i] = b[i+1];
					b[i+1] = temp_b;
				}
			}
		}
//		for(int i = 0 ; i < a.length ; i++) {
//			System.out.print(" "+a[i]);
//		}
//		System.out.println(" ");
//		for(int i = 0 ; i < a.length ; i++) {
//			System.out.print(" "+b[i]);
//		}
		for(int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			min_max = a[i] * b[j];
			total += min_max;
		}
		System.out.println(total);
	}
}
// 1.가장 작은 수를 맨앞으로 보낸다. 이후 배열의 한칸씩 땡긴 후 비교한다.
//   외부의 for문이 1씩 증가하기 때문에 앞자리를 비교 안해도 된다.
// 2. 행렬 a는 작은 순서대로 정렬하고 행렬b는 큰수로 정렬 한 후 
//    서로 대칭되는 수를 곱하고 총합을 구한다.
// 결과 -> 테스트 100점, 효율성 0