package j.threads;

//Simple program about Thread and Demon Thread
class Parent1 extends Thread {

	public void run() {
		System.out.println("Typing is started");
		for (int i = 0; i < 5; i++) {
			System.out.println("typing ...");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Typing is completed");
	}
}

class Parent2 extends Thread {
	public void run() {
		System.out.println("Code copleted started");

		for (;;) {
			System.out.println("code completion ...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Parent3 extends Thread {
	public void run() {
		System.out.println("Auto saving started");

		for (;;) {
			System.out.println("auto saving completion ...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class ThreadProgram4 {

	public static void main(String[] args) {

		Parent1 p1 = new Parent1();
		p1.setName("TYPE");

		Parent2 p2 = new Parent2();
		p2.setName("COMPLETE");
		p2.setDaemon(true);

		Parent3 p3 = new Parent3();
		p3.setName("AUTO SAVING");
		p3.setDaemon(true);

		p1.start();
		p2.start();
		p3.start();
		
	}

}
