package j.CollectionsAccess;

import java.util.*;

public class ListIterator {
	// List Iterator only used for List Interface | only for ArrayList | LinkedList
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);

		Iterator lit = obj.listIterator(2);
		while (lit.hasNext() == true) {
			System.out.println(lit.next());
		}
	}

}
