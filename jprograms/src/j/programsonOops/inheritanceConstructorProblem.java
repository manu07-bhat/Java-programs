package j.programsonOops;

class e1 extends Object{

	e1() {
		System.out.println("Inside e1 Constructor");
	}
}

class e2 extends e1 {
	e2() {
		// super();
		System.out.println("Inside e2 Constructor");
	}
}

public class inheritanceConstructorProblem {

	public static void main(String[] args) {
		e2 obj = new e2();

	}

}
