package chapter04;

import java.util.Scanner;

public class Q1_IF {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		System.out.println("연산자를 입력하세요. 예) +, -, *, /");
		
		Scanner scanner = new Scanner(System.in);	// 객체 생성
		String S = scanner.next();		// 문자열을 받아서 S 변수에 할당
	
		char operator = S.charAt(0);	// 첫번째 문자를 char 형인 operator 에 저장
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else
		{
			System.out.println("연산자 오류입니다");
			scanner.close();
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		scanner.close();
	}

}
