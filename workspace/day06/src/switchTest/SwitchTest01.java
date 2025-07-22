package switchTest;
//14번 : switch문
public class SwitchTest01 {
	public static void main(String[] args) {
		
		String animal = "고양이";
		
//		switch ("강아지") {
//		case "고양이":
//			System.out.println("선택한 동물은 고양이입니다");
//			break;
//		case "강아지":
//			System.out.println("선택한 동물은 강아지입니다");
//			break;
//		case "코알라":
//			System.out.println("선택한 동물은 코알라입니다");
//			break;
//		default:
//			System.out.println("선택한 동물이 없습니다");
//			break;
//		}
		
		switch (30) {
		case 10:
			System.out.println("10입니다");
			break;
		case 100:
			System.out.println("100입니다");
			break;
		case 50:
			System.out.println("50입니다");
			break;
		default:
			System.out.println("case에 값이 없습니다");
			break;
		}
		
		
		
	}
}
