package witharrayList;

public class GoldCustomer extends Customer{
	double saleRatio;					// VIP 할인률 ( 물품의 가격을 할인 비율 )
	
	public GoldCustomer (int customerID, String customerName) {
		//super();					// 상위 클래스의 생성자를 호출, super() : 상위 클래스의 기본 생성자를 호출
		
		super(customerID, customerName);
		customerGrade = "Gold";		// 기본 등급
		bonusRatio = 0.02;			// 보너스 포인트 기본 적립 비율 (2%)
		saleRatio = 0.1;			// 할인율 10%
	}
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);		// VIP 고객일 때 가격 할인 (5%)
	}
	
}