package exceptionExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterruptedExceptionExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {			
		
		SimpleDateFormat simple = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		System.out.println(i+" time = "+simple.format(date));
		 Thread.sleep(5000);
	  }
	}

}
