
public class ThreadTest {

	private static int counter = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			Thread t1 = new Thread(() -> increment());
			Thread t2 = new Thread(() -> increment());
			
			t1.start();
			t2.start();
		}

		System.out.println("Final count is: " + counter);
	}

	private static void increment() {
		counter++;
	}
}
