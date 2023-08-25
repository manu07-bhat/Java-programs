package j.threads;

class Jack1 extends Thread {

	public void run() {

		System.out.println("Inside the thread started execution");
		for (int i = 1; i <= 5; i++) {
			System.out.println("User thread is executing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Inside the thread finished  execution");
	}

}

class Jack2 extends Thread {

	public void run() {
		System.out.println("Demon started executed");
		for (;;) {
			System.out.println("Demon");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.out.println("Demon thread stopped");
	}
}

public class DemonThreadProgram1 {

	public static void main(String[] args) {
		System.out.println("Inside the main");
		Jack j1 = new Jack();
		j1.start();

		Jack2 j2 = new Jack2();
		j2.setDaemon(true);
		j2.start();
		
		System.out.println("finished the main ");

	}

}
