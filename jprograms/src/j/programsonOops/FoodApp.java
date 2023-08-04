package j.programsonOops;

import java.util.Scanner;

class Customer1 {
	private int cid;
	private String cname;
	private long cnumber;

	public void setData(int a, int cid, String cname, long cnumber) {
		if (cid == a) {
			this.cid = cid;
			this.cname = cname;
			this.cnumber = cnumber;
		}
		else
		{
			System.out.println("Invalid");
			System.exit(0);
		}

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

public class FoodApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer1 ob = new Customer1();
		int a =scan.nextInt();
		
		ob.setData(a,101, "kana", 789456123l);
		ob.setData(a,102, "nisha", 894567123l);

		System.out.println(ob.getid() + " " + ob.getname() + " " + ob.getnumber());
	}

}
