package chapter05;

public class Person_Test {

	public static void main(String[] args) {
		
		Person person = new Person();	// Person 객체 생성
		person.age = 40;		
		person.name = "James";	
		person.single = true;
		person.cildren = 3;
		
		System.out.println("이 사람의 나이는 " + person.age + "살 입니다.");
		System.out.println("이 사람의 이름은 " + person.name + "입니다.");
		System.out.println("이 사람의 결혼 여부는 " + person.single + "입니다.");
		System.out.println("이 사람의 자녀 수는 " + person.cildren + "명 입니다.");
		
	}

}
