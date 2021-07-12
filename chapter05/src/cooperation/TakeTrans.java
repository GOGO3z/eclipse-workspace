package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentTomas.takeBus(bus100);
		studentTomas.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		
		//subwayGreen = new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		
		//bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
	}

}
