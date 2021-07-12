package thisex;

public class Birthday {
	
	int day;
	int month;
	public int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);	//this가 가르키는 객체의 힙 메모리 주소
	}

	
	public static void main(String[] args) {
		
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay 객체의 RAM의 힙주소 출력
		bDay.printThis();	// bDay가 가르키는 힙메모리 주소
		
		System.out.println(bDay.year);
		
	}

}
