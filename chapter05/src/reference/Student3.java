package reference;

public class Student3 {

	int studentID;			// 학번
	String studentName;		// 이름
	
	Subject korea;			// 참조형 자료형 (Subject 클래스) 국어 과목 / 점수
	Subject math;			// 참조형 자료형 (Subject 클래스) 수학 과목 / 점수
	
	public Student3() {
		korea = new Subject();
		math = new Subject();
	}
	
	
}
