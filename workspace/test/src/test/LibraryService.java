package test;

import java.util.List;

public class LibraryService {
    private List<Book> bookList;

    public LibraryService(List<Book> bookList) {
        this.bookList = bookList;
    }

    // 도서 목록 출력
    public void displayBooks() {
        System.out.println("전체 도서 목록:");
        for (Book book : bookList) {
            System.out.println(" - " + book);
        }
    }

    // 제목으로 도서 검색
    public Book findBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return bookList;
    }
}
