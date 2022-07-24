package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebElementHandling {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		//driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/CountersignTechnology/WebDrivers/HtmlPage/LoginForm.html");

	}

	public static void sendLoginDetails() throws InterruptedException {

		String str = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Page title = " + str);

		
		  WebElement firstNameTxtField = driver.findElement(By.id("fname"));
		  
		  firstNameTxtField.sendKeys("selenium");
		  
		  
		  
		  WebElement lastNameTxtField = driver.findElement(By.name("lname"));
		  
		  lastNameTxtField.sendKeys("webdriver");
		  
			driver.findElement(By.className("submitclick")).click();
		 

	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		sendLoginDetails();
	}

}
