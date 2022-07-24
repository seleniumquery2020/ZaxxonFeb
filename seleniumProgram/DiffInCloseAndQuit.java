package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DiffInCloseAndQuit {

	

	public static void launchChromeBrowser() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/CountersignTechnology/WebDrivers/HtmlPage/LoginForm.html");
		Thread.sleep(5000);
		driver.quit();
		System.out.println(driver);
		
		System.setProperty("webdriver.edge.driver", "C:\\CountersignTechnology\\WebDrivers\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/CountersignTechnology/WebDrivers/HtmlPage/LoginForm.html");

	}

	public static void main(String[] args) throws InterruptedException {

		launchChromeBrowser();
		
		
	}
}
