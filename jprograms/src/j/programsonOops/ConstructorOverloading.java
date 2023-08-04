package j.programsonOops;

class dummy {
	private int cid;
	private String cname;
	private long cnumber;

	public dummy() {
		this.cid = 2;
		this.cname = "james";
		this.cnumber = 789456123l;

	}

	public dummy(int cid, String cname, long cnumber) {

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

public class ConstructorOverloading {

	public static void main(String[] args) {
		dummy obj = new dummy();
		System.out.println(obj.getid() + " " + obj.getname() + " " + obj.getnumber());
		
		dummy obj2 = new dummy(101, "walter", 987654l);		
		System.out.println(obj2.getid() + " " + obj2.getname() + " " + obj2.getnumber());
	}

}
