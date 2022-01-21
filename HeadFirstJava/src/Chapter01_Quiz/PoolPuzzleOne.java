package Chapter01_Quiz;

public class PoolPuzzleOne {
	
	public static void main(String[] args) {
		int x = 0;
		while(x<3) {
			System.out.print("a");
			if(x<1) {
				System.out.println(" nosie");
			}
			x = x + 1;
			
			if(x==1) {
				System.out.println("annoys");
				x++;
			}
			if(x>1) {
				System.out.print("a");
				System.out.print("n");
				System.out.println(" oyster");
				x++;
			}
			
		}
	}

}
