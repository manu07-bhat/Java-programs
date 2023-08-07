package j.programsonOops;

class Plane {

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

class CargoPlane extends Plane {

	void fly() {
		System.out.println("Palne is flying on low height");
	}

	void carryPass() {
		System.out.println("Carry Passanger");
	}

}

class PassengerPlane extends Plane {

	void fly() {
		System.out.println("Palne is flying on Medium height");
	}

}

class FighterPlane extends Plane {

	void fly() {
		System.out.println("Palne is flying Super Fast");
	}

}

public class MethodOverride {

	public static void main(String[] args) {

		FighterPlane ob = new FighterPlane();
//		ob.carryPass();
		ob.takeOff();
		ob.fly();
		ob.land();

	}

}
