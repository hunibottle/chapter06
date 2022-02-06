package alogorithm_study.Array;

public class String_array {
	
	public static void main(String[] args) {
			String s = "1234";
			boolean answer = true;
			boolean no_answer = false;
			int count = 0;
			
			for(int i = 0 ; i < s.length() ; i++) {
				if((s.length() == 4 || s.length() == 6) && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					continue;
				}else {
					count++;
					break;
				}
			}
			if(count != 0) {
				System.out.println(no_answer);
			}else System.out.println(answer);
			
	}

}
