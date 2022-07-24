package exceptionExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlockExample {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\CountersignTechnology\\CoreJavaProgram\\src\\keywordsInJava\\Remaining");

		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream(file);
				
			} catch (FileNotFoundException e) {
				
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					
				}
			}
			
	}

}
