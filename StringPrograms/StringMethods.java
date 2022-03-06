package stringStringBufferBuilder;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		String str = new String("Java Program");
		String str1 = new String("Execution");
		char c = str.charAt(5);
		System.out.println(c);
		
		System.out.println(str.charAt(7));
		
		int i = str.codePointAt(5);
		System.out.println(i);
		
		int compare = str.compareTo("Java Program");
		System.out.println("Result of Compare To = "+compare);
		
		
		compare = str.compareTo("Java program");
		System.out.println("Result of Compare To = "+compare);

		compare = str.compareToIgnoreCase("java program");
		System.out.println("Result of Compare To IgnoreCase = "+compare);
		
		System.out.println("String Message "+str);
		System.out.println(str+str1);
		
		String concatString = str.concat(str1);
		System.out.println("Result of Concat Method = "+concatString);
		
		
	}

}
