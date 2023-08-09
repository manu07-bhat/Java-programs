package j.programsonOops;

//Aggregation and Composition
class Charger {
	private int voltage;
	private String brand;

	public Charger(String brand, int voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVoltage() {
		return voltage;
	} 

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

}

class Os {
	private String name;
	private int size;

	public Os() {

	}

	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class Mobile {
	Os os = new Os("Android", 512); // Composition //OS

	void hasACharger(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize() + " \n");

		Charger c = new Charger("OnePlus", 25);
		m.hasACharger(c);

		m = null;
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getSize());
//		m.hasACharger(c);

		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());

	}

}
