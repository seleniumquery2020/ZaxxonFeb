package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse {

	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Who are you? (Animal/Human)");
		String category = scan.next();
		System.out.println("I am "+category);
		
		if(category.equalsIgnoreCase("Animal")) {			
			System.out.println("are you pet or Wild Animal?");
			String subCategory = scan.next();
			if(subCategory.equalsIgnoreCase("pet")) 
				System.out.println("Stay in pet house");
			else if(subCategory.equalsIgnoreCase("wild")) 
				System.out.println("Stay in Forest");
			else
				System.out.println("Invalid subCategory");
			
		}else if(category.equalsIgnoreCase("Human")) {
			
			System.out.println("Are you male/Female?");
			char c = scan.next().charAt(0);
			if(c == 'f' || c == 'F')
				System.out.println("I am a girl");
			else if(c == 'm' || c == 'M')
				System.out.println("I am a boy");
			else
				System.out.println("Invalid subCategory");
		}else {
			System.out.println("Invalid Category");
		}		
	}
}
