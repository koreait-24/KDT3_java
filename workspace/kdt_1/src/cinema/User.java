package cinema;

public class User {
//	정훈 - 영화 예매 시스템 (CinemaReserve)
//	User 클래스
//	필드 : username, phoneNumber
//	메서드 : login()

	//필드
	private String userName;
	private String phoneNumber;
	
	//생성자
	public User(String userName, String phoneNumber) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	//메소드
	public void login() {
		System.out.println(this.userName + "님이 로그인했습니다!");
	}	
}
