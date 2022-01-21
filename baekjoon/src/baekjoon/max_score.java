package baekjoon;

import java.util.Scanner;

public class max_score {

	public static void main(String[] args) {
		
		double max_num=0;
		double sum=0;
		double average_grade;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		count = scan.nextInt();
		double[] sejun_score = new double[count];
		double[] sejun_fake_score = new double[count];
		
		for(int i = 0 ; i < sejun_score.length ; i++) {
			sejun_score[i] = scan.nextInt();
		}
		
		for(int i =0 ; i < sejun_score.length ; i++) {
			if(max_num < sejun_score[i]) {
				max_num = sejun_score[i];
			}
		}
		
		for(int i = 0; i < sejun_score.length ; i++) {
			sejun_fake_score[i] = sejun_score[i] / max_num * 100;
		}
		
		for(int i = 0 ; i < sejun_fake_score.length ; i++) {
			sum = sum + sejun_fake_score[i];
		}
		average_grade = sum / 3;
		System.out.println(average_grade);
	}
	
}
