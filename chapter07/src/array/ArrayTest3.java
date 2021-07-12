package array;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		double[] data = new double[5];		// 배열의 방을 5개 생성, 선업
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		double total = 1;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			total *= data[i];							// total = total * data[i]
		}
		System.out.println("total : " + total);			// 배열의 저장된 값을 곱하는 경우 문제가 발생,
	}
}
