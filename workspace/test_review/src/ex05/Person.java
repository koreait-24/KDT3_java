package ex05;

public class Person {
//	(2) Person 클래스 정의
//	필드
	String name;
//	생성자
	public Person(String name) {
		super();
		this.name = name;
	}
//	메소드
//	    getName() — 이름 반환
	//반환타입 String
	String getName() {
		return this.name;
	}
	
}
