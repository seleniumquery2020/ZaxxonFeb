package exceptionExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class FileNotFoundExceptionExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\CountersignTechnology\\CoreJavaProgram\\src\\keywordsInJava\\Remaining");

		FileInputStream fis = new FileInputStream(file); // Read
			

		/// FileOutputStream fos = new FileOutputStream(file); //Write
		 fis.close();

	}
}
