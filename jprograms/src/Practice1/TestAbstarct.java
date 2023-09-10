package Practice1;

abstract class Calculator {

	void add() {
		System.out.println("Concreat method Add");
	}

	void sub() {
		System.out.println("Conceat method sub");
	}

	public abstract void mul();

}

class ImplementationClass extends Calculator {

	public void mul() {
		System.out.println("Overriden Abstract class Method mul");
	}
}

public class TestAbstarct {

	public static void main(String[] args) {
		ImplementationClass obj = new ImplementationClass();
		obj.mul();
		obj.add();
		obj.sub();
	}
}
