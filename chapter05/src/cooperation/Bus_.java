package cooperation;

public class Bus_ {

	int busNumber;
	int peaple;
	int money;
	
	public Bus_ (int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take (int money) {
		this.money += money;
		peaple++;
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은 " + peaple + " 명이고, 수입은 " + money + "입니다.");
	}
	
}
