package programers;

public class Caesar_code {
	public static void main(String[] args) {
		
		String s = "ABCD";
		int n = 3;
		String answer = "";		
		for(int i = 0 ; i < s.length(); i++) {
			char charnum = s.charAt(i);
			if(charnum >= 'a' && charnum <= 'z') {
				if(charnum + n > 'z') {
					answer += (char)(charnum-26+n);
				}else {
					answer += (char)(charnum+n);
				}
			}
			else if(charnum >= 'A' && charnum <= 'Z') {
				if(charnum + n > 'Z') {
					answer += (char)(charnum-26+n);
				}else {
					answer += (char)(charnum+n);
				}
			}
			
		}
		 
		
	}
		
}
