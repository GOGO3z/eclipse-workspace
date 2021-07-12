package chapter04;

public class Loop_for_continue_Ex {

	public static void main(String[] args) {
		
		int total = 0;
		int num;
		
		//for (int total = 0, int num = 1 ; num <= 100 ; num++){
		for(num = 1; num <= 100; num++) {
			
			if (num % 2 == 0) { 	// 짝수를 찾음
				continue;			// 만나서 밑으로 가지 않고 올라감 
			}
			
			total += num;		
			
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 : " + total + "입니다.");

	}

}
