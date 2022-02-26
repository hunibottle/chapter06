package algorithm_study.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class backjoon_02 {
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static Scanner scan = new Scanner(System.in);
	public static int size = 0;
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			String str = scan.next();
			switch(str) {
			case "push":
				push();
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			}
		}
	}
	
	public static void push() {
		int x = scan.nextInt();
		list.add(size, x);
		size++;
	}
	
	public static void pop() {
		System.out.println(list.get(size-1));
		list.remove(size-1);
		size--;
	}
	public static void size() {
		System.out.println(list.size());
	}
	public static void empty() {
		if(list.isEmpty()) {
			System.out.println("empty");
		}else System.out.println("no empty");
	}

}
