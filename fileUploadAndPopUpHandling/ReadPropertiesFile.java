package fileUploadAndPopUpHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File
	("C:\\CountersignTechnology\\CoreJavaProgram\\Files\\StudentDetails.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		//String s = prop.getProperty("name");
		//System.out.println(s);
		
		Set<Object> keys = prop.keySet();
		Iterator itr = keys.iterator();
		
		while (itr.hasNext()) {
			System.out.println(prop.getProperty(itr.next().toString()));
		}
		
	}
}
