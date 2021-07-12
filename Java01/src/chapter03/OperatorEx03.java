package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		/*
		 * int lastScore1 = ++gameScore;	// ; 贸府 傈俊 利侩 
		 * System.out.println(lastScore1);
		 */
		int lastScore1 = gameScore++; 		// ; 贸府 饶俊 利侩
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		System.out.println(gameScore);

	}

}
