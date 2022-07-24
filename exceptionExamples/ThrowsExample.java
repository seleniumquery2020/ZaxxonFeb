package exceptionExamples;

public class ThrowsExample {

	public static void dateTime() throws InterruptedException {

			Thread.sleep(5000);
		
	}

	static void m1() throws InterruptedException {

		dateTime();
	}

	public static void main(String[] args) throws InterruptedException {
		m1();
	}
}
