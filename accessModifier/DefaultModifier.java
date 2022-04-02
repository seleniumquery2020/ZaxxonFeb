package accessModifier;

class DefaultModifier {

	DefaultModifier() {
		System.out.println("Default Constructor");
	}

	String name = "Default Modifier"; // Global or non-static or Instance Variable

	static String details = "static Default Modifier"; // Global or Static Variable

	void addition() {

		int num1 = 50; // Local variable
		int num2 = 60;

		System.out.println("Addition of 2 numbers = " + (num1 + num2));
	}

	static void subtraction() {

		int num1 = 70; // Local variable
		int num2 = 60;

		System.out.println("Subtraction of 2 numbers = " + (num1 - num2));
	}

	public static void main(String[] args) {

		System.out.println(details);
		subtraction();

		DefaultModifier defaultModifier = new DefaultModifier();
		defaultModifier.addition();
		System.out.println(defaultModifier.name);
	}

	class InnerClass { // InnerClass

	}

}
