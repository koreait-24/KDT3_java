package scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTask01 {
	public static void main(String[] args) {
		// 1. 본인의 이름과 성별을 입력받고 출력하기 (next()만 사용)
		// 입력 예> 이름 입력 :
		// 입력 예> 성별 입력 :
		// 출력 예> 이름은 000이고 00입니다.

		// 로직구성
		// 1) 입력클래스 선언 + 입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2) 이름 입력 메시지 출력
		System.out.println("이름 입력하세요 : ");
		// 3) 문자열 변수(name, gender) 선언
		String name, gender;
		// 4) 변수에 입력 메소드 사용(next())
		name = sc.next();
		// 5) 성별입력 메시지 출력
		System.out.println("성별을 입력하세요 : ");
//		gender = sc.next();
		char gender2 = sc.next().charAt(0);
		// 5) 결과 출력
		System.out.printf("이름은 %s이고, 성별은 %s성입니다.", name, gender2);

	}
}
