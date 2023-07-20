package j.programs;

class car1 {
	String name ="Honda";
	int cost = 40_000;
	
	void modif(car1 y)
	{
		y.name ="Hero";
		y.cost = 10_000;
	}
}


public class Passbyreference {
	

	public static void main(String[] args) {
		// Pass by reference
		car1 ref = new car1();
		ref.name ="City";
		ref.cost = 30_000;
		
		System.out.println(ref.name+" "+ref.cost);
		
		ref.modif(ref); //goes to modif method / Function
		
		System.out.println(ref.name+" "+ref.cost);
	}

}
