package stringStringBufferBuilder;

public class StringExample {
	
	public static void main(String[] args) {
		char ch[] = {'a','b','c','d'};
		//This Strings are stored in SCP
		String s = "";
		String s1 = "Hello";
		String s2 = null;
		String s3 = "Hello";
		
		//This Strings are stored in Heap Memory
		String str = new String(); 		
		String str1 = new String("");		
		String str2 = new String("Value");			
		String str3 = new String(ch); 
		String str4 = new String(str2); 
		String str5 = new String(s1);
		String str6 = new String("Value");	
		
		System.out.println(s1 == s3); //true
		System.out.println(s1 == str5); //false
		System.out.println(str2 == str6); //false
		
		System.out.println(s1.equals(str5)); //true
		
		System.out.println(str2.equals(str6)); //true
	}

}
