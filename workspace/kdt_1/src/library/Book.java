package library;

public class Book {
//	Book 클래스
//	필드 : title, author, isAvailable
//	메서드 : borrow() → isAvailable 변경

	// 필드
	private String title;
	private String author;
	private boolean isAvailable = true;

	// 생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// 게터, 세터 메소드
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void borrow() {
		isAvailable = false;
	}

}
