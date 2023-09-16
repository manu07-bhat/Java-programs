package Practice1;

import java.util.*;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {
		TreeSet obj = new TreeSet();
		obj.add("java");
		obj.add(null);
		obj.add("hi");
		obj.add(4);
		
		Iterator  itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
