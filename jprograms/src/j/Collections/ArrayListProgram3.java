package j.Collections;

import java.util.ArrayList;

public class ArrayListProgram3 {

	public static void main(String[] args) {

		// retainAll | replaceAll
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add("suma");
		obj.add(true);
		obj.add(00.9);
		obj.add(10);

		System.out.println(obj);

//		obj.replaceAll(e -> ((String) e).toUpperCase()); //gives all uppercase for only String ArrayList

		ArrayList b = new ArrayList();
		b.add(10);
		b.add("suma");

		obj.retainAll(b);

		System.out.println(obj);
	}

}
