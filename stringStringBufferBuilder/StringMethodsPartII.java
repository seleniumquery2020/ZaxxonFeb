package stringStringBufferBuilder;

public class StringMethodsPartII {
	
	
	public static void main(String[] args) {
		
		String str = new String("Automation Testing");
		String str1 = new String(" Selenium WebDriver ");
		
		
		System.out.println(str1.trim());
		
		//str = str.concat(str1); //When we initialize value to string object then only its reflecting 
		System.out.println(str.toUpperCase()); 
		System.out.println(str);
		
		System.out.println(str.indexOf(97)); //index of a = 5
		
		System.out.println("First Index of i = "+str.indexOf('i'));
		
		int firstIndex = str.indexOf('i');
		
		int index = str.indexOf('i',firstIndex+1);
		
		str.indexOf('i', str.indexOf('i') + 1);
		
		System.out.println("Second Index of i = "+index);
		
		System.out.println("String first index = "+str.indexOf("ma"));
		
		System.out.println("String second index = "+str.indexOf("ma",5));
		
		String s = "Working";
		
		boolean  ends = s.endsWith("king");
		System.out.println("Working is ends with ing = "+ends);

		System.out.println("Last Index of i = "+str.lastIndexOf('i'));		
		
		
		System.out.println("Second last Index of i = "+str.lastIndexOf('i',14));
		
		int len = str.length();
		System.out.println("Size of str = "+len);
		
		String replace  = str.replace('t', '7');
		
		System.out.println(str +" => "+replace);
		
		System.out.println(str +" => "+str.replaceAll("n", "N"));
		
		System.out.println(str +" => "+str.replaceFirst("n", "9"));
		
		String arr[] = str.split("t");
		System.out.println("String array Size = "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		String sub = str.substring(0,4);
		System.out.println("SubString = "+sub);
		
		System.out.println("SubString = "+str.substring(11,15));
		
		System.out.println("SubString = "+str.substring(11));
		
		char ch[] = str.toCharArray();
		System.out.println(ch[9]);
		
		byte b = 85;
		int i = b;
		String byteString = String.valueOf(b);
		
		System.out.println("byteString = "+byteString);
	}

}
