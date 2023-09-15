package Practice1;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(40);
		obj.add(90);
		obj.add(10);
		obj.add(25);
		obj.add(68);
		obj.add(10);

		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj); // asc

		Collections.sort(obj, Collections.reverseOrder());
		System.out.println(obj); // dse

	}

}
