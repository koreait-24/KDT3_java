package exceptionTest02;

import java.util.Scanner;

public class MyExceptionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		System.out.println("양의 정수만 입력하세요 : ");
		number = sc.nextInt();
		
		if(number <= 0) {
//			System.out.println("음수 입력불가");
			try {
				throw new MyException();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("입력한 숫자는 " + number + "입니다");
		}
		System.out.println("프로그램 종료");
	}
}

