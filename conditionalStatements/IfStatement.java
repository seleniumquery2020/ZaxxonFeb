package conditionalStatements;

import java.util.Scanner;

public class IfStatement {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String s = sc.next();
		
		if(s.equals("Student")) {
			System.out.println("I am a Student");
		}
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age > 18 ) {
			System.out.println("Your are collage Student");
		}
		
		
		
		/* if(Condition using Operator) {
			//Required code/Action
		}*/
	}

}
