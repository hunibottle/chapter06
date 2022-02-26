package algorithm_study.stack;

import java.util.Scanner;
import java.util.Stack;

public class backjoon_01 {
	
	public static int[] stack;
	public static int size = 0;
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
		
		stack = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			String str = in.next();
			
			switch(str) {
			case "push":
				push(in.nextInt());
				break;
				
			case "pop":
				sb.append(pop());
				break;
			}
			
		}
		System.out.println(sb);
	}

	private static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size-1];
			stack[size];
			size--;
			return res;
		}
	}

	private static void push(int item) {
		stack[size] = item;
		size++;
		
	}

}
