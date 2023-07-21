package j.arrays;

import java.util.Scanner;

public class Jaggedarray {
	Scanner  scan = new Scanner (System.in);
	
	
	void twoD()
	{
		// 2D array
				
				int [][]a = new int[2][];
				
				a[0] = new int[3];
				a[1] = new int[5];
				
				//input
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						a[i][j] = scan.nextInt();
						
					}
				}
				
				//output
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				
	}

	void ThreeD()
	{
		int [][][]b = new int[2][][];
		b[0] = new int[3][];
		b[1] = new int[2][];
		
		b[0][0] = new int[2];
		b[0][1] = new int[3];
		b[0][2] = new int[3];
//		b[0][3] =  new int[4];
		
		b[1][0] = new int[2];
		b[1][1] = new int[3];
		
		//input
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int j2 = 0; j2 < b[i][j].length; j2++) {
					
				
					System.out.println("School "+i+" Class "+j+" Student "+j2 );
					b[i][j][j2] = scan.nextInt();
				}
			}
		}
		
		
		//output
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int j2 = 0; j2 < b[i][j].length; j2++) {
					System.out.print(b[i][j][j2]+" ");
				}
				System.err.println("|");
			}
		}

		
	}
	
	public static void main(String[] args) {
	
		Jaggedarray jag = new Jaggedarray();
		jag.ThreeD();

	}

}
