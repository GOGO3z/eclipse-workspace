package chapter03;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag;
		
		flag = !(num1 > 0);				//!(not) : True >  False, Fasles >True
		System.out.println(flag);
		
		flag = !(num2 < 0);
		System.out.println(flag);
		
		flag = !(num1 > num2);
		System.out.println(flag);
		
		flag = !(num1 < num2);
		System.out.println(flag);

	}

}
