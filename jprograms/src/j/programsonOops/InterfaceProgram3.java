package j.programsonOops;

interface Parent11 {

	void div();

	void mult();

}

interface Parent113 {

	void div();

	void mult();

}

interface Parent21 extends Parent11, Parent113{

	void div();

	void mult();
}

class Child11 implements  Parent21 {

	public void div() {
		System.out.println("1");
	}

	public void mult() {
		System.out.println(2);
	}
}

public class InterfaceProgram3 {

	public static void main(String[] args) {
		Child11 o = new Child11();
		o.div();
		o.mult();
	}

}
