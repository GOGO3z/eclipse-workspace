package chapter04;

public class If_example07 {

	public static void main(String[] args) {
		
		int score = 90;
		char grade ;
		if ( score >= 90 ) {
			grade = 'A';
		}
		else {
			grade = 'B';
		}
		System.out.println("당신의 점수는 " + score + "이고, 학점은  " + grade + "입니다.");
	}

}
