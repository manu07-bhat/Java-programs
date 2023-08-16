package j.programsonOops;

import java.io.FileInputStream;

public class RunTimeError {

	void fun1() {
		fun1(); // Stack Overflow error
	}

	void fun2() {
		int ar[] = new int[Integer.MAX_VALUE]; // Out of memory error
	}

	public static void main(String[] args) {
		RunTimeError obj = new RunTimeError();
//		obj.fun1();
//		obj.fun2();

//		FileInputStream f = new FileInputStream("input.txt");
	}

}
