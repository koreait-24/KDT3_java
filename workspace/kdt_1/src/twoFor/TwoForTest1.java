package twoFor;

public class TwoForTest1 {
	public static void main(String[] args) {
		// p143
//	        *
//	      * * *
//	    * * * * *
//	  * * * * * * *

		int row = 4;
		for (int i = 1; i <= row; i++) {
			// 공백
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			// 별
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("출력 끝");

		// 4행 7열
		// i = 1
		// 공백 row = 4 일 때 4 - 1 = 3
		// 별 2 * 1 - 1 = *

		// i = 2
		// 공백 row = 2
		// 별 3 * * *

		// i = 3
		// 공백 1
		// 별 5

		// i = 4
		// 공백 0
		// 별 7

//		* * * * * * *
//		  * * * * *
//		    * * *
//		      *

		for (int i = row; i >= 1; i--) {
			// 공백
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int num = 3;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= (2 * i - 1); j++) {
//				System.out.println(2*i-1);
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}













