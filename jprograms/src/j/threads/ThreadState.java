package j.threads;

public class ThreadState {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		try {
			System.out.println("Main thread executing...");
			Thread.sleep(1000);

			System.out.println("Main thread executing");
			Thread.sleep(1000);
			Thread.currentThread().interrupt();
			System.out.println("Main thread executing....");
			Thread.sleep(1000);
			System.out.println("Main thread executing");

		} catch (Exception e) {
			e.printStackTrace();
			
		}

		System.out.println("Main thread completed");
	}

}
