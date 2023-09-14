package j.Collections;

import java.util.ArrayDeque;

public class ArrayDequeForQueue {

	public static void main(String[] args) {

		// queue program //array dqque in java
		ArrayDeque d1 = new ArrayDeque();
		d1.add(10);
		d1.add(20);
		d1.add(30);

		System.out.println(d1);
		System.out.println(d1.pollFirst());
		System.out.println(d1.pollFirst());
		System.out.println(d1.pollFirst());
		System.out.println(d1.pollFirst());
		System.out.println("-------------------");

		ArrayDeque d2 = new ArrayDeque();// deletion from both the side
		d2.add(10);
		d2.add(20);
		d2.add(30);
		System.out.println(d2);
		System.out.println(d2.pollLast());
		System.out.println(d2.pollLast());
		System.out.println(d2.pollLast());
		System.out.println(d2.pollLast());

	}

}
