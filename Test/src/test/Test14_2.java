package test;

public class Test14_2 {

	public static void main(String[] args) {
		
		int [] intArray = new int[10];
		double avg;
		int total = 0;
		
		
		for(int i = 0; i < intArray.length; i++ ) {
			intArray[i] = (int)(Math.random()*10+1);
		}
		System.out.print("?????? ?????? : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(intArray[i] + " ");
			total += intArray[i];
		}
		System.out.println();
		
		avg = (double) total / intArray.length;
		System.out.println("?????? " + avg);
	}
}
