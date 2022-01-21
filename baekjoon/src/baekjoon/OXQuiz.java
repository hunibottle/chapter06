package baekjoon;

import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		
		int sum_score=0;
		int score = 0;
		
		String[] arr = new String[] {"O","O" ,"X", "X","O","X", "X", "O", "O", "O"};
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == "O") {
				score++;
			}
			else {
				score = 0;
			}
			sum_score = sum_score + score;
		}
		System.out.println(sum_score);
	}
}
