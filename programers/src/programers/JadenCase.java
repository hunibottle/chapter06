package programers;

public class JadenCase {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		
		StringBuilder answer = new StringBuilder();
		
		String first = s.charAt(0)+"";
		answer.append(first.toUpperCase());
		
		for(int i = 1 ; i < s.length(); i++) {
			String now = s.charAt(i)+"";
			if(now.equals(" ")) {
				answer.append(" ");
			}else if (s.charAt(i-1) == ' ') {
				answer.append(now.toUpperCase());
			}else {
				answer.append(now.toLowerCase());
			}
		}
		System.out.println(answer.toString());
	}

}
