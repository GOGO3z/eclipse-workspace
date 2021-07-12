package thisex;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {	// 메소드의 변수이름과 객체 변수 이름이 동일한 경우
		this.name = name;		// 객체 변수 이름 앞에 this (heap)
		this.age = age;			// (heap)
	}
	Person(){
		this("이름 없음", 1);		// this를 이용해 Person(String,int)호출 
	}							// 생성자에서 다른 생성자를 호출하는 this
	Person returnItSelf() {
		return this;			// this 변환
	}
}
	// stack : this, noname
	// heap : name, age

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();	// (stack)
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
