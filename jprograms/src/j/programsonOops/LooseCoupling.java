package j.programsonOops;

class Plane1 {

	void takeOff() {
		System.out.println("Palne tookoff");
	}

	void fly() {
		System.out.println("Palne is flying");
	}

	void land() {
		System.out.println("Palne landed on station");
	}
}

class CargoPlane2 extends Plane {

	void fly() {
		System.out.println("Palne is flying on low height");
	}

	void carryPass() {
		System.out.println("Carry Passanger");
	}

}

class PassengerPlane3 extends Plane {

	void fly() {
		System.out.println("Palne is flying on Medium height");
	}

}

class FighterPlane4 extends Plane {

	void fly() {
		System.out.println("Palne is flying Super Fast");
	}

	void carryWep() {
		System.out.println("Carry Weapons");
	}

}

public class LooseCoupling {

	public static void main(String[] args) {

		FighterPlane4 fp = new FighterPlane4();
//		fp.takeOff();
//		fp.fly();
//		fp.land();
		PassengerPlane3 pp = new PassengerPlane3();
		CargoPlane2 cp = new CargoPlane2();

		Plane ref; // loose coupling
		ref = fp;
		ref.fly();
		((FighterPlane4) (ref)).carryWep(); // Down Casting

		ref = pp;
		ref.fly();

		ref = cp;
		ref.fly();
		((CargoPlane2) (ref)).carryPass(); // Down Casting

		System.out.println();
		Plane cp1 = new CargoPlane(); // Up Casting
		((CargoPlane) (cp1)).carryPass(); // downcasting
		cp1.fly();
	}

}
