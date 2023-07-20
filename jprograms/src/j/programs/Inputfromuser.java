package j.programs;

import java.util.Scanner;

public class Inputfromuser {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the ID");
		int id = scan.nextInt();

		System.out.println("Enter the name");
		String name = scan.next();

	
		
		System.out.println("Enter the City");
		String city = scan.next();
		System.out.println(id+"\n"+name+"\n"+city);
		
		

	}

}
