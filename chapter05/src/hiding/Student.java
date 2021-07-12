package hiding;

public class Student {

	int studentID;
	private String studentName;		// 다른 클래스 에서 접근(x)
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
