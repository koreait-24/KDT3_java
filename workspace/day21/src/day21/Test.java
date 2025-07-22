package day21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<>();
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
		Iterator<Object> i = set.iterator();
		System.out.println(set);
		System.out.println(i);
		
	}
}
