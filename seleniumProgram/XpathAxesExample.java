package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesExample {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}
	
	public static void clicksOnFashion() {
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//String s = driver.findElement(By.xpath("//img[@alt='Fashion']/..")).getCssValue("height");
		String s = driver.findElement(By.xpath("//img[@alt='Fashion']/parent::div")).getCssValue("height");
		System.out.println(s);
		
		
		
	}
	
	public static void main(String[] args) {
		launchBrowser();
		clicksOnFashion();
	}

}
