package chapter02;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;       // 10진법으로 값을 할당
		int bNum = 0B1010;	// 0B : 2진번	으로 값을 할당
		int oNum = 012;     // 0  : 8진번으로 값을 할당
		int hNum = 0XA;     // 0X : 16진번으로 값을 할당
		
		int test = -10;
		
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		System.out.println(test);
		
	}

}
