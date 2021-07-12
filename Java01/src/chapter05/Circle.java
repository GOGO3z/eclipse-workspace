package chapter05;

public class Circle {

	int radius;		// 원의 반지름 필드		[변수]
	String name;	// 원의 이름 필드		[변수]
	
	public Circle() {}	// Circle 클래싀의 기본 생성자(클래스명과 동일한 이름의 메소드)	[생성자]
						// 인풋 매개변수도 없고, 실행부가 없는 생성자 : 기본 생성자, 기본생성자는 생략이 가능
	
	public double getArea() {	// 원의 면적 계산 메소드	[메소드]
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();	// Circle 객체 생성, 레퍼런스 이름 pizza 
		pizza.radius = 10;		// 피자의 반지름을 10으로 설정
		pizza.name = "자바 피자";	// 피자의 이름을 설정
		double area = pizza.getArea();	// 피자의 면적 (getArea()를 호출해서 area 변수에 할당 
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();	// Circle 객체 생성, 레퍼런스 이름 donut
		donut.radius = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
