package algorithm_study.Search;

public class binSearchX {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,7,7,7,8,8,9,9};
		int num = 11;
		int key = 7;
		int a;
		a = binserchx(arr, num, key);
		System.out.println(a);
	}
	
	static int binserchx(int[] x, int n, int key) {
		
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if(x[pc] == key) {
				do {
					
					
				}while(x[pc] != key);
			}else if(x[pc] > key) {
				pr = pc - 1;
			}else pl = pc + 1;
			
		}while(pl<=pr);
		
		return -1;
	}
	

}
