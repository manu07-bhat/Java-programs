package j.programsonOops;

class Customer {
	char gender;
	String city;
	int cId; 
	long Mobile;

	void setDetails(char g) {
		gender = g;
	}

	void setDetails(String c) {
		city = c;
	}

	void setDetails(int id) {
		cId = id;
	}

	void setDetails(long n) {
		Mobile = n;
	}

}

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.gender ='M';
		c1.city = "Mysore";
		c1.cId = 9876;
		c1.Mobile = 987456321;
		
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cId);
		System.out.println(c1.Mobile);
		
		c1.setDetails('F');
		c1.setDetails("Banglore");
		c1.setDetails(6541);
		c1.setDetails(9743747438l);
		System.out.println();
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cId);
		System.out.println(c1.Mobile);
		
		
	}

}
