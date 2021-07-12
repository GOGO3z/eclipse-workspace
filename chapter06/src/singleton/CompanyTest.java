package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//Compnay instance2 = new Company();		// 외부에서 접근 안됨, private이라 안됨
		
		Company myCompany1 = Company.getInstance();		//static이라 가능		 
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);	// 두개의 인스턴스가 같다.
	}

}
