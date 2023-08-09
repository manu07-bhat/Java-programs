package j.programsonOops;

abstract class Plane21 {

	abstract void takeOff();

	abstract void fly(); 

	abstract void land();
}

class CargoPlane21 extends Plane21 {

	void fly() {
		System.out.println("CargoPlane21 is flying");
	}

	void takeOff() {
		System.out.println("CargoPlane21 takeoff");
	}

	void land() {
		System.out.println("CargoPlane21 is Landing");
	}
}

class PassengerPlane21 extends Plane21 {

	void fly() {
		System.out.println("PassengerPlane21 is flying");
	}

	void takeOff() {
		System.out.println("PassengerPlane21 takeoff");
	}

	void land() {
		System.out.println("PassengerPlane21 is Landing");
	}
}

class FighterPlane21 extends Plane21 {

	void fly() {
		System.out.println("FighterPlane21 is flying");
	}

	void takeOff() {
		System.out.println("FighterPlane21 takeoff");
	}

	void land() {
		System.out.println("FighterPlane21 is Landing");
	}
}

class Airport21 {

	static void permit(Plane21 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class AbstractionMethodOverriding {

	public static void main(String[] args) {

		PassengerPlane21 pp = new PassengerPlane21();
		CargoPlane21 cp = new CargoPlane21();
		FighterPlane21 fp = new FighterPlane21();

		Airport21.permit(pp);
		Airport21.permit(cp);
		Airport21.permit(fp);
	}

}
