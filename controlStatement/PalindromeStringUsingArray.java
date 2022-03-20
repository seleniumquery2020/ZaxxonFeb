package controlStatement;

public class PalindromeStringUsingArray {

	public static void main(String[] args) {
				
		int arr[] = {1,5,3,6,2,4,8,9,7,10};
		System.out.println(arr);
		
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		System.out.println(ch);
		
		String s = "madam";
		char[] chArray = s.toCharArray();
		String s1 = new String("");
		
		System.out.println("Original String = "+s);
		
		for(int i = chArray.length-1 ; i >= 0; i--) {
			
			s1 = s1+chArray[i];
			
		}
		
		System.out.println("Reverse String = "+s1);
		
		if(s.equals(s1)) {
			System.out.println("String is Palindrome String");
		}else {
			System.out.println("String is not Palindrome String");
		}
		
	}
}
