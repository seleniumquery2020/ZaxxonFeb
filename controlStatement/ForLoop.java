package controlStatement;

public class ForLoop {
	
	public static void main(String[] args) {
		
		char[] ch = {'a','b','c','d','e','f','g','h'};
		
		
		/*System.out.println("Array Using for each loop");
		 * for(char c : ch) {
		 * 
		 * System.out.println(c);
		 * 
		 * }
		 */
		  
		  
		System.out.println("Array iteration using while loop");
		int index = 0;
		int length = ch.length;		
		
		  while(index < length) { 
			  System.out.println(ch[index]);
			  index++;
		  
		  }
		
		
		System.out.println("Array iteration using Do-while loop");
		  do {
			System.out.println(ch[index]); 
			index++;
		}while(index < length);
		  
		  
		  
		System.out.println("Array iteration using for loop");
	    //for(initialize ;	condition ;inc/dec){}
		for (int i = 0; i < ch.length; i++) {

			System.out.println(ch[i]);
		}
	}

}
