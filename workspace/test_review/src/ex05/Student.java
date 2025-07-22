package ex05;

public class Student extends Person {
//	(3) Student 클래스 정의
//	Person 클래스를 상속받는다.
//	필드
	int javaScore; // 0
	int dbmsScore; // 0
	int htmlScore; // 0
	Major major; // null
//	생성자
//	    이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)

	public Student(String name, int javaScore, int dbmsScore, int htmlScore, Major major) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}

//	메소드
//	    getTotalScore() – 총점 반환
	int getTotalScore() {
		// 정수형 변수 선언 후 리턴
		int total = javaScore + dbmsScore + htmlScore;
		return total;
	}

//	    getAverageScore() – 정수 평균 반환
	// getTotalScore() / 3 반환
	int getAvgScore() {
		return getTotalScore() / 3;
	}

//	    getMajor() – 전공 반환
	Major getMajor() {
		return major;
	}

}
