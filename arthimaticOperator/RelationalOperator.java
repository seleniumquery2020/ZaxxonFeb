package arthimaticOperator;

public class RelationalOperator {

	static int a = 150;
	static int b = 50;

	public static void lessThan() {
		boolean result = a < b;
		System.out.println("a less than b = " + result);
	}

	public static void greaterThan() {
		boolean result = b > a;
		System.out.println("b greater than a = " + result);
	}

	public static void equalTo() {
		boolean result = a == b;
		System.out.println("a equal to equal to b = " + result);
	}

	public static void lessThanEqualTo() {

		boolean result = a <= b;
		System.out.println("a less than equal to b = " + result);

	}

	public static void greaterThanEqualTo() {
		boolean result = b >= a;
		System.out.println("b greater than equal to a = " + result);
	}

	public static void notEqualTo() {

		 boolean result = a!=b;
		 System.out.println("a is not equal to b = "+result);
	}

	public static void main(String[] args) {
		notEqualTo();
	}
}
