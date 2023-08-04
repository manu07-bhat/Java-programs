package j.programsonOops;

class Customer3 {
	private int cid;
	private String cname;
	private long cnumber;

	public Customer3() {
		this.cid = 1;
		this.cname = "rocky";
		this.cnumber = 789456l;
	}

	public Customer3(int cid, String cname) {
		this();
		this.cid = 2;
		this.cname = "mega";
	}

	public Customer3(int cid, String cname, long cnumber) {
		this(1, "kan");
//		this.cid = cid;		//resolves Shadowing problem 
//		this.cname = cname;
//		this.cnumber = cnumber;

	}

	public int getid() {

		return cid;
	}

	public String getname() {

		return cname;
	}

	public long getnumber() {

		return cnumber;
	}

}

public class ConstructoreChaining {

	public static void main(String[] args) {
		Customer3 ob = new Customer3(101, "kana", 789456123l);
//		ob.setData(101, "kana", 789456123l);
//		ob.setData(102, "nisha", 894567123l);

		System.out.println(ob.getid() + " " + ob.getname() + " " + ob.getnumber());

	}

}