package chapter02;

public class CharacterEX02 {
	
	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uD55C';	//유니코드 값 (한)
		char ch3 = '\uAC38';	//유니코드 값 (갸)
		
		//char ch5 = -65;
		char ch6 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		//System.out.println(ch5);
		System.out.println(ch6);
		
	}
}
