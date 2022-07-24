package seleniumProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
 
	 static WebDriver driver;
	 
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Page url = "+currentUrl);

		System.out.println("Page Source = "+driver.getPageSource().substring(0, 22));
		
		System.out.println("Page Title = "+driver.getTitle());
		
		//driver.close();
		//driver.quit();
	}

	public static void browserSizeChanges() {
		
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println("Size of window = "+driver.manage().window().getSize());
		driver.manage().window().setSize(new Dimension(500, 400));
		
		System.out.println("Position of window = "+driver.manage().window().getPosition());
		driver.manage().window().setPosition(new Point(100, 200));
		
	}
	
	public static void handleCookies() {
		
		System.out.println("Cookies of window = "+driver.manage().getCookies());
		
		driver.manage().deleteAllCookies();
		
		System.out.println("Cookies of window = "+driver.manage().getCookies());
		
		
	}
	public static void main(String[] args) {
		
		launchBrowser();
		handleCookies();
	}
}
