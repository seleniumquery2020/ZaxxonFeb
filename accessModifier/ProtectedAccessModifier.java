package accessModifier;

public class ProtectedAccessModifier {

	protected ProtectedAccessModifier() {
		System.out.println("Protected Constructor");
	}

	protected String name = "protected Modifier"; // Global or non-static or Instance Variable

	protected static String details = "static protected Modifier"; // Global or Static Variable

	protected void addition() {

		int num1 = 50; // Local variable
		int num2 = 60;

		System.out.println("Addition of 2 numbers = " + (num1 + num2));
	}

	protected static void subtraction() {

		int num1 = 70; // Local variable
		int num2 = 60;

		System.out.println("Subtraction of 2 numbers = " + (num1 - num2));
	}

	public static void main(String[] args) {
		
		System.out.println(details);
		subtraction();
		
		ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
		protectedAccessModifier.addition();
		System.out.println(protectedAccessModifier.name);
	}
	
	protected class InnerClass{  //InnerClass
		
	}
}
