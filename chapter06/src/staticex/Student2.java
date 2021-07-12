package staticex;

public class Student2 {
		
	private static int serialNum = 1000;	//외부 클래스에서 접근 차단
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;		// 스택 영역에 저장, 메소드가 실행 끝나면 소멸
		//studnetName = "aaa";  //static 메소드 에서는 멤버변수(인스턴스변수)를 사용 할수 없다.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
}
