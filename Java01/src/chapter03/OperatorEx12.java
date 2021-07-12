package chapter03;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		int num1 = 10;				// 00000000 00000000 00000000 00001010	> 10
									// 11111111 11111111 11111111 11110101	> -11
		int num2 = 5;				// 00000000 00000000 00000000 00000101	> 5
									
		int result = ~ num1;	// -11
		int result2 = num1 & num2;
		int result3 = num1 | num2;
		int result4 = num1 ^ num2;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
