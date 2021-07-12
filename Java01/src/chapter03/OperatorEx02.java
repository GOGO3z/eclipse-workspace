package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("토탈 점수 : " + totalScore);
		
		double avgScore = (mathScore + engScore) / 2.0;
		System.out.println("평균 점수 : " + avgScore);
		
		int mod = mathScore % engScore;
		String ch1 = "나눈 나머지값 : ";
		System.out.println(ch1 + mod);
		

	}

}
