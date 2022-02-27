package algorithm_study.stack;

import java.util.Scanner;
import java.util.Stack;

public class stack_function_ex {
	
	public static Stack<Integer> stack = new Stack<>();
	public static Scanner scan = new Scanner(System.in);
	public static int x;
	
	public static void main(String[] args) {
		
		int T = scan.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			String str = scan.next();
			
			switch(str) {
			case "push":
				push();
				break;
			case "pop":
				pop();
				break;
			case "top":
				top();
			}
		}
	}
	
	public static void push() {
		x = scan.nextInt();
		if(x == 0) {
			pop();
		}else stack.push(x);
		System.out.println(stack);
	}
	
	public static void pop() {
		stack.pop();
		System.out.println(stack);
	}
	public static void top() {
		System.out.println(stack.peek());
	}
}
