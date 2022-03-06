package stringStringBufferBuilder;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer();
		StringBuffer buff1 = new StringBuffer("Java");
		String s = "Program";
		StringBuffer buff2 = new StringBuffer(s);
		StringBuffer buff3 = new StringBuffer(buff1);
		

		/*
		 * System.out.println(buff); System.out.println(buff1);
		 * System.out.println(buff2); System.out.println(buff3);
		 */
		
		
		System.out.println(s);		
		s = s.concat(" Execution");
		System.out.println(s);
		
		System.out.println(buff1);
		buff1.append(5.14);
		System.out.println(buff1);
		
		
	}

}
