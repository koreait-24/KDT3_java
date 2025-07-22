package test;

import java.util.Objects;

public class Book implements Borrow {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public void borrow() throws Exception {
        if (!isAvailable) {
            throw new Exception("이미 대출 중입니다.");
        }
        isAvailable = false;
    }

    @Override
    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "[제목: " + title + ", 저자: " + author + ", 상태: " + (isAvailable ? "대출 가능" : "대출 중") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return Objects.equals(title, other.title) && Objects.equals(author, other.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
