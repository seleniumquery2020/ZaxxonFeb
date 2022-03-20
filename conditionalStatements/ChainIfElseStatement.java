package conditionalStatements;

import java.util.Scanner;

public class ChainIfElseStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age <= 13) {
			System.out.println("You are a child");
		} else if (age > 13 && age < 18) {
			System.out.println("You are teenager");
		} else if (age >= 18 && age < 50) {
			System.out.println("You are Adult");
		} else {
			System.out.println("You are a Senior Citizen");
		}
	}

}
