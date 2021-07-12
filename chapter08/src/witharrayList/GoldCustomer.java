package witharrayList;

public class GoldCustomer extends Customer{
	double saleRatio;					// VIP ���η� ( ��ǰ�� ������ ���� ���� )
	
	public GoldCustomer (int customerID, String customerName) {
		//super();					// ���� Ŭ������ �����ڸ� ȣ��, super() : ���� Ŭ������ �⺻ �����ڸ� ȣ��
		
		super(customerID, customerName);
		customerGrade = "Gold";		// �⺻ ���
		bonusRatio = 0.02;			// ���ʽ� ����Ʈ �⺻ ���� ���� (2%)
		saleRatio = 0.1;			// ������ 10%
	}
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);		// VIP ������ �� ���� ���� (5%)
	}
	
}