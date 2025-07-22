package Ex05;

public class ForGugudan {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " x " + i + " = " + (i * dan) + "\t");
			}
			System.out.println(); // 줄 바꿈
		}
	}
}