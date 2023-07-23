package j.arrays;

import java.util.Scanner;

public class Testonarray {

	public static void main(String[] args) {
		// Drawbacks and testing on arrays
		
		Scanner scan = new Scanner(System.in);
		
		int [][]x = new int [3][];
		x[0] = new int [5];
		x[1] = new int [5];
		x[2] = new int [3];
		
		//input
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				x[i][j] = scan.nextInt();
			}
		}
		
		//output
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				System.out.print(x[i][j]+" " );
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n\n");
		
		
	
		
		int []a = new int[	5];
		a[1] = 10;
		a[2] = (int)99.8; //type casting can be done
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		int b[] = {10,22,33,44,55};

		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
			//2D Array
			System.out.println();
			System.out.println();
			int [][]c = {{1,2,3,4},{4,3,2,1},{3,4,2,1}};
			
			for (int j = 0; j < c.length; j++) {
				for (int j2 = 0; j2 < c[j].length; j2++) {
					System.out.print(c[j][j2]+" ");
				}
				System.out.println();
			}
			
			
			//2D array Jagged Array
			System.out.println();
			int [][]c1 = {{1,2,3},{2,1},{3,4,2,1}};
			
			for (int j = 0; j < c1.length; j++) {
				for (int j2 = 0; j2 < c1[j].length; j2++) {
					System.out.print(c1[j][j2]+" ");
				}
				System.out.println();
			}
			
			//3D array
			System.out.println();
			System.out.println();
			int [][][]d = { { {1,2,3},{3,4,5} }, { {11,22,33},{44,55,66} } };
			
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d[i].length; j++) {
					for (int j2 = 0; j2 < d[i][j].length; j2++) {
						System.out.print(d[i][j][j2]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			
		
	}

}
