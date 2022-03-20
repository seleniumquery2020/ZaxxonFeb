package arthimaticOperator;

public class UnaryOperator {

	public static void postIncrement() {

		int i = 10;
		System.out.println(i++);
		System.out.println(i);
	}

	public static void postDecrement() {

		int i = 10;
		System.out.println(i--);
		System.out.println(i);
	}
	
	public static void preDecrement() {


         char c = 'e';
         System.out.println(--c);
	}

	public static void preIncrement() {

		char c = 'e';
        System.out.println(++c);
		
	}

	
	
	public static void main(String[] args) {
		preIncrement();
	}
}
