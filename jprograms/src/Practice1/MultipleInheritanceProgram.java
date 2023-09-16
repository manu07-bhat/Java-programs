package Practice1;

interface Parent1 {

	public void test1();
}

interface Parent2 {

	public void test1();
}

class Child implements Parent1, Parent2 {

	public void test1() {
		System.out.println("Parent 1 method");
	}

	public void test2() {
		System.out.println("Parent 2 method");
	}
}

public class MultipleInheritanceProgram {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test1();
		obj.test2();
	}

}
