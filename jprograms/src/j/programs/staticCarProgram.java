package j.programs;

class Car2 {
	private String name;

	public String getName() {
		return name;
	}
}

public class staticCarProgram {

	public static void main(String[] args) {
		Car2 c = new Car2();

		System.out.println(c.getName());
	}

}
