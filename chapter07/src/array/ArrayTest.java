package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};		// ¹è¿­ num
		//int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num.length); 
		
	}
	
}
