package student;

public class Student extends User {

//	Student (User 상속)
//	필드 : int[] scores (최대 5과목)
//	메서드 : addScore(int score), getAverage()

	// 필드
	private int[] scores;
	private int subCount = 0;

	// 생성자
	public Student(String name, String id) {
		super(name, id);
		this.scores = new int[5];
	}

	// 메소드
	public void addScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("유효하지 않은 점수입니다(0~100점 사이만 허용)");
			return;
		}

		if (subCount >= 5) {
			System.out.println("점수를 추가할 수 없습니다(최대 5과목)");
			return;
		}

		scores[subCount++] = score;
		System.out.println("점수 추가 완료 : " + score);
	}

	public double getAverage() {
		if (subCount == 0) {
			System.out.println("점수가 없습니다");
			return 0.0;
		}

		int sum = 0;
		for (int i = 0; i < subCount; i++) {
			sum += scores[i];
		}

		double avg = (double) sum / subCount;
		System.out.println("평균점수는 " + avg + "입니다");
		return avg;
	}

//	구현 조건
//	점수는 0~100 사이만 허용
//	평균 점수를 출력하는 메서드 구현

}
