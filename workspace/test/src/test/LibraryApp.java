package test;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
 
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "로버트 C. 마틴"));
        books.add(new Book("나 없이는 존재하지 않는 세상", "카를로 로벨리"));
        books.add(new Book("자바의 정석", "남궁성"));

       LibraryService service = new LibraryService(books);
        Member member = new Member("홍길동", "user01");

        LoginManager loginManager = new LoginManager();
        loginManager.addUser(member);

        ConsoleUI ui = new ConsoleUI(service, member);
        ui.start();
    }
}
