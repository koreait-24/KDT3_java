package ex04;

public class WhileGugudan {
	public static void main(String[] args) {
//		- while문 이용(WhileGugudan) 로직구성 필요없음
		
		//곱해지는 수 
		int i = 1;
		
		while(i <= 9) {
			int dan = 2; //단
			while(dan <= 9) {
				System.out.printf("%d x %d = %2d\t", dan, i, (dan * i));
				dan++;
			}
			System.out.println();
			i++;
		}
		
		
	}
}
