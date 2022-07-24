package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandlingOnFlipkart {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}

	public static void searchProduct() throws InterruptedException {

		WebElement bannerAds = driver.findElement(By.xpath("//a[contains(@href,'bannerads')]/../../.."));

		if (bannerAds.isDisplayed()) {
			System.out.println("User navigates to Home screen");
		} else {
			System.err.println("User is not navigating to Home screen");
		}

		driver.findElement(By.name("q")).sendKeys("alexa");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement filtersLbl = driver.findElement(By.xpath("//span[text()='Filters']"));
		if (filtersLbl.isDisplayed()) {
			System.out.println("Filters section is present");
		} else {
			System.err.println("Filters section is not present");
		}

		
		driver.findElement(By.xpath("//div[contains(@title,'4')]//label")).click();
		Thread.sleep(5000);
		
		System.out.println("Element is selected : "+driver.findElement(By.xpath("//div[contains(@title,'4')]//label/input")).isSelected());
	
		
		WebElement clearAll = driver.findElement(By.xpath("(//span[text()='Clear all'])[2]"));
		
		System.out.println("Clear all button is displayed : "+clearAll.isDisplayed());
		
	
	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		searchProduct();

	}
}
