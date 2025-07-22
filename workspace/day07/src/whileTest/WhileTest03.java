package whileTest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 {
	public static void main(String[] args) {


		int result = 0, choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("2개의 정수 입력(입력시 1, 0 제외) : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			System.out.println("계속 : 1, 종료 : 0을 누르세요 : ");
			choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("종료");
				break;
			}
			if (choice == 1) {
				System.out.println("계속 진행합니다");
				continue;
			}
			System.out.println("프로그램");
		}
		System.out.println("반복문을 종료합니다");
		sc.close();
		

	}
}
