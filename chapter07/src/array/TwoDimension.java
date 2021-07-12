package array;

public class TwoDimension {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		System.out.println("==================");
		System.out.println("arr.length : " + arr.length );
		System.out.println("arr[0].length : " + arr[0].length );
		System.out.println("==================");
		System.out.println("arr[0][0] : " + arr[0][0] );
		System.out.println("arr[0][1] : " + arr[0][1] );
		System.out.println("arr[0][2] : " + arr[0][2] );
		System.out.println("arr[1][0] : " + arr[1][0] );
		System.out.println("arr[1][1] : " + arr[1][1] );
		System.out.println("arr[1][2] : " + arr[1][2] );
		
	}

}
