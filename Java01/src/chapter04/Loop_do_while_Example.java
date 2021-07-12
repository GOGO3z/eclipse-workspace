package chapter04;

public class Loop_do_while_Example {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;		
			num++;
			
		}
		
		while (num <= 10);
			
		System.out.println("1부터 10까지는 합은 " + sum + "입니다");
		System.out.println("SUM : " + sum);
		System.out.println("NUM : " + num);
	}

}
