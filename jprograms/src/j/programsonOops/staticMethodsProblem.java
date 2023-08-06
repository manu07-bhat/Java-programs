package j.programsonOops;

class car {

	static float mil;

	static void milestoKm(int s) {
		mil = s * 1.6f;
		System.out.println("Miles : " + mil);
	}

	void calcMileage(int s) {

		if (s == 80) {
			System.out.println("tata");
		} else if (s == 70) {
			System.out.println("Nano");
		} else if (s == 60) {
			System.out.println("bmw");
		} else {
			System.out.println("not listed");
			System.exit(0);
		}
	}
}

public class staticMethodsProblem {

	public static void main(String[] args) {
		car ob = new car();
		int a = 60;
		ob.calcMileage(a);
		car.milestoKm(a);

	}

}
