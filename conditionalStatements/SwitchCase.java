package conditionalStatements;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		switch (number) {		
		case 1:
			System.out.println("One");
		break;
		case 2:
			System.out.println("Two");
		break;
		case 3:
			System.out.println("Three");
		break;
		case 4:
			System.out.println("Four");
		break;
		case 5:
			System.out.println("Five");
		break;
		case 6:
			System.out.println("Six");
		break;
		default :
			System.out.println("Invalid choice");
		break;
		}
	}

}
