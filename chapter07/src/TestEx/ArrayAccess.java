package TestEx;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // �迭 ����
		
		int max = 0;		// ���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int i = 0; i < 5; i++ ) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) 
				max = intArray[i];
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
	}

}