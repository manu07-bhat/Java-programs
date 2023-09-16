package j.CollectionsAccess;

import java.util.*;

public class DescendingIterator {
	// DescendingIterator works only for LinkedList | ArrayDeque | TreeSet |
	// It will access in reverse Order | Descending Order
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		Iterator x = obj.descendingIterator();

		while (x.hasNext() == true) {
			System.out.println(x.next());
		}
	}

}
