package j.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		LinkedHashSet obj = new LinkedHashSet();
		obj.add(10);
		obj.add(30);
		obj.add(30);
		obj.add(null);

		System.out.println(obj);
	}

}
