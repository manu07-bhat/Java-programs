package j.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class Exm {
	public void fun1() throws ArrayIndexOutOfBoundsException {

	}

}

class Exm1 extends Exm {
	public void fun1() throws ArithmeticException {
		System.out.println("Inside fun1");
	}
}

public class LiskosPrinciple {

	public static void main(String[] args) {
		Exm1 obj = new Exm1();
		obj.fun1();
	}

}
