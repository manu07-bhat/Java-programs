package j.arrays;

import java.util.Scanner;

public class Threedarray {


	public static void main(String[] args) {
		int k=2;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int [][][] a =new int[k][3][5];
		
		//input
		System.out.println("Enter the value");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					
					System.out.println("Enter the value of "+i+" Block and "+j+" row "+j2+" column");
					a[i][j][j2] =scan.nextInt();
				}
			}
		}
	
		//output
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					
					System.out.print(a[i][j][j2]+" ");
				}
				System.out.println();
			}
			System.err.println(" |");
		}

	}

}
