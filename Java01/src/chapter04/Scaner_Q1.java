package chapter04;

import java.util.Scanner;

public class Scaner_Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산값을 넣어주세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+' :
			System.out.println(num1 +  num2 );
			break;
		case '-' :
			System.out.println(num1 - num2 );
			break;
		case '*' :
			System.out.println(num1 * num2 );
			break;
		case '/' :
			System.out.println(num1 / num2 );
			break;
		}
		
		scanner.close();
	}

}
