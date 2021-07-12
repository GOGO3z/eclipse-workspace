package reference;

public class Subject {

	String subjectName;		// 과목 (국어, 수학, 영어, etc)
	int scorePoint;			// 점수 (국어점수, 수학점수, 영어점수, etc)
	
	public void setKorea (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
}

