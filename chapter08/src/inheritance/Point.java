package inheritance;

//public class Point extends Object{		//extends Object�� ���� ��
	
public class Point{
	private int x,y;		// ��ǥ�� ��Ÿ���� ����
							// protected : default ���� �����ڿ� ����, �ٸ��б����� ��ӵ� Ŭ������ ���� ���
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}