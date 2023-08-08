package j.programsonOops;

class Plane11 {

	void takeOff() {
		System.out.println("Plane is taking Off");
	}

	void fly() {
		System.out.println("Plane is Flying");
	}

	void land() {
		System.out.println("Plane has landed");
	}
}

class CargoPlane11 extends Plane11 {

	void takeOff() {
		System.out.println("CargoPlane is taking Off");
	}

	void fly() {
		System.out.println("CargoPlane is Flying");
	}

	void land() {
		System.out.println("CargoPlane has landed");
	}

	void carrypass1() {
		System.out.println("Carry Passanger");
	}
}

class PassengerPlane11 extends Plane11 {

	void takeOff() {
		System.out.println("PassengerPlane is taking Off");
	}

	void fly() {
		System.out.println("PassengerPlane is Flying");
	}

	void land() {
		System.out.println("PassengerPlane has landed");
	}
}

class FighterPlane11 extends Plane11 {

	void takeOff() {
		System.out.println("FighterPlane is taking Off");
	}

	void fly() {
		System.out.println("FighterPlane is Flying");
	}

	void land() {
		System.out.println("FighterPlane has landed");
	}

	void wep() {
		System.out.println("Carry weapons");
	}
}

class Airport {

	static void main(Plane11 ref) {
		System.out.println("------------------------------");
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println("------------------------------");
	}
}

public class PolymorphismProgram {

	public static void main(String[] args) {
		CargoPlane11 cp1 = new CargoPlane11();
		PassengerPlane11 pp1 = new PassengerPlane11();
		FighterPlane11 fp1 = new FighterPlane11();

		Airport.main(cp1);
		Airport.main(pp1);
		Airport.main(fp1);

		/*
		 * CargoPlane11 cp1 = new CargoPlane11(); // tight coupling cp1.takeOff();
		 * cp1.fly(); cp1.land(); cp1.carrypass1();
		 * 
		 * PassengerPlane11 pp1 = new PassengerPlane11(); // tight coupling
		 * pp1.takeOff(); pp1.fly(); pp1.land();
		 * 
		 * FighterPlane11 fp1 = new FighterPlane11(); // tight coupling fp1.takeOff();
		 * fp1.fly(); fp1.land(); fp1.wep();
		 * 
		 * System.out.println("-----------------------------------");
		 * 
		 * Plane11 ref; // Loose Coupling ref = cp1; ref.takeOff(); ref.fly();
		 * ref.land(); ((CargoPlane11) (ref)).carrypass1(); // downCasting
		 * 
		 * ref = pp1; ref.takeOff(); ref.fly(); ref.land();
		 * 
		 * ref = fp1; ref.takeOff(); ref.fly(); ref.land(); ((FighterPlane11)
		 * (ref)).wep(); // downCasting
		 * 
		 * System.out.println("------------------------------------");
		 * 
		 * Plane11 cp2 = new CargoPlane11(); // loose coupling // upcasting
		 * cp2.takeOff(); cp2.fly(); cp2.land(); ((CargoPlane11) (cp2)).carrypass1();
		 * 
		 * Plane11 pp2 = new PassengerPlane11(); // loose coupling pp2.takeOff();
		 * pp2.fly(); pp2.land();
		 * 
		 * Plane11 fp2 = new FighterPlane11(); // loose coupling fp2.takeOff();
		 * fp2.fly(); fp2.land(); ((FighterPlane11) (fp2)).wep(); // DownCasting
		 */

	}

}
