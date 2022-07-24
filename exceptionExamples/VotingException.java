package exceptionExamples;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) throws RuntimeException{
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your Age = ");
	    int age = scan.nextInt();
	    if(age >= 18)
	      System.out.println("Voting line is open");	
	    else
		  throw new InvalidAgeForVoteException("Age is less than 18");
	}
}


class InvalidAgeForVoteException extends RuntimeException {
	
	public InvalidAgeForVoteException(String message){
		super(message);
	}
	
	
}