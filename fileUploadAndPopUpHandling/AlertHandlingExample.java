package fileUploadAndPopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import frameworkMethods.BaseClass;
import frameworkMethods.WebInteraction;

public class AlertHandlingExample extends BaseClass {
	
	
	public static void main(String[] args) {
		
		setUp();
		
		startApplication("http://demo.guru99.com/test/delete_customer.php");
		WebElement inputFld = WebInteraction.findElement("name", "cusid");
		WebInteraction.sendText(inputFld,"78965");
		WebElement submitBtn = WebInteraction.findElement("name", "submit");
		WebInteraction.clickOnElement(submitBtn);
		
		Alert alert = driver.switchTo().alert();
		
		String s = alert.getText();
		System.out.println("Alert Message = "+s);
		
		//alert.dismiss();
		alert.accept();
		
		System.out.println("Second Alert Message = "+alert.getText());
	}

	
	
}
