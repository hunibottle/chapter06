package programers;

public class Fibonacci {

	public static void main(String[] args) {
		int answer = 0;
		int n = 5;
		int[] arr = new int[n+1];
		int temp = 0;
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2 ; i <= n ; i++) {
			arr[i] =((arr[i-1] + arr[i-2])) % 1234567;
			temp = arr[i];
		}
		System.out.println(temp);
	}
}

//포인트는 arr[i]값을 바로 1234567로 나눈 나머지 값으로 바꿔줘야 했다.
//왜냐하면 int의 범위를 넘어서면 오류가 나기 때문이다.
