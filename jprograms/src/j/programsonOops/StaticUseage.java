package j.programsonOops;

import java.util.Scanner;

class Circle {
	private float r;
	private static float pi;
	private float area;
	

	static {
		pi = 3.141f;		// Mainly used for common fileds  
	}

	public void accecptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r = scan.nextFloat();

	}

	public void area() {
		area = r * r * pi;
	}

	public void display() {
		System.out.println(area);
	}
}

public class StaticUseage {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.accecptInput();
		obj.area();
		obj.display();

		Circle obj1 = new Circle();
		obj1.accecptInput();
		obj1.area();
		obj1.display();
	}

}
