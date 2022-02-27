package algorithm_study.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_stack_No2 {
	
	public static ArrayList<Integer> list = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	public static int size = 0;
	public static int x;
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
//		ArrayList sum = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			x= scan.nextInt();
		
			if(x != 0) {
				push(x);
			}
			else {
				pop();
			}
		}
		int sum = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			sum = sum + list.get(i);
		}
		System.out.println(sum);
		
	}
	public static int push(int a) {
		list.add(size, x);
		int p = (int) list.get(size);
		size++;
		return p;
	}
	
	public static void pop() {
		size--;
		list.remove(size);
	}

}
