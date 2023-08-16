package Practice;

import java.util.Scanner;

class Stack {
	Scanner scan = new Scanner(System.in);
	int ar[] = new int[5];
	int count = 0;
	int ele;

	void insert() {
		System.out.println("How many element to insert");
		ele = scan.nextInt();
		if (count < ar.length) {
			for (int i = 0; i < ele; i++) {
				ar[i] = scan.nextInt();
				count++;
			}

			System.out.println(ele + " Element inserted");
		} else {
			System.out.println("Stack is full");
		}
	}

	void remove() {
		int i = 0;
		for (int j1 = 0; j1 < ar.length; j1++) {
			if (ar[j1] != 0) {

				for (int j = i; j < ar.length; j++) {
					if (j == 0) {
						ar[ar.length - i - 1] = 0;
						i++;
						break;
					}
				}
				System.out.println("Element in top deleted");
			}

		}
		System.out.println("Stack is empty");
	}

	void replace() {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("\nWhich element to replace");
		int val = scan.nextInt();
		System.out.println("Value for element position");
		int val2 = scan.nextInt();

		for (int i = 0; i < ar.length; i++) {
			if (val == ar[i]) {
				ar[i] = val2;
			}
		}

	}

	void display() {
		for (int i = 0; i < ele; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}

public class StackProgram {

	static void permit() throws Exception {
		Scanner scan = new Scanner(System.in);
		Stack obj = new Stack();
		boolean flag = true;
		while (flag) {
			System.out.println("\nEnter the choice \n1.Insert\n2.Remove\n3.Replace\n4.display\n5.exit\n\n");
			int key = scan.nextInt();
			switch (key) {
			case 1: {

				obj.insert();
				break;
			}
			case 2: {
				obj.remove();
				break;
			}

			case 3: {
				obj.replace();
				break;
			}

			case 4: {
				obj.display();
				break;
			}
			case 5: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}
	}

	public static void main(String[] args) {
		try {
			permit();
		} catch (Exception e) {
			System.out.println("Invalid Option");
		}
	}

}
