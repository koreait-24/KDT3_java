package student;

public class User {
//	User 클래스
//	필드 : name, id
//	메서드 : login()

	// 필드
	private String name;
	private String id;

	// 생성자
	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void login() {
		System.out.println(this.name + "님이 로그인했습니다");
	}

}
