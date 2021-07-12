package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		int num = 0B00000101;	// 2Áø¼ö 5
		
		System.out.println(num << 2);	// 0B00010100  = 5 * 2^2 = 20
		System.out.println(num << 3);	// 0B00101000  = 5 * 2^3 = 40 	
		System.out.println(num << 4);	// 0B01010000  = 5 * 2^4 = 80 
		System.out.println(num >> 1);	// 0B00000010  = 5 / 2^1 = 2	
		System.out.println(num >> 2);	// 0B00000001  = 5 / 2^2 = 1
		System.out.println(num >>> 2);	// 0B00000001  = 5 / 2^2 = 1
		
		System.out.println(num);		// 0B00000101  =  5
		
		num = num <<2;
		System.out.println(num);		// 0B00010100  = 20 

	}

}
