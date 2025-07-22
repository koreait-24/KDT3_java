package library;

public class Member extends User {
//	Member (User 상속)
//	필드 : Book[] borrowedBooks (최대 5권)
//	메서드 : borrowBook(Book book)

	// 필드
	private Book[] borrowedBooks = new Book[5];
	private int bookCount = 0;

	// 생성자
	public Member(String name, String userId) {
		super(name, userId);
	}

	// 메소드
	public void borrowBook(Book book) {
		// 조건 책이 대출중인경우
		if (!book.isAvailable()) {
			System.out.println("대출 불가 : " + book.getTitle() + "는 이미 대출중입니다");
			return;
		}
		// 조건 최대 5권까지만 대출 가능
		if (bookCount >= 5) {
			System.out.println("대출 불가 : 최대 5권까지만 대출가능합니다");
			return;
		}

		// 대출가능상태
		borrowedBooks[bookCount++] = book;
		book.borrow();
		System.out.println(book.getTitle() + " 대출 완료!");

	}

}
