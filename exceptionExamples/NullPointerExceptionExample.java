package exceptionExamples;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
  
		//ArithmeticException Example
		for (int i = 10; i >= 0; i--) {
			System.out.println(100 / i); //when i = 0 ArithmeticException: / by zero
		}

		//NullPointerException Example
		char ch[] = null;
		ch[0] = 'a'; // Cannot store to char array because "ch" is null
		System.out.println(ch[0]);

		String s = null;
		System.out.println(s.toLowerCase()); // Cannot invoke "String.toLowerCase()" because "s" is null
	}

}
