package chapter04;

public class If_example06 {

	public static void main(String[] args) {

		int score = 90;
		char grade;

		if (score <= 70 ) {
			grade = 'D';

		}

		else if (score <= 80 ) {

			grade = 'C';

		}

		else if (score <= 90 ) {

			grade = 'B';

		}

		else if (score <= 100 ) {

			grade = 'A';

		}

		else {

			grade = 'F';

		}

		System.out.println(grade + "점입니다.");

	}

}
