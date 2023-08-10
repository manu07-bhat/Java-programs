package j.programsonOops;

abstract class Bird {
	abstract void eat();

	abstract void fly();

}

abstract class Eagle extends Bird {

	abstract void eat();

	void fly() {
		System.out.println("Eagle flyes at great Height");
	}
}

class SerpentEagle extends Eagle {

	void eat() {
		System.out.println("Serpent Eagle hunts and eat on Mountain");
	}

}

class GoldenEagle extends Eagle {

	void eat() {
		System.out.println(" Golden Eagle hunts over ocean and eats");

	}
}

public class AbstractBirds {

	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();

		se.eat();
		se.fly();

		ge.eat();
		ge.fly();  
	}

}
