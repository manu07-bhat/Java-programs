package j.threads;

import java.util.Scanner;

class Test1 implements Runnable {

	public void run() {
		System.out.println("Addition started ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second number: ");
		int b = scan.nextInt();

		int c = a + b;
		System.out.println(c);
		System.out.println("Addition is ended");
	}
}

class Test2 implements Runnable {

	public void run() {
		System.out.println("Printing char started");
		for (int i = 65; i <= 75; i++) {
			System.out.println("  " + (char) i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Printing char ended");

	}

}

class Test3 implements Runnable {

	public void run() {
		System.out.println("Printing number started");

		for (int i = 10; i <= 20; i++) {
			System.out.println("    " + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing number ended");
		}

	}
}

public class ThreadsProgram1 {

	public static void main(String[] args) throws Exception {

		Thread t = Thread.currentThread();
		System.out.println(t);

		Test1 t1 = new Test1(); // jobs
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();

//		t1.start(); //error
//		t2.start();
//		t3.start();

		Thread th1 = new Thread(t1); // workers
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);

		th1.start();
		th2.start();
		th3.start();
	}

}
