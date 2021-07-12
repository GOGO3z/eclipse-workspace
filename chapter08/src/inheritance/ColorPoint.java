package inheritance;

public class ColorPoint extends Point{
	
	
	private String color;		// 점의 색을 표시
	
	// public ColorPoint (){} 기본 메소드 생략
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();		//point 클래스의 메소드 호출
	}
	
	/*public static void main(String[] args) {
	
		Point p = new Point();
		
		p.x = 1;
		p.y = 2;
		
	}*/
	
}
