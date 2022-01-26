package programers;

public class watermelon {
	
	public static void main(String[] args) {
		int n = 1;
		char su = '수';
		char park = '박';
		String answer = "";
		
		for(int i = 0 ; i < n ; i++) {
			if(i % 2 == 0) {
				answer += su;
			}else answer += park;
		}
		System.out.println(answer);
	}

}
