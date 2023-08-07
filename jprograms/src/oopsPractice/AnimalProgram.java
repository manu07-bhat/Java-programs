package oopsPractice;

class Animal {

	void breathe() {
		System.out.println("Animal is Breathing ");
	}

	void eat() {
		System.out.println("Animal is eating");
	}

	void foodhabbit() {
		System.out.println("Animal has FoodHabit");
	}
}

class Deer extends Animal {
	void eat() {
		System.out.println("Deer grazing and easts");
	}

	void foodhabbit() {
		System.out.println("Deer is herbivorous");
	}

}

class Tiger extends Animal {

	void eat() {
		System.out.println("Tiger hunts and easts");
	}

	void foodhabbit() {
		System.out.println("Deer is Carnivores ");
	}
}

class Monkey extends Animal {

	void eat() {
		System.out.println("Monkey steals and easts");
	}

	void foodhabbit() {
		System.out.println("Monkey is Omnivores  ");
	}
	
	void ani(){
		System.out.println("Sits on tree");
	}
}

public class AnimalProgram {

	 static public void main(String[] args) {
		Monkey mk = new Monkey();
		mk.breathe();
		mk.foodhabbit();
		mk.eat();
		mk.ani();
	}

}
