package Practice1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

	public static void main(String[] args) {
		try {
			ArrayList<Integer> obj = new ArrayList<Integer>();
			obj.add(10);
			obj.add(30);
			obj.add(null); // java.lang.NullPointerException:
			obj.add(40);
			obj.add(10);
			obj.add(20);
			obj.add(10);

			System.out.println(obj);
			Collections.sort(obj);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		System.out.println(obj.get(4));
//
//		System.out.println(obj.lastIndexOf(10));
//		System.out.println(obj.indexOf(30));

	}

}
