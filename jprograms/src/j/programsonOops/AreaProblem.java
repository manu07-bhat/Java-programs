package j.programsonOops;

import java.util.Scanner;

abstract class Shapes {
	static float area;

	abstract void acceptInput();

	abstract void calArea();

	void disp() {
		System.out.println(area);
	}

}

class Square extends Shapes {
	float side;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of sides : ");
		side = scan.nextFloat();
	}

	void calArea() {
		area = side * side;
	}

}

class Rectangle extends Shapes {
	float len, bre;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		len = scan.nextFloat();
		System.out.println("Enter the Breath : ");
		bre = scan.nextFloat();
	}

	void calArea() {
		area = len * bre;
	}

}

class Circle1 extends Shapes {
	float radius;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		radius = scan.nextFloat();

	}

	void calArea() {
		area = 3.141f * radius * radius;
	}

}

class Geo {

	static void permit(Shapes ref) {
		ref.acceptInput();
		ref.calArea();
		ref.disp();
	}
}

public class AreaProblem {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle1 c = new Circle1();

		Geo.permit(s);
		Geo.permit(r);
		Geo.permit(c);

	}

}
