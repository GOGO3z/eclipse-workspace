package hiding;

public class This_Circle {
	
	int radius;
	
	public This_Circle (int r) {
		radius = r;
	}
	
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		
		This_Circle ob1 = new This_Circle(1);
		This_Circle ob2 = new This_Circle(2);
		This_Circle ob3 = new This_Circle(3);
		
		System.out.println("ob1 radius" + ob1.radius);
		System.out.println("ob2 radius" + ob2.radius);
		System.out.println("ob3 radius" + ob3.radius);
		System.out.println("========================");
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		System.out.println("ob1 radius" + ob1.radius);
		System.out.println("ob2 radius" + ob2.radius);
		System.out.println("ob3 radius" + ob3.radius);
		
	}

}
