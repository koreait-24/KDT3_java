package ifTest;
//12번 : if ~ else if ~ else문
public class IfTest03 {
	public static void main(String[] args) {
		//양수, 음수, 0인지 출력하기
		System.out.println("출력 시작");
		
		int num = 10;
		
		if (num > 0) {
			System.out.println("양수입니다");
		}else if (num < 0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
		
		if (num > 5 && num < 15) {
			System.out.println("3보다 큽니다");
		}else if (num > 5) {
			System.out.println("5보다 큽니다");
		}else {
			System.out.println(num);
		}
		
		System.out.println("출력 끝");
	}

}
