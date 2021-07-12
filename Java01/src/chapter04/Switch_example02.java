package chapter04;

	public class Switch_example02 {
		public static void main(String[] args) {

		String medal = "b";
		
		switch (medal) {
		case "Gold" : case "G" : case "g" : case "Gol" :
			System.out.println("금메달 입니다.");
			break;
		case "Silver" : case "S" : case "s" : 
			System.out.println("은메달 입니다.");
			break;
		case "Bronze" : case "B" : case "b" : 
			System.out.println("동메달 입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
