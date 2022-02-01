package programers;

public class Expressing_numbers {
	
	public static void main(String[] args) {
		int n = 20;
		int count = 0;
		int sum=0;
		int r = 0;
	
		for(int i = 1 ; i <= n ; i++) {
			sum = i;
			r = i;
			while(sum <= n) {
				if(sum == n) {
					count++;
				}
				r++;
				sum +=r;
				System.out.println(sum);
			}
		}
		
		System.out.println(count);
	}

}
