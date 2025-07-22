package review;

public class Main {
	public static void main(String[] args) {
//		Main 클래스
//		static 메소드(printInfo())
//		   객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행
		Person p = new Person("홍길동");
		Student s = new Student("신짱구", true);
		Teacher t = new Teacher("김철수");
		Employee e = new Employee("최유리");
		printInfo(p);
		printInfo(s);
		printInfo(t);
		printInfo(e);
		System.out.println(s.isStu());
	}
	
	//static 메소드 정의
	static void printInfo(Person p) {
		p.introduce();
		//조건문(if~else if~else if)
		if(p instanceof Student) {
			//다운캐스팅
			((Student)p).study();
		}else if(p instanceof Teacher) {
			((Teacher)p).teach();
		}else if(p instanceof Employee) {
			((Employee)p).work();
		}
		
	}
	
}












