package chapter02;

public class ByteVariableEX01 {
	public static void main(String[] args) {
		
		byte num;
		num = -128;		//byte : 1byte (-2^7 ~ 2^7-1), (-128 ~ 127)  첫자리는 음수 양수로 제외
		
		byte num2;
		num2 = 127;
		
		short num3;
		num3 = -32768;	//short : 2byte (-2^15 ~ 2^15-1), (-32768 ~ 32767)   첫자리는 음수 양수로 제외
		
		short num4;
		num4 = 32767;
		
		int num5 = -2147483648;
		int num6 = 2147483647;
		
		long num7 = 1234567890000L;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
	}
	
}
