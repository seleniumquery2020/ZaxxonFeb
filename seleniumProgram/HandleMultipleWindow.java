package seleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

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

	}

	public static void clickOnProduct() throws InterruptedException {

		String parentWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("Google Home Mini")).click();

		Thread.sleep(7000);

		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		while (itr.hasNext()) {
			String handle = itr.next();
			if (!(handle.equals(parentWindowHandle)))
				
				driver.switchTo().window(handle);
		}

		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		searchProduct();
		clickOnProduct();
	}
}
