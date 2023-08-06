package j.programsonOops;

class Demo1 { // Parent
	int a = 10;

}

class Demo2 extends Demo1 { // Child

	void display() {
		System.out.println(a);
	}
}

public class SingleLvlInheritance1 {

	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.display();
	}

}
