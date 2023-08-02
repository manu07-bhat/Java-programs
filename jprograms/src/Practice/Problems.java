package Practice;

import java.util.Scanner;

public class Problems {

	static void reverse(String s) {
		// String reverse
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
	}

	static void arraySort(int ar[]) {
		// bubble sort
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {

				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

	static String lSearch(int ar[], int key) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == key) {
				return ar[i] + " " + i;
			}
		}
		return "element not found";
	}

	static int binarySearch(int ar[], int key) {
		int low = 0, high = ar.length - 1, mid = 0;

		while (low <= high) {
			mid = (low+high)/2;
			if (key == ar[mid]) {
				return mid;
			} else if (key > ar[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	String s = scan.nextLine();
//	reverse(s);

//		int r = scan.nextInt();
//		int[] ar = new int[r];
//
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
//		arraySort(ar);

//		int num = scan.nextInt();
//		int s[] = new int[num];
//		for (int i = 0; i < s.length; i++) {
//			s[i] = scan.nextInt();
//		}
//		int key = scan.nextInt();
//		System.out.println(lSearch(s, key));
		
		int key = scan.nextInt();
		int ar[] = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(binarySearch(ar, key));
		

	}

}
