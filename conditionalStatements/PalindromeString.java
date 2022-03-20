package conditionalStatements;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("mom");		
		String s = str.toString();
		
		//StringBuffer reverse = str.reverse();
		String s1 = str.reverse().toString();
		
		System.out.println(s+ "  "+s1);
		
		if(s.equals(s1)) {
			System.out.println("String is Palindrome String");
		}else {
			System.out.println("String is not Palindrome String");
		}
		
	}

}
