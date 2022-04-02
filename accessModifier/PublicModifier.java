package accessModifier;

public class PublicModifier {

	public PublicModifier() {
		
		System.out.println("Public Constructor");
	}
	
	public String name = "Public Modifier"; //Global or non-static or Instance Variable
	
	public static String details = "static public Modifier"; //Global or Static Variable

	public void addition() {
		
		int num1 = 50; //Local variable
		int num2 = 60;
		
		System.out.println("Addition of 2 numbers = "+ (num1+num2));
	}
	
	public static void subtraction() {
		
	 	int num1 = 70; //Local variable
		int num2 = 60;
		
		System.out.println("Subtraction of 2 numbers = "+ (num1-num2));
	}

	public static void main(String[] args) {
		
		System.out.println(details);
		subtraction();
		
		PublicModifier publicModifier = new PublicModifier();		
		System.out.println(publicModifier.name);
		publicModifier.addition();
	}
	
}
