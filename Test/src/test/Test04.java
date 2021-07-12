package test;

public class Test04 {
	public static void main(String[] args) {
			
		int lineCount = 4;		
		int starCount = 1;		
		
		for (int i = 0 ; i < lineCount ; i++ ) {			
			
			for (int j = 0 ; j < starCount ; j++) {			
				System.out.print('*');
			}
			starCount += 1;
			System.out.println();
		}
	}
}
