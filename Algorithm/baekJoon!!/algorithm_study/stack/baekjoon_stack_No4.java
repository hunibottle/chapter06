package algorithm_study.stack;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_stack_No4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			if(scan.equals(".")) {
				break;
			}
			System.out.println(solve(scan.nextLine()));
		}
		
	}

	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(c == '(' || c== '[') {
				stack.push(c);
			}
			else if(c==')'){
				if(stack.empty() || stack.peek() != '(') { 
					//stack.peek는 stack의 가장 상단의 값을 읽어온다.
					return "NO";
				}
				else stack.pop();
			}
			else if(c==']'){
				if(stack.empty() || stack.peek() != '[') {
					return "NO";
				}
				else stack.pop();
			}
			System.out.println(stack);
		}
		if(stack.empty()) {
			return "YES";
		}else return "NO";
	}
	
}
