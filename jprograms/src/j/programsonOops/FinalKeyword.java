package j.programsonOops;

class Parent {

	final int noOfSeats = 100;

	void property() {
		System.out.println("Parents Property");
	}

	void seats() {
		System.out.println(noOfSeats);
	}
}

final class Child extends Parent {

	void property() {
//		noOfSeats =40;
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		System.out.println(c.noOfSeats);
		c.seats();
		System.out.println(c.noOfSeats + 20);
		c.seats();
		System.out.println(c.noOfSeats);
	}

}
