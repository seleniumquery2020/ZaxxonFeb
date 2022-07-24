package seleniumProgram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExceptionQue {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		//driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/CountersignTechnology/WebDrivers/HtmlPage/LoginForm.html");

	}

	public static void getLabelsText() {
		
		//System.out.println(driver.findElement(By.tagName("label")).getText()); //NoSuchElementException
		
		driver.findElement(By.tagName("label"));
		  List<WebElement> labels = driver.findElements(By.tagName("label"));
		  
		  System.out.println(labels.size());
		  
		  
		 
	}
	
	
	public static void main(String[] args) {
		launchBrowser();
		getLabelsText();
		
		
	}

}
