package j.CollectionsAccess;

import java.util.*;

public class IteratorProgram {
	// Iterator method can access all the object in collections | it can be used for
	// all the collection 
	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);

		Iterator itr = obj.iterator();
		// using While Loop
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		// Using ForLoop
//		for (int i = 0; i <= obj.size()-1 ; i++) {
//			System.out.println(itr.next());
//		}
	}

}
