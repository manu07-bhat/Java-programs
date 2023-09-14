package j.Collections;

import java.util.LinkedList;

public class StackProgramUsingLinkedList {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
	}

}
