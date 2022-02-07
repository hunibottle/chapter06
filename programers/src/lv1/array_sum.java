package lv1;

public class array_sum {
	
	public static void main(String[] args) {
		int[][] arr1 = {{1},{3}};
		int[][] arr2 = {{1},{2}};
		int[][] answer = new int[arr1.length][arr2.length];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0 ; j < arr2[0].length ;j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(answer[i][j]);
			}
		}
		
       }  
}

