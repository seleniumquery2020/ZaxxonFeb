package exceptionExamples;


public class ExceptionRevision {

	
	public static void main(String[] args) {
		
		int balance = 4000;
		if(balance >= 5000) {
			System.out.println("Withdraw process");
		}else {
        	   throw new ArithmeticException("Withdraw process is not allowed");
          
		}
		
		System.out.println(balance - 500);
		
		final int val ;
	}
}

class ProcessStopException extends RuntimeException{
	
	ProcessStopException(String msg){
		super(msg);
	}
}