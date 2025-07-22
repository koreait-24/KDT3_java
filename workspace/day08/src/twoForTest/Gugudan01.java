package twoForTest;

public class Gugudan01 {
    public static void main(String[] args) {
    	//이중for문
    	for(int dan = 2; dan <= 9; dan++) { //바깥for문 dan => 2 ~ 9
    		System.out.println(dan + "단");
    		//안쪽for문 곱해질 변수 i => 1 ~ 9
    		for(int i = 1; i <= 9; i++) {
//    			System.out.println(dan + " x " + i + " = " + (dan * i));
    			System.out.println( dan + ", " + i);
    		}
//    		System.out.println();
    	}
    	
    	System.out.println("===================");
    	for(int i = 1; i <= 9; i++) { //바깥for문 i => 1 ~ 9
    		for(int dan = 2; dan <= 9; dan++) {
    			System.out.printf("%d x %d = %2d\t", dan, i, dan * i);
//    			System.out.print(dan + ", " + i);
    		}
    		System.out.println();
    		
    	}
    }
}
