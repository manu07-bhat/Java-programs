package Practice;

import java.util.Scanner;

class rat {
	int cost;
	String name;
}

public class ReferenceType {
	static Scanner scan = new Scanner(System.in);

	static void array() {

		int[][][] a = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 10, 11, 12 }, { 7, 8, 9 } } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					System.out.print(a[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	static void a3() {
		int[][][] d = { { { 1, 2, 3 }, { 3, 4, 5 } }, { { 11, 22, 33 }, { 44, 55, 66 } } };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				for (int j2 = 0; j2 < d[i][j].length; j2++) {
					System.out.print(d[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	static void switch1() {
		int a = scan.nextInt();

		switch (a) {
		case 1: {
			System.out.println(1);
			break;
		}
		default:
			System.out.println("not in the list");
		}
	}

	public static void main(String[] args) {
		rat a = new rat();
		a.cost = 10;
		a.name = "raju";
		System.out.println(a.cost + " " + a.name);

		rat y = a;
		y.cost = 20;
		y.name = "kana";
		System.out.println(a.cost + " " + a.name);
		System.out.println();
//		a3();
//		array();
		switch1();
	}

}
