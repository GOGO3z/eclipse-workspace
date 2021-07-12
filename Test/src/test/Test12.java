package test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("양의 정수 10개를 입력하시오 >>");
		for(int i = 0; i < array.length; i++ ) {
			array[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] % 3 == 0) {
			
				System.out.print(array[i] + " ");
			}
			
		}
		scanner.close();
	}

}
