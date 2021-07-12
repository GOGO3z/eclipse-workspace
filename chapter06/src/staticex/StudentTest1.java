package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		/*
		int a = 10;				// 리터럴은 데이터 영역에 저장
		int b = 20;
		double c = 10.5;
		char d ='A';
		*/
		
		
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);		// 초깃값 출력
		studentLee.serialNum++;							// static 변수 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);		// 증가된 값 출력
		System.out.println(studentLee.serialNum);		// 증가된 값 출력	
		
	}

}
