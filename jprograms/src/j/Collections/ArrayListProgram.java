package j.Collections;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();

		// add and addAll method | get | subList | indexOf |lastIndexOf
		obj.add(10);
		obj.add("suma");
		obj.add(true);
		obj.add(00.9);

		System.out.println(obj);
//
//		obj.add(1, "nayana");		// based on Index 
//		System.out.println(obj);
//		ArrayList b1 = new ArrayList();
//
//		b1.add(10);
//		b1.add(33.3);
//		b1.add(false);
//
//		b1.add(2, 20);
//		System.out.println(b1);
//
//		obj.add(b1);
//
//		System.out.println(obj);
//
//		obj.addAll(b1);	//addAll adding 2 ArrayList into Single ArrayList
//
//		System.out.println(obj);
//
//		obj.addAll(obj);
//
//		System.out.println(obj);

		// Particular Index

		System.out.println(obj.get(1));
		Object a = obj.get(0); // Index value
		System.out.println(a);

		// subList //access multiple values of ArrayList
		System.out.println(obj.subList(0, 4)); // range of index

		obj.add(10);
		System.out.println(obj);

		// indexOf is used to find the value of particular index | finds first
		// occurrence
		System.out.println(obj.indexOf(10));

		// lastIndexOf is used to find the value of particular index | finds reverse
		// order occurrence
		System.out.println(obj.lastIndexOf(10));

	}

}
