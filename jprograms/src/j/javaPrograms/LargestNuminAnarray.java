package j.javaPrograms;

import java.util.Arrays;

public class LargestNuminAnarray {

	static void lar() {
		int ar[] = { 50, 4, 6, 788, 1, 11, 200 };
		int max = Integer.MAX_VALUE;
		int max2 = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (max > ar[i]) {
				max = ar[i];
			}

		}
		System.out.println(max);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != max) {
				if (max2 > ar[i]) {
					max2 = ar[i];
				}
			}

		}
		System.out.println(max2);
	}

	static void lar2() {
		int ar[] = { 50, 4, 6, 788, 1, 11, 200 };
		int max = 0;
		int max2 = 0;
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != max) {
				if (max2 < ar[i]) {
					max2 = ar[i];
				}
			}

		}
		System.out.println(max2);

//		Arrays.sort(ar);
//		System.out.println(ar[ar.length-2]);
	}

	static void copy() {
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		int ar2[] = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}

		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
	}

	public static void main(String[] args) {
		copy();// lar();
//		lar2();
	}

}
