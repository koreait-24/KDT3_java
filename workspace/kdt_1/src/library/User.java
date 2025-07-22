package library;

public class User {
//	User 클래스
//	필드 : name, userId
//	메서드 : login()
	
	//필드
	private String name;
	private String userId;

	//생성자
	public User(String name, String userId) {
		super();
		this.name = name;
		this.userId = userId;
	}
	
	//게터, 세터 메소드
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	public String getUserId() {
		return userId;
	}
	
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}

	//메소드
	void login() {
		System.out.println(this.name + "님이 로그인 했습니다");
	}
	
	

//	구현 조건
//	책을 5권까지만 대출 가능
//	책이 이미 대출 중이면 대출 불가 메시지 출력
}
