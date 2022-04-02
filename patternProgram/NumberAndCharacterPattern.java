package patternProgram;

public class NumberAndCharacterPattern {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
			int num =1 ;
			char ch = 'a';
			
			for( int j = 4; j>i;j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <=i; k++) {
				
				if(i%2 == 0)
					System.out.print(num++ +" ");
				else
					System.out.print(ch++ +" ");	
			}
			System.out.println();
		}
	}

}
