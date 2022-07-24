package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperations {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	public static void navigationOperation() throws InterruptedException {

		Thread.sleep(5000);
		driver.navigate().to("https://www.myntra.com/");
		
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		driver.navigate().forward();

		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		navigationOperation();
	}
}
