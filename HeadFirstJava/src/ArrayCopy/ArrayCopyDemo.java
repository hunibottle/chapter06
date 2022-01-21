package ArrayCopy;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		String[] copyFrom = {"a", "b", "c"};
		
		String[] copyTo = new String[3];
		System.arraycopy(copyFrom, 0, copyTo, 0, 2);
		//java.util.Arrays.copyofRange(copyForm, 2, 5); -> 방법도 가능 
		//local variable 은 초기화 하지 않으면 오류 발생
		for(String coffee : copyTo) {
			System.out.println(coffee + " ");
		}
	}
	
}
