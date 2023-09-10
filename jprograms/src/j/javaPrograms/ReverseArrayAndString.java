package j.javaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseArrayAndString {

	static void StirngReverse_ArraySort_ReverseArraySort() {
		String ar[] = { "car1", "car2", "car3" };
		String s1 = "";
		String ar2[] = null;

		// input
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("-------------------");
		// output

		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println(ar[i]);
			s1 = s1 + ar[i] + " ";
			ar2 = s1.split(" ", 3);
		}
		System.out.println(s1);

		rev(s1);
		
		//Sorting array in asscending order
		Arrays.sort(ar);
		System.out.println("\n-----------------");

		// Sorting array in descending order
		Arrays.sort(ar, Collections.reverseOrder());

	}

	private static void rev(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		StirngReverse_ArraySort_ReverseArraySort();
	}

}
