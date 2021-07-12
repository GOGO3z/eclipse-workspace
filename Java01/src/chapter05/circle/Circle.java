package chapter05.circle;

public class Circle {

	int radius;		// 원의 반지름 필드		[변수]
	String name;	// 원의 이름 필드		[변수]
	
	public Circle() {}	// Circle 클래싀의 기본 생성자(클래스명과 동일한 이름의 메소드)	[생성자]
						// 인풋 매개변수도 없고, 실행부가 없는 생성자 : 기본 생성자, 기본생성자는 생략이 가능
	
	public double getArea() {	// 원의 면적 계산 메소드	[메소드]
		return 3.14 * radius * radius;
	}

}
