package patternProgram;

public class TriangleShape {
	
	public static void main(String[] args) {
		//for loop for row
		for (int i = 0; i < 4; i++) {
			
			char c = 'a';
			
			//for loop for space
			 for (int j = 4; j > i ; j--) {
				System.out.print(" ");
			}
			 
			//for loop for Character
			 for (int k = 0; k <= i ; k++) {
				System.out.print(c++ + " ");
			}
			 
			 
			 System.out.println();
		}
	}

}
