package chapter03;

public class OperatorEx07 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) || (num2 > 0);	// || 논리합 : 두 항 중 하나만 True 일때 True
		System.out.println(flag);
		
		boolean flag2 = (num1 > 0) || (num2 < 0);
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) || (num2 > 0);
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) || (num2 < 0);
		System.out.println(flag4);

	}

}
