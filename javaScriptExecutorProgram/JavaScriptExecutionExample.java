package javaScriptExecutorProgram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import frameworkMethods.BaseClass;
import frameworkMethods.WebInteraction;

public class JavaScriptExecutionExample extends BaseClass{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		startApplication("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title");
		System.out.println(title);
		
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		Thread.sleep(3000);
		//js.executeScript("location.reload()");
		
		js.executeScript("document.getElementById('email').value='username';");
		
		WebElement passwordfld = WebInteraction.findElement("xpath", "//input[@type='password']");
		
		
		js.executeScript("arguments[0].value='password';",passwordfld);
		
		WebElement loginBtn = WebInteraction.findElement("xpath", "//button[@name='login']");
		
		js.executeScript("arguments[0].click();",loginBtn);

		
	}
	
	

}
