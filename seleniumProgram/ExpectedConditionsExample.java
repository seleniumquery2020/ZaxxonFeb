package seleniumProgram;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionsExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	}

	public static void applyWait() throws InterruptedException {

		driver.findElement(By.tagName("button")).click();

		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.pollingEvery(300, TimeUnit.MILLISECONDS);

		wait.withMessage("Text is not visible in 10 seconds");

		WebElement elementText = driver.findElement(By.cssSelector("#demo"));
		
		wait.until(ExpectedConditions.textToBe(By.cssSelector("#demo"), "WebDriver"));
		
		System.out.println("Final result = :"+elementText.getText());

	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		applyWait();
		driver.close();
	}
}
