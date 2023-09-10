package j.javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSSorting {

	
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(9);
		
		//Sorting arrayList in Asscending order
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
		
		//Sorting arrayList in decending order
		
		Collections.sort(obj , Collections.reverseOrder());
		
		System.out.println(obj);
		
	}

}
