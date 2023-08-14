package Practice;

interface d1 {

	void p1();

	void p2();

}

class d2 implements d1 {

	public void p1() {
		System.out.println("p1");
	}

	public void p2() {
		System.out.println("p2");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		d2 d = new d2();
		d.p1();
		d.p2();
	}

}
