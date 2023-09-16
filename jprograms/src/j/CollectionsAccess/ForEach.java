package j.CollectionsAccess;

import java.util.*;

public class ForEach {
//ForEach Loop base Access can be access for all the collection
	public static void main(String[] args) {
		LinkedHashSet obj = new LinkedHashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);

		for (Object temp : obj) {
			System.out.println(temp);
		}

	}

}
