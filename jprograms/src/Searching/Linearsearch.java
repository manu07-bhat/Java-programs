package Searching;

import java.util.Arrays;

public class Linearsearch {

	public static int linearSearch(int a1[], int key1) {
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == key1) {

				return i;
			}
		}
		return -1;

	}

	public static int binarySearch(int a1[], int key1) {

		int low = 0, high = a1.length - 1, mid = 0; //mid is index

		while (low <= high) {
			mid = (low + high) / 2;
			if (key1 == a1[mid]) {
				return mid;
			} else if (key1 < a1[mid]) {
				high = mid-1;
//				low = low;
			} else {
				low = mid + 1;
//				high = high;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a = {90,40,50,-10,20};
		Arrays.sort(a);
		
		int key = -10;
		System.out.println(binarySearch(a, key));
	}

}
