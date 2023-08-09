package oopsPractice;

class Bike {

	private String Brand;
	private int Mileage;

	public Bike(String brand, int mileage) {
		super();
		Brand = brand;
		Mileage = mileage;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getMileage() {
		return Mileage;
	}

	public void setMileage(int mileage) {
		Mileage = mileage;
	}

}

class Book {
	private String name, author;

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

class Heart {
	private int weight, bpm;

	public Heart(int weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

}

class Brain {

	private int weight;
	private String colour;

	public Brain(int weight, String colour) {
		super();
		this.weight = weight;
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

class Student {
	Heart h = new Heart(289, 72);
	Brain b = new Brain(1400, "Gray");

	void hasABike(Bike ref) {
		System.out.println(ref.getBrand());
		System.out.println(ref.getMileage());
	}

	void hasABook(Book ref) {
		System.out.println(ref.getName());
		System.out.println(ref.getAuthor());
	}

}

public class AggregationCompExample {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.print(s.h.getWeight());
		System.out.println(s.h.getBpm() + "\n");

		System.out.print(s.b.getWeight());
		System.out.println(s.b.getColour() + "\n");

		Bike b = new Bike("KTM", 30);
		Book k = new Book("Ramayana", "Krishna");
		s.hasABike(b);
		s.hasABook(k);

		s = null;

		System.out.println(b.getBrand() + " " + b.getMileage());
		System.out.println(k.getName() + " " + k.getAuthor());
//		s.hasABike(b);		//Exception because  s = null s is pointing to null
//		s.hasABook(k);

	}

}
