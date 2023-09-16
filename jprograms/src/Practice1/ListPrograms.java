package Practice1;

import java.util.*;

public class ListPrograms {

	public static void main(String[] args) {
		// Index Base Access only for ArraList and LinkedList

		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);

		System.out.println(obj.indexOf(30));
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.indexOf(10));
	}

}
