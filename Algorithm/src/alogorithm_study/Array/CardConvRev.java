package alogorithm_study.Array;

public class CardConvRev {
	
	static int CardConvR(int x, int r, char[] d) {	
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
			
		}while(x!=0);
		
		return digits;
	}

	public static void main(String[] args) {
		
		
		
		int no = 59;
		int cd = 8;
		int dno;
		char[] cno = new char[32];
		
		dno = CardConvR(no, cd, cno);
		
		for(int i = dno - 1; i >=0 ; i--) {
			System.out.print(cno[i]);
		}
		
	}
	
}
