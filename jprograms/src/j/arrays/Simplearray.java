package j.arrays;

import java.util.Scanner;

public class Simplearray {

	void aD()
	{
		//1 D
		Scanner scan = new Scanner(System.in);
		int []a= new int[6]; //one dimens		
		
		//input
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the age : ");
			a[i] =scan.nextInt();
		}
		
		//output
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Simplearray obj = new Simplearray();
		obj.aD();
		
		

	}

}
