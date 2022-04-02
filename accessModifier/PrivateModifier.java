package accessModifier;

public class PrivateModifier {
	
	private PrivateModifier() {
		System.out.println("Private Constructor");
	}
	
	private String name = "private Modifier"; // Global or non-static or Instance Variable

	private static String details = "static private Modifier"; // Global or Static Variable

	private void addition() {

		int num1 = 50; // Local variable
		int num2 = 60;

		System.out.println("Addition of 2 numbers = " + (num1 + num2));
	}

	private static void subtraction() {

		int num1 = 70; // Local variable
		int num2 = 60;

		System.out.println("Subtraction of 2 numbers = " + (num1 - num2));
	}

	public static void main(String[] args) {
		
		System.out.println(details);
		subtraction();
		
		PrivateModifier privateModifier = new PrivateModifier();
		privateModifier.addition();
		System.out.println(privateModifier.name);
	}
	
	private class InnerClass{  //InnerClass
		
	}

}
