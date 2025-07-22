package ex04;

public class ForGugudan {
	public static void main(String[] args) {
		
//		- for문 이용 (ForGugudan) 로직구성 필요없음
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %2d\t", dan, i, (dan*i));
			}
			System.out.println();
		}
	}
}
