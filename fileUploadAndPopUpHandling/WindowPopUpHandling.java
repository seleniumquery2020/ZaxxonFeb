package fileUploadAndPopUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

import frameworkMethods.BaseClass;
import frameworkMethods.WebInteraction;

public class WindowPopUpHandling extends BaseClass {

	public static void main(String[] args) throws AWTException {

		setUp();
		startApplication("https://pdf2doc.com/");
		WebElement uploadFileBtn = WebInteraction.findElement("xpath", "//label[@aria-label='Upload Files']");
		WebInteraction.clickOnElement(uploadFileBtn);
		
		//Copy File Path code
		StringSelection selection = new StringSelection("C:\\Users\\waghs\\Downloads\\Reference Details Form.pdf");
		Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
		board.setContents(selection, null);
		
		//Paste file path Code
		
		Robot rob = new Robot();
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_ENTER);		
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.delay(500);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_ENTER);		
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
