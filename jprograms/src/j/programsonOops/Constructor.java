package j.programsonOops;

class Customer2 {
	private int cid;
	private String cname;
	private long cnumber;

	public Customer2(int cid, String cname, long cnumber) {

		this.cid = cid;
		this.cname = cname;
		this.cnumber = cnumber;

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

public class Constructor {

	public static void main(String[] args) {
		Customer2 ob = new Customer2(101, "kana", 789456123l);
//		ob.setData(101, "kana", 789456123l);
//		ob.setData(102, "nisha", 894567123l);

		System.out.println(ob.getid() + " " + ob.getname() + " " + ob.getnumber());

	}

}
