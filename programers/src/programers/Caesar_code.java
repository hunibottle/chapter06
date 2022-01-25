package programers;

public class Caesar_code {
	public static void main(String[] args) {
		
		String s = "ABCD";
		int n = 3;
	
		
		for(int i = 0 ; i < s.length() ; i++) {
			String result = s.substring(i,i+1);
			char ch1 = result.charAt(0);
			int num = (int)ch1;
			num = num + n;
			char ch2 = (char)num;
			System.out.println(ch2);
		}
		
	}
}
