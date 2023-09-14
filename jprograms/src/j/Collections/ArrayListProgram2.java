package j.Collections;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) {
		// remove | removeAll |Passing object |clear
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add("suma");
		obj.add(true);
		obj.add(00.9);
		obj.add(10);
		obj.add(10);
		obj.add(10);
		obj.add(10);
		obj.add(10);
		obj.add(10);
		System.out.println(obj);

		obj.remove(4); // Index position

		System.out.println(obj);

		obj.remove(new Integer(10)); // passing object
		System.out.println(obj);

		ArrayList b = new ArrayList();
		b.add(10);

		obj.removeAll(b);
		System.out.println(obj); // removeAll will remove similar values in ArrayList

		obj.clear(); // clears the whole elements in ArrayList
		System.out.println(obj);

	}

}
