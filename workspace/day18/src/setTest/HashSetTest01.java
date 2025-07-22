package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
//		List<String> animal = new ArrayList<>();
//		animal.add("하마");
//		animal.add("치타");
//		animal.add("하마1");
//		animal.add("하마1");
//		animal.add("하마1");
//		System.out.println(animal);

		HashSet<String> animalSet = new HashSet<>();

		animalSet.add("하마");
		animalSet.add("코알라");
		animalSet.add("치타");
		animalSet.add("호랑이");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("하마");
		System.out.println(animalSet);
		System.out.println(animalSet.toString());

		// Iterator : 반복자
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter);

		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());

//		System.out.println(animalIter.next()); 
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); //false
//		System.out.println(animalIter.next()); //예외발생
		while (animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}

	}
}
