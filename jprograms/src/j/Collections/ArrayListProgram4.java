package j.Collections;

import java.util.ArrayList;

public class ArrayListProgram4 {

	public static void main(String[] args) {
		// set | trimToSize | contains | containsAll | getClass

		ArrayList obj = new ArrayList();
		System.out.println(obj.size());

		obj.add(10);
		obj.add("suma");
		obj.add(true);
		obj.add(00.9);
		obj.add(10);

		System.out.println(obj);

		obj.set(1, 12); // This method will replace the value in given index and delete the old value

		System.out.println(obj);
		System.out.println(obj.size());

		obj.trimToSize(); // it will trim the size according to the ArrayList size
		obj.add(9);
		System.out.println(obj);

		System.out.println(obj.contains(9)); // returns boolean this method will check whether the value is present or
												// not

		ArrayList b = new ArrayList();
		b.add(10);
		b.add(12);
//		b.add(true);
//		b.add(00.9);
//		b.add(10);
//		b.add(9);

		System.out.println(b);
		System.out.println(obj.containsAll(b)); // checks obj contains all the values in b
		System.out.println(b.containsAll(obj)); // vice versa

		System.out.println(b.getClass()); // to know the class name
	}

}
