package Ex05;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명의 학생을 입력하시겠습니까? ");
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 제거

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n[" + (i + 1) + "번째 학생 정보 입력]");

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("전공(COMPUTER_SCIENCE, CYBER_SECURITY, ARTIFICIAL_INTELLIGENCE) : ");
            Major major = Major.valueOf(sc.nextLine());

            System.out.print("Java 점수 : ");
            int javaScore = sc.nextInt();

            System.out.print("DBMS 점수 : ");
            int dbmsScore = sc.nextInt();

            System.out.print("HTML 점수 : ");
            int htmlScore = sc.nextInt();
            sc.nextLine(); // 버퍼 제거

            students[i] = new Student(name, major, javaScore, dbmsScore, htmlScore);
        }

        System.out.println("\n===== 성적 출력 =====");
        for (Student s : students) {
            System.out.println(s.getName() + "님의 전공은 " + s.getMajor().getKoreanName() + "입니다.");
            System.out.println("총점: " + s.getTotalScore() + "점");
            System.out.println("평균: " + s.getAverageScore() + "점\n");
        }
    }
}
