package j.threads;

class Jack extends Thread {

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

public class ThreadProgram3 {

	public static void main(String[] args) {
		System.out.println("Inside the main");
		Jack j1 = new Jack();
		j1.start();
		System.out.println("finished the main ");
	}

}
