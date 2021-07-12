package chapter02;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;	// 상수 선언과 동시에 값 할당.
		int max_Num = 100;
		final int MIN_NUM;			// 상수 선언
		
		MIN_NUM = 0;				// 상수에 값 할당.
		max_Num = 200;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(max_Num);
		
	}

}
