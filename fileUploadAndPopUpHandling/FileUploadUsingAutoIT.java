package fileUploadAndPopUpHandling;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import frameworkMethods.BaseClass;
import frameworkMethods.WebInteraction;

public class FileUploadUsingAutoIT extends BaseClass{

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		setUp();
		startApplication("https://pdf2doc.com/");
		WebElement uploadFileBtn = WebInteraction.findElement("xpath", "//label[@aria-label='Upload Files']");
		WebInteraction.clickOnElement(uploadFileBtn);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\CountersignTechnology\\WebDrivers\\AutoIT\\PdfFileUpload.exe");
		
	}
	
}
