package j.arrays;

import java.util.Scanner;

public class Twodarray {

	public static void main(String[] args) {
		// 2D array
		
		Scanner scan = new Scanner(System.in);
		int[][]	a = new int [2][5];
		
		//input  i = class j = student
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println("Enter the class "+i+" Student "+j);
				a[i][j] =scan.nextInt();
			}
		}
		
		//Output
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(	a[i][j]+" " );
			}
			System.err.print(" | ");
		}
		

	}

}
