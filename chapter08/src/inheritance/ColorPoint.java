package inheritance;

public class ColorPoint extends Point{
	
	
	private String color;		// ���� ���� ǥ��
	
	// public ColorPoint (){} �⺻ �޼ҵ� ����
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();		//point Ŭ������ �޼ҵ� ȣ��
	}
	
	/*public static void main(String[] args) {
	
		Point p = new Point();
		
		p.x = 1;
		p.y = 2;
		
	}*/
	
}