package chapter05;

public class Student_Test {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {				//리턴을 안할때 void
		System.out.println(studentName + "," + address);
	}
	
	public static int add(int k1, int k2) {		// 리턴을 할때 static
		int result = k1 + k2;
		return result;
	}
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
	}

}
