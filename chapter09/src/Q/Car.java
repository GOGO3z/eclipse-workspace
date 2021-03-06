package Q;

public abstract class Car {
	
	public abstract void startCar();	// 추상 메서드, 서브 클래스에서 재정의 해서 사용,
	public abstract void drive();		// 추상 메서드, 서브 클래스에서 재정의 해서 사용,
	public abstract void stop();		// 추상 메서드, 서브 클래스에서 재정의 해서 사용,
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("세차를 합니다");
	}
	
	final public void run() {		// 템플릿 메서드
		startCar();					// 1. 시동을 켭니다.
		drive();					// 2. 운행을 합니다. (자동, 수동)  하위 클래스에서 오버라이딩
		stop();						// 3. 차가 멈춥니다. (자동, 수동)  하위 클래스에서 오버라이딩		
		turnOff();					// 4. 시동을 끕니다.
		washCar();					// 5. 세차를 합니다.
	}
	
}
