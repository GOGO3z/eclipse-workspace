package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("박장우");		// 업 캐스팅
		Student s = (Student)p;				// 다운 캐스팅, 반드시 자료형을 명시해서 다운
		
		System.out.println(p.name);
		
		//p.grade = "A";				// 컴파일 오류
		//p.department = "Com";		// 컴파일 오류
		p.name = "홍길동";
		p.id = "ID";
		
		s.grade = "A";					
		s.department = "Com";			
		s.name = "호혼";
		s.id = "Hr";
		
	}

}
