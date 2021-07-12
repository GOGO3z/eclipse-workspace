package staticex;

public class Student {

	public static int serialNum = 1000;		// 클래스 변수 (모든 인스턴스에서 접근 가능) 
	//데이터 영역에 생성, 프로그램이 로드 될때 데이터영억에 저장, 프로그램이 종료될때 제거
	
	int studentID;							// 멤버 변수[인스턴스 변수] 힙 영역에 생성
	String studentName;						// new 키워드를 통해서 인스턴스 생성시에 만들어짐
	int grade;								// 가비지 컬렉터에 의해서 제거
	String address;							// 그 인스턴스 내에서만 사용, 다른 인스턴스에서는 안됨
	
	/*
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}*/
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {
		int i = 10;
		// studentName = "aaa";
		return serialNum;
	}

	public static void serSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
