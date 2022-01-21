package programers;

public class lack_cost {
	
	public static void main(String[] args) {
		
		int price = 3;
		int money = 20;
		int count = 2;
		int result;
		
		int sum;
		int cost = 0;
		
		for(int i = 1 ; i < count + 1 ; i++) {
			sum = price * i ;
			cost = cost + sum;
			sum=0;
		}
		
		result = cost - money;
		if(result > 0) {
			System.out.println(result);
		}else 	System.out.println("0");
		
	}

}
