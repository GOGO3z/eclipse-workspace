package array;

public class CharArray {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++, ch++) {		// A ~ Z 까지 배열 방에 저장
			alphabets[i] = ch;		// 이스키 값으로 각 배열 방에 저장
		}
		
		for(int i = 0; i < alphabets.length; i++) {				// 배열의 각방에 내용을 출력
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		
	}

}
