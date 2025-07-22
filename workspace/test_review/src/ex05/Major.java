package ex05;

//전공을 나타내는 열거형 Major
public enum Major {
	COMPUTER_SCIENCE("컴퓨터공학"), 
	CYBER_SECURITY("정보보호학"), 
	ARTIFICIAL_INTELLIGENCE("인공지능학");

	final private String koreanName;
//	각 상수는 한글 전공명을 저장하는 final private koreanName 필드를 갖는다.
//	생성자를 통해 초기화하며, 한글명을 반환하는 getKoreanName() 메소드를 작성할 것

	private Major(String koreanName) {
		this.koreanName = koreanName;
	}

	//리턴타입 String
	String getKoreanName() {
		return koreanName;
	}

}
