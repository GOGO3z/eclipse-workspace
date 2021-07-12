package chapter02;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000000000101; // 4byte  양수 : 5
		int num2 = 0B11111111111111111111111111111011; // 4byte  음수 : -5
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);

	}

}
