package gameLevel;

public class Player {

	private PlayerLevel level;		// PlayerLevel <객체형자료형>, level <인스턴스명>
									// level 인스턴스 변수에 객체가 담길 경우 형변환 (업캐스팅)
	
	public Player() {				// Player 기본 생성자
		PlayerLevel level = new BeginnerLevel();		// PlayerLevel 자료형으로 업캐스팅
		level.showLevelMessage();			// PlayerLevel level = new BeginnerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {		// 객체를 인풋 값으로 받고 형변환 (업캐스팅)
		this.level = level;
		level.showLevelMessage();
	}
		
	public void play(int count) {		//
		level.go(count);
	}
	
}
