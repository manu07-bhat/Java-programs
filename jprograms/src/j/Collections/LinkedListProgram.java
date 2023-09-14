package j.Collections;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		//add | addFirst |addLast | getFirst |getLast | peek | poll
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20.5);
		ll.add("Java");
		ll.add('h');
		ll.add(true);

		ll.addFirst(40); // Add element to first
		ll.addFirst(60);

		ll.addLast("last"); // Add element to last
		ll.addLast("10");

		System.out.println(ll);
		System.out.println(ll.getFirst());	//gets first element
		System.out.println(ll.getLast());	//gets last element
		System.out.println("----------------------------");
		System.out.println(ll.peekFirst()); //only Retrieve
		System.out.println(ll);
		System.out.println(ll.pollFirst()); //Retrieve and delete 
		System.out.println(ll);
		
		System.out.println("----------------------------");
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
