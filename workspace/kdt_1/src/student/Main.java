package student;

public class Main {
	public static void main(String[] args) {
		
		Student st1 = new Student("경승", "250707");
		System.out.println(st1);
		st1.login();
		
//		st1.addScore(105);
		st1.addScore(100);
		st1.addScore(105);
	}
}
