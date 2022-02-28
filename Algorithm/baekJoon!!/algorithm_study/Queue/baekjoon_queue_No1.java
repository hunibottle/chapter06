package algorithm_study.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_queue_No1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		/*  queue.add(1) -> 큐에 1추가
			queue.offer(1) -> 큐에 1추가
			queue.poll() -> 큐에 첫번째 값 반환하고 제거
			queue.remove() -> 큐에 첫번째 값 제거
			queue.clear() -> 큐 초기화
			queue.peek() -> 큐의 첫번째 값 참조
		*/
		int x;
		int last=0;
		int T = scan.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			String str = scan.next();
			switch(str) {
			case "push":
				x = scan.nextInt();
				last = x;
				queue.add(x);
				System.out.println(queue);
				break;
				// 나중에 문제풀때 큐에 마지막 값도 알아야 하는 상황이 생기면 push값을 이용한다.
			case "pop":
				queue.remove();
				System.out.println(queue);
				break;
			case "front":
				System.out.println(queue.peek());
				break;
			case "back":
				System.out.println(last);
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty()) {
					System.out.println("1");
				}else System.out.println("0");
				break;
			}
		}
		
	}

}
