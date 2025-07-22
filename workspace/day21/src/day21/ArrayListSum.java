package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListSum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
//		System.out.println(r.nextInt(10) + 1); //1부터 10까지 중 랜덤값
		for(int i = 0; i < 10; i++) {
			list.add(r.nextInt(10) + 1);
		}
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				sum += list.get(i);
			}
		}
		System.out.println(list);
		System.out.println("짝수의 합 : " + sum);
	}
}
