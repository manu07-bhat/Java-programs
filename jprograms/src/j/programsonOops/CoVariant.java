package j.programsonOops;

class Nokia {

}

class OnePlus extends Nokia {

}

class Test1 {

	Nokia fun() { // Co - variant Method Overriding
		System.out.println("Inside Parent Test1");
		Nokia n = new Nokia();
		return n;
	}
}

class Test2 extends Test1 {
	OnePlus fun() {
		System.out.println("Inside Child Test2");
		OnePlus p = new OnePlus();
		return p;
	}
}

public class CoVariant {

	public static void main(String[] args) {

	}

}
