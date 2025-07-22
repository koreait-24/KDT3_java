package test;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private List<Book> borrowedBooks;

    public Member(String name, String userId) {
        super(name, userId);
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println("[" + name + "]님이 로그인했습니다.");
    }

    // 도서 대여
    public void borrowBook(Book book) throws Exception {
        if (borrowedBooks.size() >= 20) {
            throw new Exception("최대 20권까지 대출할 수 있습니다.");
        }
        if (!book.isAvailable()) {
            throw new Exception("이 책은 현재 대출 중입니다.");
        }
        if (borrowedBooks.contains(book)) {
            throw new Exception("이미 대출한 책입니다.");
        }

        book.borrow();
        borrowedBooks.add(book);
        System.out.println("대출 완료: " + book.getTitle());
    }

    // 도서 반납
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println("반납 완료: " + book.getTitle());
        } else {
            System.out.println("대출 중인 책이 아닙니다.");
        }
    }

    // 대출 목록 출력
    public void showBorrowedBooks() {
        System.out.println("대출 중인 책 (" + borrowedBooks.size() + "권):");
        if (borrowedBooks.isEmpty()) {
            System.out.println(" - 없음");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(" - " + book);
            }
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
