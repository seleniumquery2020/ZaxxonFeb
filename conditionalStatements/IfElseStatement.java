package conditionalStatements;

import java.util.Scanner;

//If my age is greater than 18 then I am eligible for voting else I am not eligible for voting
public class IfElseStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("I am eligible for voting");
		} else {
			System.out.println("I am not eligible for voting");
		}

	}
}
