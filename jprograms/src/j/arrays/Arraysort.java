package j.arrays;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		int arr[] = { 10, 20, -50, 40, 30, 12, 90, 33 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
