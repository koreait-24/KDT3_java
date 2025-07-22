package method;
//6번 : 메소드 오버로딩1
public class MethodOverloading01 {
	public static void main(String[] args) {
		
		MethodOverloading01 m = new MethodOverloading01();
		m.addInt(10, 20);
		m.addDouble(30.5, 1.1);
	}
	
	//메소드 오버로딩 전
	void addInt(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	void addDouble(double num1, double num2) {
		System.out.println(num1 + num2);
	}
}
