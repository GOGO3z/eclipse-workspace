package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;	// ; 처리 전에 적용 
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		System.out.println(gameScore);

	}

}

