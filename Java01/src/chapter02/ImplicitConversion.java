package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);	//1byte : byte
		System.out.println(iNum);	//4byte : int
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);	//4byte : int
		System.out.println(fNum);	//4byte : float
		
		double dNum;
		dNum = fNum + iNum;			//float + int
		
		System.out.println(dNum);	//double

	}

}
