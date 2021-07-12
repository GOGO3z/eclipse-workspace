package array;

public class TwoDimension2 {
	public static void main(String[] args) {

		//int[][] arr = new int [2][3];
		int[][] arr = {{10,20,30},{40,50,60}}; 
		
		/*arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}
}
