package programers;

public class Caesar_code {
	public static void main(String[] args) {
		
		String s = "ABCD";
		int[] arr = new int[s.length()];
		
		for(int i = 0 ; i < s.length() ; i++) {
			arr[i] = s.charAt(i) - '0';
			System.out.println(arr[i]);
		}
		 
		
	}
		
}
