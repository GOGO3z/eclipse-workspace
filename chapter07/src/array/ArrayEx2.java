package array;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		long total = 1;
		
		for(int i = 0, num=1; i < arr.length; i++) {	
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
				total *= arr[i][j];
				num++;
			}
			
			System.out.println();
			
		}
		
		System.out.println("==========");
		System.out.println("total :" + total);
		
	}

}
