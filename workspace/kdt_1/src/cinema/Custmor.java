package cinema;

public class Custmor extends User {

//	Customer (User 상속)
//	필드 : Movie[] bookedMovies (최대 3개)
//	메서드 : bookMovie(Movie movie)

	// 필드
	private Movie[] bookedMovies = new Movie[3];
	private int cnt = 0;

	public Custmor(String userName, String phoneNumber) {
		super(userName, phoneNumber);
	}

	public void bookMove(Movie movie) {
		if (!(movie.getCurrentBooked() < movie.getSeatCapacity())) {
			System.out.println("예매 실패 !" + movie.getTitle() + "은 매진되었습니다.");
			return;
		}

		if (cnt >= 3) {
			System.out.println("예매실패 최대 3편까지 예매가능");
			return;
		}

		bookedMovies[cnt++] = movie;
		movie.addBooking();
		System.out.println("예매 성공 !" + movie.getTitle());
	}

}
