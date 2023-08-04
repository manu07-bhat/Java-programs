package j.programsonOops;

class Chain {
	private int cid;
	private String cname;
	private long cnum;

	public Chain() {
		cname = "Rohith";
	}

	public Chain(int cid) {
		this();
		this.cid = cid;
	}

	public Chain(int cid, String cname, long cnum) {
		this(cid);

	}

	public int getcid() {
		return cid;
	}

	public String getcname() {
		return cname;
	}

	public long getnum() {
		return cnum;
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Chain c1 = new Chain(10, "rama", 789456123l);

		System.out.println(c1.getcid() + " " + c1.getcname() + " " + c1.getnum());
	}

}
