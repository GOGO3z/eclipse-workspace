package Q;

public abstract class Car {
	
	public abstract void startCar();	// �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���,
	public abstract void drive();		// �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���,
	public abstract void stop();		// �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���,
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("������ �մϴ�");
	}
	
	final public void run() {		// ���ø� �޼���
		startCar();					// 1. �õ��� �մϴ�.
		drive();					// 2. ������ �մϴ�. (�ڵ�, ����)  ���� Ŭ�������� �������̵�
		stop();						// 3. ���� ����ϴ�. (�ڵ�, ����)  ���� Ŭ�������� �������̵�		
		turnOff();					// 4. �õ��� ���ϴ�.
		washCar();					// 5. ������ �մϴ�.
	}
	
}