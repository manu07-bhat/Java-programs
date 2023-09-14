package j.Collections;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		// clone method

		ArrayList obj = new ArrayList();

		obj.add(10);
		obj.add("suma");
		obj.add(true);
		obj.add(00.9);
		obj.add(10);

		System.out.println(obj);

		ArrayList b = (ArrayList) obj.clone();

		System.out.println(b);
	}

}
