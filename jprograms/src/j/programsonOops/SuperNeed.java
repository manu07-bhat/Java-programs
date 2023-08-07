package j.programsonOops;
//Why do we need Super() Method with simple example

class Customer5 {
	private int cid;
	private String name;
	private int num;
	private String addr;

	public Customer5(int cid, String name, int num, String addr) {
		this.cid = cid;
		this.name = name;
		this.num = num;
		this.addr = addr;
	}
}

class RegularCustomer extends Customer5 {
	private float discount;

	public RegularCustomer(int cid, String name, int num, String addr, float discount) {
		super(cid, name, num, addr);
		this.discount = discount;
		System.out.println(cid + " " + name + " " + num);
		System.out.println(addr + " " + discount);

		// Using the Constructor and Super we can acces the Priavte members of the
		// Parent class
	}
}

public class SuperNeed {

	public static void main(String[] args) {
		RegularCustomer obj = new RegularCustomer(1, "harshu", 78946, "banglore", 10);
	}

}
