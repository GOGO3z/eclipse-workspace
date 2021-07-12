package hiding;

public class Sample {
	
	public int a;	// 다른 패키지의 클래스에서 접근 가능
	private int b;	// 클래스 내에서만 접근 가능
	int c;			// default가 생략됨, 동일 패키지내의 다른 클래스에서 접근 가능
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
