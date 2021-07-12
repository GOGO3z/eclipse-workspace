package chapter05;

public class Student {

	int studentID;				// 멤버 변수 (속성)
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {		// 기능 (메서드)
		System.out.println(studentName + ", " + address);; // 이름, 주소 출력 하는 메소드
	}
	
	public String getStudentName () {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {	//
		
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}

}