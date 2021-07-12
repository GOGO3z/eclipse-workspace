package reference;

public class Student4 {

	int studentID;			// 학번	기본 자료형
	String studentName;		// 이름	참조 자료형(객체자료형), 자바에서 기본 제공되는 
	
	Subject korean;			// 참조 자료형 [사용자 정의 객체형 자료형](Subject 클래스) 국어 과목 / 점수
	Subject math;			// 참조 자료형 [사용자 정의 객체형 자료형](Subject 클래스) 수학 과목 / 점수
	
	public Student4(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorea (String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생" + studentName + "의 총점은 " + total + " 입니다.");
	}
	
}
