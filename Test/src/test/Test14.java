package test;

public class Test14 {
	
	public static void main(String[] args) {
		
		int [] array = new int[10];
		double sum = 0;
		int j = 0;
		
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i < array.length; i++ ) {
			j =(int)(Math.random()*10+1);
			System.out.print(j + " ");
			sum += j;
		}
		System.out.println();
		System.out.println("평점 : " + (sum/array.length));
	}
}