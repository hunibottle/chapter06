package algorithm_study.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_queue_No3 {
	
	public static Queue<Integer> queue = new LinkedList<>();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = scan.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			queue.add(i+1);
		}
		for(int i = 0 ; i < T; i++) {
			round();
		}
	}
	
	public static void round() {
		int num = scan.nextInt();
		while(!queue.isEmpty()) {
			for(int i = 0 ; i < num -1 ; i++) {
				queue.add(queue.peek());
				queue.remove();
			}
			System.out.print(queue.peek()+" ");
			queue.remove();
		}
		/* <중요했던점> queue.isEmpty() !! -> 배열이 빌 때 까지 반복할 때 사용한다.
		queue는 스택과 달리 특정 인덱스를 뽑아 낼 수 없다.
		일렬로, 원모양으로 라는 단어가 문제에 있다면 큐를 연상해보자!
		*/
	}

}
