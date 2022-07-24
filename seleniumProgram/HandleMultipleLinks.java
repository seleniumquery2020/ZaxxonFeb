package seleniumProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleLinks {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		//driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/link.html");

	}
	
	public static void handleLInks() {  
		System.out.println("click on First Link");
		driver.findElement(By.linkText("click here")).click();
		System.out.println("User navigate to "+driver.getTitle() + " screen");
		
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		System.out.println("click on Second Link");
		driver.findElements(By.linkText("click here")).get(1).click();
		System.out.println("User navigate to "+driver.getTitle() + " screen");
		
		
	
	}
	
	public static void getAttributesOfWebElement() {
		
		List<WebElement> links = driver.findElements(By.linkText("click here"));
		
		for(WebElement link : links) {
			if(link.getAttribute("href").contains("fb")) {
				link.click();
			}
		}
	}
	public static void main(String[] args) {
		launchBrowser();
		getAttributesOfWebElement();
	}

}
