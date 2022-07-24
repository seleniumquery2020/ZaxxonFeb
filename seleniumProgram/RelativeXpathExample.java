package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}
	
	public static void searchProduct() {
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("AC");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		WebElement searchField = driver.findElement(By.xpath("//input[contains(@title,'Search for')]"));
		System.out.println("Placeholder of search field = "+searchField.getAttribute("placeholder"));
		
		
		System.out.println("Tab Name = "+driver.findElement(By.xpath("//div[contains(text(),'Beauty')]")).getText());
		
		driver.findElement(By.xpath("//div[text()='Top Offers' and @class='xtXmba']")).click();
		
	}
	
	public static void main(String[] args) {
		launchBrowser();
		searchProduct();
	}

}
