package review;

class A{
	//필드
	int num; //인스턴스 변수
	static int num2; //스태틱 변수
	int result;
	
	
	
	public A() {

	}

	public A(int num) {
		this.num = num;
		int result = num + 10;
		System.out.println(result);
		System.out.println(this.result);
		this.method(result);
	}
	
	void method(int result) {
		System.out.println(result);
	}
}

public class ClassA {
	public static void main(String[] args) {
		A a = new A(10);
//		System.out.println(a);
//		a.method();
	}
}
