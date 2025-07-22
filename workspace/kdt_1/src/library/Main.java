package library;

public class Main {
	public static void main(String[] args) {
		Member member1 = new Member("김기수", "user001");
		Member member2 = new Member("기수", "user002");
		System.out.println(member1);
		member1.login();
		member2.login();
		
		Book b1 = new Book("자바", "자바");
		Book b2 = new Book("자바의 정석", "자바2");
		Book b3 = new Book("clean coding", "자바3");
		Book b4 = new Book("자바의 신", "자바4");
		Book b5 = new Book("dbms", "dbms");
		Book b6 = new Book("운영체제", "운영체제");
		
		System.out.println(b1);
		System.out.println(b2);
		member1.borrowBook(b1);
		member1.borrowBook(b2);
		member1.borrowBook(b1);
//		member1.borrowBook(b4);
//		member1.borrowBook(b5);
//		member1.borrowBook(b6);
//		member2.borrowBook(b6);
//		member2.borrowBook(b1);
		
	}
}













