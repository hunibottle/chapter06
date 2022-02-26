package algorithm_study.Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //검색 범위의 첫 인덱스
		int pr = n-1;//검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				return pc; // 중간값인 a[pc]와 Key 값이 같다면 pc를 리턴한다.
			}
			else if(a[pc] < key) {
				pl = pc + 1; // 중간값이 key 값보다 작으면 검색의 첫 인덱스를 중간값 + 1
							 // 으로 바꾸어 검색의 범위를 약 n/2로 만든다.
			}
			else {
				pr = pc - 1; // 위와 같은 개
			}
		}while(pl <= pr);
		
		return -1; 
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int num = 7;
		int[] arr = {13, 24, 25, 32, 39, 44, 50};
		// Arrays.sort(arr); 이진 검색은 정렬이 된 배열에 사용하는 것이다.
		// 그러므로 정렬이 필요하다면 key 값이 몇 번째로 큰 값인지 찾는 문제에 대입할 수 있다.
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		
		int idx = binSearch(arr,num,key);
		
		if(idx == -1) {
			System.out.print("key 값이 없습니다.");
		}else System.out.print(key+"은(는) x[" + idx + "]에 있습니다.");
		
	}

}


