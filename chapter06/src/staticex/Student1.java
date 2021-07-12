package staticex;

public class Student1 {

	public static int serialNum = 1000;	// 클래스 변수, static 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {	// 클래스 메소드, static 메소드
		int i = 10;
		// studentName = "aaa";
		return serialNum;
	}
	
}
