package algorithm_study.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_queue_No2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		int T = scan.nextInt();
		int[] arr = new int[T];
		
		for(int i = 0 ; i < T ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			queue.offer(arr[i]);
		}
		
		for(int i = 0 ; i < arr.length -1 ; i++) {
			queue.remove();
			queue.add(queue.peek());
			queue.remove();
		}
		
		System.out.println(queue);
		
	}

}
