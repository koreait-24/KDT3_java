package cinema;

public class Movie {
//	Movie 클래스
//	필드 : title, seatCapacity, currentBooked
//	메서드 : addBooking() → 좌석 수 증가
	
	//필드
	private String title;
	private int seatCapacity; // 총 좌석수
	private int currentBooked; // 현재 좌석수

	//생성자
	public Movie(String title) {
		super();
		this.title = title;
		this.seatCapacity = 30;
		this.currentBooked = 0;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public int getCurrentBooked() {
		return currentBooked;
	}

	public void setCurrentBooked(int currentBooked) {
		this.currentBooked = currentBooked;
	}

	public String getTitle() {
		return title;
	}
	
	//예매 처리 메소드
	public void addBooking() {
		if(currentBooked < seatCapacity) {
			currentBooked++;
		}else {
			System.out.println("예매 실패 " + this.title + "은 매진되었습니다.");
		}
	}
	
//	//예매 가능 여부 메소드
//	public boolean isAvaild() {
//		return currentBooked < seatCapacity;
//	}
	

//	구현 조건
//	영화당 좌석 최대 30석
//	좌석이 가득 차면 예매 불가 메시지 출력
}













