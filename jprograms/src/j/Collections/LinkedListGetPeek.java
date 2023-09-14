package j.Collections;

import java.util.LinkedList;

public class LinkedListGetPeek {

	public static void main(String[] args) {
		// dif between getFirst and peekFirst
		LinkedList ll = new LinkedList();

		System.out.println(ll.peekFirst()); // Null 
		//peekFist introduce in JDK1.6 
		System.out.println(ll); // []
		System.out.println(ll.getFirst()); // Exception NoSuchElementException 
	}

}
