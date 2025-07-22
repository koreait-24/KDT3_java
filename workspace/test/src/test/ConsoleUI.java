package test;

import java.util.Scanner;

public class ConsoleUI {
    private final LibraryService service;
    private final Member member;
    private final Scanner scanner;

    public ConsoleUI(LibraryService service, Member member) {
        this.service = service;
        this.member = member;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        member.login();
        while (true) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> service.displayBooks();
                case 2 -> borrowBook();
                case 3 -> returnBook();
                case 4 -> member.showBorrowedBooks();
                case 0 -> {
                    System.out.println("👋 프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("❗ 잘못된 선택입니다.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== 도서 대출 시스템 ===");
        System.out.println("1. 도서 목록 보기");
        System.out.println("2. 도서 대출");
        System.out.println("3. 도서 반납");
        System.out.println("4. 대출 목록 확인");
        System.out.println("0. 종료");
        System.out.print("메뉴 선택 : ");
    }

    private void borrowBook() {
        System.out.print("대출할 책 제목을 입력하세요: ");
        String title = scanner.nextLine();
        Book book = service.findBookByTitle(title);

        if (book == null) {
            System.out.println("책을 찾을 수 없습니다.");
            return;
        }

        try {
            member.borrowBook(book);
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private void returnBook() {
        System.out.print("반납할 책 제목을 입력하세요: ");
        String title = scanner.nextLine();
        Book book = service.findBookByTitle(title);

        if (book == null) {
            System.out.println("책을 찾을 수 없습니다.");
            return;
        }

        member.returnBook(book);
    }
}
