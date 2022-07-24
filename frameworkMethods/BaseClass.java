package frameworkMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void startApplication(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void tearDown() {

		driver.close();
	}

}
