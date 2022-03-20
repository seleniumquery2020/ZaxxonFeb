package arthimaticOperator;

public class LogicalOperator {

	public static void orOperator() {

		char a = 'a';
		char b = 'b';
		char c = 'a';

		System.out.println("Logical OR Operator = " + (a == c | a == b));
	}

	public static void andOperator() {

		char a = 'a';
		char b = 'a';
		char c = 'a';

		System.out.println("Logical AND Operator = " + (a == c & a == b));
	}

	public static void main(String[] args) {
		orOperator();
		andOperator();
	}
}
