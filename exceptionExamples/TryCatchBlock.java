package exceptionExamples;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("Statement 1");

		try {
			System.out.println(5 / 0);
			
		} catch (ArithmeticException e) {
			
			System.out.println(5 / 2);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Statement 2");
	}

}
